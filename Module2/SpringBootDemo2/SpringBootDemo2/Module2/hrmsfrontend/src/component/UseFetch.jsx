import React, { useEffect, useState } from 'react'

function UseFetch() {

    const[serverdata,setServerData]=useState([]);

    useEffect(()=>{
     async   function getData(){
            try{
             const serverdata = await fetch("http://localhost:8080/");
             const responseData = await serverdata.text();
             console.log(responseData)
             setServerData(responseData);
            }
            catch(e){
                console.log(e);
            }
        }
        getData();
    },[])
  return (
    <div>UseFetchApi

        <h2>
            {
            JSON.stringify(serverdata)
               }
        </h2>
    </div>
  )
}

export default UseFetch
