const http = require('http');
const server = http.createServer((req,res)=>{
    res.end("hello");
})

server.listen(2812,()=>{console.log("server start at 2812")})