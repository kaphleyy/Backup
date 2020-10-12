const express = require("express");
const socketio = require("socket.io");
const http = require("http");

const router = require("./router");

const app = express();
app.use(router);
const server = http.createServer(app);
const io = socketio(server);
const PORT = process.env.PORT || 5000;
server.listen(PORT, () => console.log(`server started at ${PORT}`));
