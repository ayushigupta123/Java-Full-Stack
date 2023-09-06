function getdata()
{
 var xhtp=new XMLHttpRequest()
 xhtp.onreadystatechange=function(){
 if(this.readyState==4 && this.status==200)
        {
            console.log("status ready")
            var res=this.responseXML
            var itemlist=res.getElementsByTagName("itemname")
            var itemlist=res.getElementsByTagName("price")
            var txt=""
            for(i=0;i<itemlist.length;i++)
            {
                txt+=itemlist[i].childNodes[0].nodeValue+" "+pricelist[i].childNodes[0].nodeValue+<br/>
            }
            document.getElementById("items").innerHTML=txt

            for(x of itemlist)
            {
                console.log(x)
            }
            console.log(itemlist)
        }
 
    }
 xhtp.open("GET","item.xml",true)
 xhtp.send()
 
}