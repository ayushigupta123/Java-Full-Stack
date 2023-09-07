import express from "express";
import path from "path";
const app =express()
app.use(express.json())
var branchlist=[]


app.get("/",(req,res)=>{
    res.send("Helo from express app")
})

app.get("/home",(req,res)=>{
    res.sendFile('index.html',{root:'c:/expressdemo'})
})

app.post("/data",(req,res)=>{
    console.log(req.body)
})

app.get("/allbranch",(req,res)=>{
    res.send(branchlist)
})

app.post("/addbranch",(req,res)=>{
    branchlist.push(req.body)
    res.send("Branch added sucessfully")
})

app.patch("/updatebranch",(req,res)=>{
    let filter_array=branchlist.filter((e)=>e.branchName!=req.body.branchName)
    branchlist=[...filter_array,req.body]
    res.send("branch updated")
})

app.delete("/deletebranch",(req,res)=>{
    let filter_array=branchlist.filter((e)=>e.branchName!=req.body.branchName)
    branchlist=[...filter_array]
    res.send("branch updated")
})

app.get("/branch/:branchName/:location",(req,res)=>{
    console.log(req.params.branchName)
    console.log(req.params.location)
   })

const server=app.listen(5059,()=>{
    console.log(server.address().address)
    console.log(server.address().port)
})