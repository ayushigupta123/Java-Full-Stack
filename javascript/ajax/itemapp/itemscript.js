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
                document.getElementById("items").innerHTML+=d.userName+" "+d.emailId+"<br/>"
            }
            //console.log(this.responseText)
        }
    }
    xhtp.open("GET","http://localhost:8089/user",true)
    xhtp.getResponseHeader("Content-Type","application/json")
    xhtp.send()
}

function savedata()
{
    var id= document.getElementById("id").value
    var userName= document.getElementById("userName").value
    var emailId= document.getElementById("emailId").value
    var password= document.getElementById("password").value

    var itemobj={
        "id":id,
        "userName":userName,
        "emailId":emailId,
        "password":password
    }

    var xhtp = new XMLHttpRequest()
    xhtp.onreadystatechange=function(){
        if(this.readyState==4 && this.status==201)
        {
            console.log(this.responseText)
        }
     }
    xhtp.open("POST","http://localhost:8089/user")
    xhtp.setRequestHeader("Content-Type","application/json")
    xhtp.send(JSON.stringify(itemobj))

}