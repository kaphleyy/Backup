import logo from './logo.svg';
import './App.css';'
import {BrowserRouter as Router , Switch , Route , Link } from 'react-router-dom';

function App() {
 return (
   <Router>
     <div>
       <nav>
         <ul>
         <li>
           <Link to="/">Home</Link>
         </li>
         <li>
           <Link to="/about">about</Link>
         </li>
         <li>
           <Link to="/users">users</Link>
         </li>
         </ul>
       </nav>

       <switch>
         <Route path ="/about">
           <About/>
         </Route>
         <Route path ="/users">
           <Users/>
         </Route>
         <Route path ="/">
           <Home/>
         </Route>
       </switch>
     </div>
   </Router>

 )
}

function Home() {
  return <h2>Home</h2>
}
function About() {
  return <h2>About</h2>
}
function Users() {
  return <h2>Users</h2>
}


export default App;
