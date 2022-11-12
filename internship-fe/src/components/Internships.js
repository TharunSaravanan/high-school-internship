import React, { useEffect, useState } from 'react';
import TextField from '@mui/material/TextField';
import { Container, Paper, Button } from '@material-ui/core';

export default function Internship() {
    const paperStyle={padding:'50px 20px', width:800,margin:"20px auto"}
    const[internships,setInternships]=useState([])

    
  useEffect(()=>{
    fetch("http://localhost:8080/internship/getAll")
    .then(res=>res.json())
    .then((result)=>{
        setInternships(result);
    }
  )
  },[])

  return (
      <Container>
    <h1>Internships</h1>

    <Paper elevation={3} style={paperStyle}>

      {internships.map(internship =>(
        <Paper elevation={6} style={{margin:"10px",padding:"15px", textAlign:"left"}} key={internship.id}>
         <h3>{internship.name}</h3>
         {internship.company} | {internship.city}, {internship.state}
         <br/>
         <br/>
         {internship.shortDescription}
         <br/>
         <br/>
         {internship.type}

        </Paper>
      ))
}


    </Paper>



    </Container>
  );
    }
