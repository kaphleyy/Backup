/* eslint-disable jsx-a11y/anchor-is-valid */

import React from 'react';
import {Link} from 'react-router-dom';
import 'bootstrap/dist/css/bootstrap.min.css';
import './fragementStyles.css';

export  function Nav() {
   return (
      <div className= "custom-nav">
<nav className="navbar navbar-expand-lg navbar-dark">
<Link to="/" className="navbar-brand" >LOGO</Link>
<button className="navbar-toggler" type="button" data-toggle="collapse" data-target="#
navbarSupportedContent">
<span className="navbar-toggler-icon"></span>
</button>
<div className="collapse navbar-collapse" id="navbarSupportedContent">
<ul className="navbar-nav mr-auto">

<li className="nav-item active">
<Link to="/" className="nav-link" href="#">Home </Link>
</li>
<li className="nav-item">
<Link to="/contact" className="nav-link" href="#">Contact</Link>
</li>
<li className="nav-item">
<Link to="/about" className="nav-link" href="#">About</Link>
</li>


</ul>
<form className="form-inline my-2 my-lg-0">
<input className="form-control mr-sm-2" type="text" placeholder="Search"/>
<button className="btn btn-outline-success my-2 my-sm-0" type="submit">Find
Stuff</button>
</form>
</div>
</nav>
</div>
   );
}



  export function Footer() {
    return (
        <div class = "footer">
        <h2>Chron</h2> <a class ="top" href ="#">Return to Top</a>  
        <hr class = "footer-hr" />
        
        <div class ="footer-row">
        <h5>About |</h5>
          <a href ="#"><span class= "footer-listelem">Privacy Notice</span> </a>  
            <a href ="#"><span class= "footer-listelem">Interest based Ads</span> </a>
            <a href ="#"><span class= "footer-listelem">Terms of Use</span></a>
            <a href ="#"><span class= "footer-listelem">Our Company</span></a>
            <a href ="#"><span class= "footer-listelem"> careers</span></a>
            <a href ="#"><span class= "footer-listelem"> Advertise With Us</span></a>
            
        </div>
        <div class ="footer-row">
        <h5>Contact |</h5>
            <a href ="#"><span class= "footer-listelem">customer Service</span></a>
            <a href ="#"><span class= "footer-listelem">Newsroom Contacts</span></a>
        </div>
        
        <div class ="footer-row">
        <h5>Connect |</h5>
            <a href ="#"><span class= "footer-listelem">Email Newsletter</span></a>
            <a href ="#"><span class= "footer-listelem">Facebook</span></a>
            <a href ="#"><span class= "footer-listelem">Twitter</span></a>
            <a href ="#"><span class= "footer-listelem">Pinterest</span></a>
            <a href ="#"><span class= "footer-listelem">Google</span></a>
            <a href ="#"><span class= "footer-listelem">Instagram</span></a>
            
        </div>
        <div class ="footer-row">
        <h5>Subscribe |</h5>
            <a href ="#"><span class= "footer-listelem"> iPad app</span></a>
            <a href ="#"><span class= "footer-listelem">eEdition Demo</span></a>
            <a href ="#"><span class= "footer-listelem">Today's eNewspaper</span></a>
        </div>
        
        <hr class = "footer-hr" />
    
    
        <h2>HEREST</h2>
        &copy;Copyright 2020
        </div>
    )
}


export function Card(props) {
    return (
<div class = "card">
   <a href="#"><img className="IMG" src = {props.src} alt = {props.alt} /></a> 
   <div class ="card-body">

      <div class = "title-text">{props.title}</div>
    <p class = "description">{props.description}</p>
    </div>
    
</div>
    );
}


export function cart(props) {
    return (
        <div>
            This is cart.
        </div>
    )
}