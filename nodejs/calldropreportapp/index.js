import http from 'http'
import data from './callrepo.js'
import url from 'url'

const server=http.createServer((req,res)=>{
    if(req.method=="GET" && req.url=="/allcalls")
     { 
        res.write(JSON.stringify(data.data))
        res.end()
     }
     else if(req.method=="POST" && req.url=="/savecall")
      { 
        req.on("data",(d)=>{
        let calldata=JSON.parse(d)
            data.data.push(calldata)
        })
        res.statusCode=201
        res.write(JSON.stringify(res.statusCode))
        res.write(" data saved")
        res.end()
      }
    else if(req.method=="PATCH" && req.url=="/updatecall") 
    {
        req.on("data",(d)=>{
        let oldlist=data.data
        let calldata=JSON.parse(d)
        let calldropreport1=  oldlist.filter((e)=>e.caller_number!=calldata.caller_number) 
          data.data=[...calldropreport1,calldata]

        })
        res.statusCode=202
        res.write("list updated")
        res.end()
    }
   
    else if(req.method=="DELETE" && req.url=="/deletecall")
     {
        req.on("data",(d)=>{
        let oldlist=data.data
        let calldata=JSON.parse(d)
        let calldropreport1=  oldlist.filter((e)=>e.caller_number!=calldata.caller_number) 
          data.data=[...calldropreport1]

        })
        res.statusCode=203
        res.write("list updated")
        res.end()
     }
     else if(req.method=="PUT" && req.url=="/updatecall")
      { 
        res.statusCode=204
        res.end()
      }
      else 
      {
        res.statusCode=404
        res.end()
            
      }

})

server.listen(5050,()=>{  
    console.log("server started")
})