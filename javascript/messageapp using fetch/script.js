function fetchData()
 {
 const response=fetch("http://localhost:8080/message")
 response.then(async (e)=>{

 let res=await e.json()
 console.log(res)

    })
 
 }

async function send_data(data)
{
 const response=await fetch("http://localhost:8080/message",{
 method:"POST",
 headers:{
 "Content-Type":"application/json"
        },
 body:JSON.stringify(data)
    })
 if(response.status==200)
     {
 console.log("data saved")
     }
}
send_data({sender:"John",receiver:"Tom",messageText:"Hello"})

fetchData()

function fetchData() {
    const response = fetch("http://localhost:8080/message");
    response.then(async (e) => {
        let res = await e.json();
        console.log(res);
    });
}

async function sendData(data) {
    const response = await fetch("http://localhost:8080/message", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(data)
    });
    
    if (response.status === 200) {
        console.log("Data saved");
    }
}

async function updateData(messageId, updatedData) {
    const response = await fetch(`http://localhost:8080/message`, {
        method: "PATCH",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(updatedData)
    });

    if (response.status === 200) {
        console.log("Data updated");
    }
}


updateData(1, { sender: "John Evans", receiver: "Tom smith", messageText: "Hello" });

fetchData();
