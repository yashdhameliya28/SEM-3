const path = require('path');

console.log(path.dirname('D:/SEM 3/JAVASCRIPT/lab 17'))

console.log(path.basename("D:/SEM 3/JAVASCRIPT/lab 17/Question2.js"))

console.log(path.join('SEM 3', 'Question2.js'))

console.log(path.resolve('SEM 3', 'Question2.js'))

const multiPly = require('./module.js');

console.log(multiPly(2,3))