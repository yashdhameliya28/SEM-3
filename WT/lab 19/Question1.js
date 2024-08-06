const express = require('express');
const app = express();
app.get('/',(req,res)=>{
    res.send("Hello world")
})

app.listen(9999,()=>{
    console.log("Server start at 9999");
})