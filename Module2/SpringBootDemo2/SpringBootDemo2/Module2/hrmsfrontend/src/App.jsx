import { useState } from 'react'
import heroImg from './assets/hero.png'
import reactLogo from './assets/react.svg'
import viteLogo from './assets/vite.svg'
import './App.css'


import SampleCode from './component/SampleCode'
import UseFetch from './component/UseFetch'
function App() {
  const employee=[{
    ename :"yadav",
    empid:"232"
  },

  {
  ename:"tomar",
  empid:"2334"
  }

]
  /*const [count, setCount] = useState(0)*/

  return (
    <div>
        <SampleCode/>
        <UseFetch/>
    </div>
  )
}

export default App
