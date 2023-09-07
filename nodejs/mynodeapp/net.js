import net from 'net'
var client=net.connect({port:5000,host:"localhost"},()=>{
console.log("connected to server")
})
client.on('data',(data)=>{
console.log(data.toString())
client.end()
})