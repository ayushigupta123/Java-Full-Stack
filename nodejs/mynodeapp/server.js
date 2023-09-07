import net from "net"
const server=net.createServer((connection)=>{
console.log("client connected")
connection.write("message to client")
})
server.listen(5000,()=>{
console.log("server listening")
})

