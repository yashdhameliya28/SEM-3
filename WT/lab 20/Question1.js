const express = require('express');
const fs = require('fs');
const app = express();

app.use('/lab18_Question1',(res,req,next)=>{
    console.log("middleware function call at lab 18 and Question1")
    next();
})
app.get('/',(req,res)=>{
    res.send("Hello world")
})
app.get('/about',(req,res)=>{
    // res.setHeader('Contact-Type','text/html')
    fs.readFile('./about.txt',(err,data)=>{
        res.end(data.toString());
    })
})
app.get('/lab18_Question1',(req,res)=>{
    fs.readFile('../lab 18/Question1.js',(err,data)=>{
        res.end(data)
    })
})

app.listen(9989,()=>{
    console.log("Server start at 9989");
})