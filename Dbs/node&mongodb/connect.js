var mongo = require("mongodb");

var mongoClient = mongo.MongoClient;
url = "mongodb://localhost:27017/todoDB";

mongoClient.connect(url, function (err, db) {
  if (err) throw err;
  console.log("Successfully connected");
  var dbo = db.db("todoDB");
  //   dbo.createCollection("customers", function (err, res) {
  //     if (err) throw err;
  //     console.log("Collection created");
  //     db.close();
  //   });
  myObj = { name: "random", add: "Nid" };
  dbo.collection("customers").insertOne(myObj, function (err, res) {
    if (err) throw errr;
    console.log("1 document inserted");
    console.log(res);
    db.close();
  });
});
