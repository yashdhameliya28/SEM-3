const express = require('express');
const app = express();
const bodyParser = require('body-parser');
app.use(bodyParser.urlencoded({ extended: false }));
laptops = [

    {
        id: 1,
        name: 'hp',
        ram: 8,
        storage: 512,
        price: 50000
    },
    {
        id: 2,
        name: 'mac',
        ram: 8,
        storage: 256,
        price: 150000
    },
    {
        id: 3,
        name: 'dell',
        ram: 16,
        storage: 512,
        price: 75000
    },
    {
        id: 4,
        name: 'asus',
        ram: 16,
        storage: 512,
        price: 52000
    },
]
app.get('/laptops', (req, res) => {
    res.send(laptops);
})
app.get('/laptops/:id', (req, res) => {
    const idToIndex = laptops.findIndex((stu) => {
        if (stu.id == req.params.id) {
            return true;
        }
    })
    res.send(laptops[idToIndex]);
})
app.post('/laptops', (req, res) => {
    laptops.push(req.body);
    res.send(laptops);
})
app.delete('/laptops/:id', (req, res) => {
    const idToDelete = laptops.findIndex((stu) => {
        if (stu.id == req.params.id) {
            return true;
        }
    })
    laptops.splice(idToDelete, 1);
    res.send("deleted")
})
app.patch('/laptops/:id', (req, res) => {
    const idToEdit = laptops.findIndex(stu => stu.id == req.params.id)
    laptops[idToEdit] = req.body;
    res.send("Edited")
})
app.listen(3000, () => {
    console.log("Server start at 3000");

})

