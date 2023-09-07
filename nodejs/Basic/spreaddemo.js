/*
let mynumarrray=[2,45,243,234]
mynumarrray=[11,23,12,...mynumarrray]
console.log(mynumarrray)
*/
function printSum(a,b,...args)
{
    let x=0;
    for(let n of args){
        x+=n
    }
    console.log(x)
}
printSum(12,12,134,24,23,34)

let myarray=[12.35,23,22,66]
let res 