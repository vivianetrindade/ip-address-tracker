import { useState } from 'react'
import mobileBackground from './assets/pattern-bg-mobile.png'
import desktopBackground from './assets/pattern-bg-desktop.png'
import CustomizedInput from './components/customizedInput'
import './App.css'
import MapComponent from './components/MapComponent'

function App() {
  return (
    <>
      <div className="background-container">
        <img
          src={mobileBackground}
          srcSet={`${mobileBackground} 375w, ${desktopBackground} 1440w`}
          className="responsive-background"
          alt="Responsive background"
        />
        <div className="card">
          <h1 className="title">IP Address Tracker</h1>
          <CustomizedInput />
        </div>
        <MapComponent />
      </div>
      <div>
      </div>
      {/* <h1>Vite + React</h1>

      <p className="read-the-docs">
        Click on the Vite and React logos to learn more
      </p> */}
    </>
  )
}

export default App
