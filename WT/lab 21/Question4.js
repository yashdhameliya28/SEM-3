const express = require('express');
const app = express();
const bodyParser = require('body-parser');
app.use(bodyParser.urlencoded({ extended: false }));
students = [

    {
        id: 1,
        name: 'yash',
        age: 19,
        gmail: 'yash@darshan.ac.in'
    },
    {
        id: 2,
        name: 'rudra',
        age: 18,
        gmail: 'rudra@darshan.ac.in'
    },
    {
        id: 3,
        name: 'krish',
        age: 20,
        gmail: 'krish@darshan.ac.in'
    },
    {
        id: 4,
        name: 'utsav',
        age: 18,
        gmail: 'utsav@darshan.ac.in'
    },
]
app.get('/students', (req, res) => {
    res.send(students);
})
app.get('/students/:id', (req, res) => {
    const idToIndex = students.findIndex((stu) => {
        if (stu.id == req.params.id) {
            return true;
        }
    })
    res.send(students[idToIndex]);
})
app.post('/students', (req, res) => {
    students.push(req.body);
    res.send(students);
})
app.delete('/students/:id', (req, res) => {
    const idToDelete = students.findIndex((stu) => {
        if (stu.id == req.params.id) {
            return true;
        }
    })
    students.splice(idToDelete, 1);
    res.send("deleted")
})
app.patch('/students/:id', (req, res) => {
    const idToEdit = students.findIndex(stu => stu.id == req.params.id)
    students[idToEdit] = req.body;
    res.send("Edited")
})
app.listen(3000, () => {
    console.log("Server start at 3000");

})

