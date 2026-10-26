import React,{useEffect, useState} from 'react'

function SampleCode(props) {
    const[counter,setCounter]=useState(20);
      const [pointer, setPointer] = useState(100);

    useEffect(()=>{
        console.log("component is render");
         console.log("counter="+counter);
        console.log("pointer="+pointer);
    },[counter,pointer])

    function changeCounter(){
        setCounter(counter+2);
     
    }

    function changePointer(){
           setPointer(pointer-2);

    }
  return (
    <div>
        <h2>counter value={counter}</h2>
        <h2>pointer value={pointer}</h2>
        <button onClick={changeCounter}>counter</button>
        <button onClick={changePointer}>pointer</button>
    </div>

  )
}

export default SampleCode

