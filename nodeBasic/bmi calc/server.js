const bodyParser = require("body-parser");
const express = require("express");

const app = express();
const port = 3000;

app.use("/static", express.static(__dirname + "/public"));

app.use(bodyParser.urlencoded({ extended: true }));

app.get("/", function (req, res) {
  res.sendFile(__dirname + "/public/bmi.html");
});

app.post("/", function (req, res) {
  const h = Number(req.body.h);
  const w = Number(req.body.w);
  const bmi = w / h / h;
  console.log(req);
  res.send("your bmi is " + bmi);
});

app.listen(port, function () {
  console.log(`server started at port https://localhost:${port}`);
});
