var mysql = require("mysql");

var con = mysql.createConnection({
  host: "localhost",
  user: "root",
  password: "ChoosePassword",
  database: "todoDB",
  insecureAuth: true,
});

con.connect(function (err) {
  if (err) console.log(err);
  else {
    console.log("Connected");
    var SQL = "ALTER TABLE ADD COLUMN id INT AUTO_INCREMENT PRIMARY_KEY";
    con.query(SQL, function (err, result) {
      if (err) throw err;
      console.log("TABLE altered");
    });
  }
});

// con.out(function (err) {
//   if (err) console.log(err);
//   else console.log("DATABASE CLOSED");
// });
