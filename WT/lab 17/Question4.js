const child_process = require('child_process');

// child_process.exec('SEM 3',(err,stdout,stdin)=>{
//     console.log(stdout);
// })

child_process.exec('add.java',(err,stdout,stdin)=>{
    console.log(stdout);
})