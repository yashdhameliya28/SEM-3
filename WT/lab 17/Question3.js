const fs = require('fs')

//check file is exist---return true/false
// fs.exists("D:/SEM 3/JAVASCRIPT/lab 17/module.java",(data)=>{
//     console.log(data)
// })

//this method return file all details
// fs.stat('Question2.js',(err,data)=>{
//     console.log(data)
// })

//this method read file
// fs.readFile('Question2.js',(err,data)=>{
//     console.log(data.toString())
// })/


//this method use to write a file----argument change--> data also change  
// fs.writeFile('abc.txt','dhameliya',(err)=>{
//     console.log("written file")
// })


//this method use to write a file----argument change--> data append with old file data  
// fs.appendFile('abc.txt', ' yash', (err) => { console.log('file written') })


//for file delete
// fs.unlink('abc.txt',(err)=>{
//     console.log("file deleted");
// })

//rename file
fs.rename('abc.txt','xyz.txt',(err)=>{console.log('rename sucessfully')})