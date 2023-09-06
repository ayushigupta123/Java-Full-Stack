function loaddata()
{
    var xhtp = new XMLHttpRequest()
    xhtp.onreadystatechange=function(){
        if(this.readyState==4 && this.status==200)
        {
            console.log("status ready")
            var rest =this.responseText
            var data=JSON.parse(rest)
            for(d of data)
            {
                console.log(d)
                document.getElementById("messages").innerHTML+=d.sender+" "+d.receiver+" "+d.messageText+"<br/>"
            }
            //console.log(this.responseText)
        }
    }
    xhtp.open("GET","http://localhost:8080/message",true)
    xhtp.getResponseHeader("Content-Type","application/json")
    xhtp.send()
}

function savedata()
{
    var sender= document.getElementById("sender").value
    var receiver= document.getElementById("receiver").value
    var messageText= document.getElementById("messageText").value

    var messageobj={
        "sender":sender,
        "receiver":receiver,
        "messageText":messageText
    }

    var xhtp = new XMLHttpRequest()
    xhtp.onreadystatechange=function(){
        if(this.readyState==4 && this.status==200)
        {
            console.log(this.responseText)
        }
     }
    xhtp.open("POST","http://localhost:8080/message")
    xhtp.setRequestHeader("Content-Type","application/json")
    xhtp.send(JSON.stringify(messageobj))

}
function savedata()
{
    var sender= document.getElementById("sender").value
    var receiver= document.getElementById("receiver").value
    var messageText= document.getElementById("messageText").value

    var messageobj={
        "sender":sender,
        "receiver":receiver,
        "messageText":messageText
    }

    var xhtp = new XMLHttpRequest()
    xhtp.onreadystatechange=function(){
        if(this.readyState==4 && this.status==200)
        {
            console.log(this.responseText)
        }
     }
    xhtp.open("POST","http://localhost:8080/message")
    xhtp.setRequestHeader("Content-Type","application/json")
    xhtp.send(JSON.stringify(messageobj))

}

function updatedata(messageId) {
    var sender = document.getElementById("sender").value;
    var receiver = document.getElementById("receiver").value;
    var messageText = document.getElementById("messageText").value;

    var messageobj = {
        "sender": sender,
        "receiver": receiver,
        "messageText": messageText
    };

    var xhtp = new XMLHttpRequest();
    xhtp.onreadystatechange = function () {
        if (this.readyState == 4) {
            if (this.status == 200) {
                console.log("Message updated successfully");
            } else {
                console.error("Failed to update message");
            }
        }
    };
    xhtp.open("PATCH", "http://localhost:8080/message/" + messageId);
    xhtp.setRequestHeader("Content-Type", "application/json");
    xhtp.send(JSON.stringify(messageobj));


}
