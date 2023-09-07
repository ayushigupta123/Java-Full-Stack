import http from 'http'
const server=http.createServer((req,res)=>{
res.write("Hello from server")
res.end()
})
server.listen(5050)