import React from 'react';
import {BrowserRouter, Route, Switch} from 'react-router-dom';
import Home from './containers/Home';
import About from './containers/About';
import Contact from './containers/Contact';

function App() {
  return (
<div>
    <BrowserRouter>
    <Switch>
    <Route path="/" exact component = {Home} />
    <Route path="/about" exact component = {About} />
    <Route path="/contact" exact component = {Contact} />
    <Route path="/"  render = {() => <div>404</div>} />
    </Switch>
    </BrowserRouter>
    </div>
   
  );
}

export default App;
