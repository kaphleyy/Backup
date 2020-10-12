const express = require("express");
const bodyParser = require("body-parser");
const ejs = require("ejs");
const { urlencoded } = require("body-parser");
port = 3000;
const app = express();

app.use(express.static(__dirname + "/public"));

app.set("view engine", "ejs");

app.use(bodyParser.urlencoded({ extended: true }));

app.get("/", function (req, res) {
  res.sendFile(__dirname + "/public/bmiCalc.html");
});

app.post("/", function (req, res) {
  const height = Number(req.body.height);
  const weight = Number(req.body.weight);
  const bmi = weight / (height * height);
  res.send("your bmi is: " + bmi);
});

app.listen(port, function () {
  console.log(`website visible on http://localhost:${port}`);
});
