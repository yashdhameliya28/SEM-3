const express = require('express');
const app = express();
const bodyParser = require('body-parser');
app.use(bodyParser.urlencoded({ extended: false }));
books = [

    {
        id: 1,
        name: 'book 1',
        price: 3000
    },
    {
        id: 2,
        name: 'book 2',
        price: 6000
    },
    {
        id: 3,
        name: 'book 3',
        price: 1000
    },
    {
        id: 4,
        name: 'book 4',
        price: 5000
    },
]
app.get('/books', (req, res) => {
    res.send(books);
})
app.get('/books/:id', (req, res) => {
    const idToIndex = books.findIndex((stu) => {
        if (stu.id == req.params.id) {
            return true;
        }
    })
    res.send(books[idToIndex]);
})
app.post('/books', (req, res) => {
    books.push(req.body);
    res.send(books);
})
app.delete('/books/:id', (req, res) => {
    const idToDelete = books.findIndex((stu) => {
        if (stu.id == req.params.id) {
            return true;
        }
    })
    books.splice(idToDelete, 1);
    res.send("deleted")
})
app.patch('/books/:id', (req, res) => {
    const idToEdit = books.findIndex(stu => stu.id == req.params.id)
    books[idToEdit] = req.body;
    res.send("Edited")
})
app.listen(3000, () => {
    console.log("Server start at 3000");

})

