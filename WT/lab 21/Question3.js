const express = require('express');
const app = express();
const bodyParser = require('body-parser');
app.use(bodyParser.urlencoded({ extended: false }));
faculties = [

    {
        id: 1,
        name: 'arjun_bala',
        age: 35,
        gmail: 'arjun_bala@darshan.ac.in'
    },
    {
        id: 2,
        name: 'pradyumansinh_jadeja',
        age: 45,
        gmail: 'pradyumansinh_jadeja@darshan.ac.in'
    },
    {
        id: 3,
        name: 'dixita_kagathara',
        age: 33,
        gmail: 'dixita_kagathara@darshan.ac.in'
    },
    {
        id: 4,
        name: 'shruti_maniar',
        age: 30,
        gmail: 'shruti_maniar@darshan.ac.in'
    },
]
app.get('/faculties', (req, res) => {
    res.send(faculties);
})
app.get('/faculties/:id', (req, res) => {
    const idToIndex = faculties.findIndex((stu) => {
        if (stu.id == req.params.id) {
            return true;
        }
    })
    res.send(faculties[idToIndex]);
})
app.post('/faculties', (req, res) => {
    faculties.push(req.body);
    res.send(faculties);
})
app.delete('/faculties/:id', (req, res) => {
    const idToDelete = faculties.findIndex((stu) => {
        if (stu.id == req.params.id) {
            return true;
        }
    })
    faculties.splice(idToDelete, 1);
    res.send("deleted")
})
app.patch('/faculties/:id', (req, res) => {
    const idToEdit = faculties.findIndex(stu => stu.id == req.params.id)
    faculties[idToEdit] = req.body;
    res.send("Edited")
})
app.listen(3000, () => {
    console.log("Server start at 3000");

})

