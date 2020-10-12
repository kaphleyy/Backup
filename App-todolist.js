import React, { useState } from "react";
import "./App.css";

// TODO 1.make input field and submit button
//TODO 2. set state for array to add typed elements in the array
//TODO 3. set state to detect the change in the input field
//TODO 4. add the text in the input field when the add button is clicked
//TODO 5. render the array in the body using map function
//TODO

export default function App() {
  var [arr, setArr] = useState(["eat", "code", "repeat"]);
  var [txt, setTxt] = useState("");

  function handleChange(event) {
    const newTxt = event.target.value;
    setTxt(newTxt);
  }
  function handleClick() {
    setArr((prev) => {
      return [...prev, txt];
    });
    setTxt("");
  }

  const arrayComponent = arr.map((elem) => {
    return <li>{elem}</li>;
  });

  return (
    <div className="App">
      {/* <form> */}
      <input type="text" onChange={handleChange} value={txt} />
      <input type="submit" value="Add" onClick={handleClick} />
      {/* </form> */}
      <ul>{arrayComponent}</ul>
    </div>
  );
}
