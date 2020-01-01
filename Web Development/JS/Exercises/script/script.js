var bill  = parseInt(prompt("enter your bill amount "));
var today = new Date();
var billDue = new Date(2019,11,30);
var fine = 0;

var day = 1000*60*60*24;

console.log((today-billDue)/day);
if(today<=billDue)
    {
        console.log(fine);
        alert("Bill amount = "+bill+"\nFine = "+fine+"\nTotal Bill = "+(bill+fine));
    }
else{
    console.log(fine);
    fine = Math.round(((today-billDue)/day))*50;
    alert("Bill amount = "+bill+"\nFine = "+fine+"\nTotal Bill = "+(bill+fine));
}