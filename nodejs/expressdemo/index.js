import express from "express";
import path from "path";
import route from "./route.js"

const app =express()
app.use(express.json())
var itemarray=[]

const server=app.listen(5059,()=>{
    console.log(server.address().address)
    console.log(server.address().port)
})

app.use("/coffee",route)

/*


app.get("/",(req,res)=>{
    res.send("Helo from express app")
})

app.get("/home",(req,res)=>{
    res.sendFile('index.html',{root:'c:/expressdemo'})
})

app.post("/data",(req,res)=>{
    console.log(req.body)
})

app.get("/allitems",(req,res)=>{
    res.send(itemarray)
})

app.post("/additem",(req,res)=>{
    itemarray.push(req.body)
    res.send("item added sucessfully")
})

app.patch("/updateitem",(req,res)=>{
    let filter_array=itemarray.filter((e)=>e.itemname!=req.body.itemname)
    itemarray=[...filter_array,req.body]
    res.send("item updated")
})

app.delete("/deleteitem",(req,res)=>{
    let filter_array=itemarray.filter((e)=>e.itemname!=req.body.itemname)
    itemarray=[...filter_array]
    res.send("item updated")
})

app.get("/item/:itemname/:location",(req,res)=>{
    console.log(req.params.itemname)
    console.log(req.params.location)
   })
   */

