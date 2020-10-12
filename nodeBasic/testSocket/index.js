const express = require("express");
const app = express();
const http = require("http").createServer(app);
const io = require("socket.io")(http);

app.use(express.static(__dirname + "/public"));

app.listen("3000", function () {
  console.log("server started at port 3000");
});

app.get("/", function (req, res) {
  res.sendFile(__dirname + "/public/login.html");
});

app.post("/", function (req, res) {
  res.redirect("/chat");
});

app.get("/chat", function (req, res) {
  res.sendFile(__dirname + "/public/chat.html");
});

io.on("connection", function (socket) {
  socket.on("chat message", function (msg) {
    io.emit("chat message", msg);
  });
});
