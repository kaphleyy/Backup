const bodyParser = require("body-parser");
const express = require("express");

const app = express();
const port = 3000;

app.use("/static", express.static(__dirname + "/public"));

app.use(bodyParser.urlencoded({ extended: true }));

app.get("/", function (req, res) {
  var today = new Date();
  if (today.getDay() === 0 || today.getDay() === 6) {
    res.send("Yay, its weekend");
  } else {
    res.send("Boo , i have to work");
  }
});

app.listen(port, function () {
  console.log(`server started at port https://localhost:${port}`);
});
