const express = require('express');
const app = express();
app.get('/name',(req,res)=>{
    res.send("My name is yash dhameliya")
})
app.post('/contact',(req,res)=>{
    res.send("my number is 9327117407")
})
app.listen(3500,()=>{
    console.log("server start at 3500")
})