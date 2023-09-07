import express from "express"

const route =express.Router()

route.use((req,res,next)=>{
    console.log("Time: "+Date.now())
    next()
})

route.get("/",(req,res)=>{
    res.send("you are at base url")
})

route.get("/coffeebeans",(req,res)=>{
    res.send("Yay we have codffe bean")
})

route.get("/about",(req,res)=>{
    res.send("About us")
})

export default route

