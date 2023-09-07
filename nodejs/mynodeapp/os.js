import os from 'os'
console.log("System Architecture ",os.arch())
const cpus=os.cpus()
for(let i=0;i<cpus.length;i++)
{
console.log(cpus[i].model)
console.log(cpus[i].speed)
console.log(cpus[i].times)
}
console.log("Free Memory ",os.freemem())
console.log("Total Memory ",os.totalmem())
console.log("Host Name ",os.hostname())