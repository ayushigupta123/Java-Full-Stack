import fs from 'fs'
fs.writeFile('data1.txt',"Writing data to file",(err)=>{
if(err) console.log(err.code,err.errno,err.syscall)
})
fs.readFile("data1.txt",'utf8',(err,data)=>{
if(err) console.log(err)
else
console.log(data)
})
