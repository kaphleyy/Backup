import React from 'react';
import {Nav , Footer, Card} from '../components/Fragments';
import './homeStyles.css';
import Arr from './imgArr';

import img1 from './assets/1.jpg';
import img2 from './assets/2.jpg';
import img3 from './assets/3.jpg';
import img4 from './assets/4.jpg';import img10 from './assets/10.jpg';
import img5 from './assets/5.jpg';import img11 from './assets/11.jpg';
import img6 from './assets/6.jpg';import img12 from './assets/12.jpg';
import img7 from './assets/7.jpg';import img13 from './assets/13.jpg';
import img8 from './assets/8.jpg';import img14 from './assets/14.jpg';
import img9 from './assets/9.jpg';

export default function Home() {

    const imA = [img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11,img12,img13,img14];
    let i = -1;
      
    return (
        <div className = "home">
            <Nav />
            <div className = "card-list">
                {Arr.map(function({id,title,description,alt} ) {
                    i++;
                    return (
                    <Card key = {id}
                    src ={imA[i]}
                    alt = {alt}
                    title ={title}
                    description={description} />
                )}
                )
                    }
            
            </div>
            <Footer />            
        </div>
    );
}



