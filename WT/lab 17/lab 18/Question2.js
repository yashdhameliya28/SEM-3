const http = require('http');
const server1 = http.createServer((req,res)=>{
    res.end("hello from server 1");
})

server1.listen(3000,()=>{console.log("server start at 3000")})

const server2 = http.createServer((req,res)=>{
    res.end("hello from server 2");
})

server2.listen(4000,()=>{console.log("server start at 2000")})

const server3 = http.createServer((req,res)=>{
    res.end("hello from server 3");
})

server3.listen(5000,()=>{console.log("server start at 5000")})

const server4 = http.createServer((req,res)=>{
    res.end("hello from server 4");
})

server4.listen(6000,()=>{console.log("server start at 6000")})

const server5 = http.createServer((req,res)=>{
    res.end("hello from server 5");
})

server5.listen(7000,()=>{console.log("server start at 7000")})