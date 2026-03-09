const express = require('express');
const mongoose = require('mongoose');
const app = express();
const PORT = 3000;

mongoose.connect('mongodb://host.docker.internal:27017/clientes');

const ClienteSchema = new mongoose.Schema({ nombre: String, email: String });
const Cliente = mongoose.model('Cliente', ClienteSchema);

app.get('/clientes', async (req, res) => {
  res.setHeader('Access-Control-Allow-Origin', '*');
  const clientes = await Cliente.find();
  res.json(clientes);
});

app.listen(PORT, () => console.log(`API funcionando en puerto ${PORT}`));