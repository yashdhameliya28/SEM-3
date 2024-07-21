const http = require('http');
const fs = require('fs');

const server = http.createServer((req, res) => {
    (fs.readFile('abc.txt', (err, data) => {
        res.end(data.toString())
    }));
    // (fs.writeFile('xyz.txt','create bt server',(err)=>{console.log(err)}))
    // res.end("file create bt server")
})

server.listen(3000, () => { console.log("server start at 3000") })