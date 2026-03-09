db = db.getSiblingDB('clientes');
db.clientes.insertMany([
  { nombre: "Juan Pérez", email: "juan@example.com" },
  { nombre: "Ana López", email: "ana@example.com" },
  { nombre: "Pedro Fernández", email: "pedro@example.com" }
]);