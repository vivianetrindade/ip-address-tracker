import React from 'react'
import {Map} from '@vis.gl/react-google-maps';

const  MapComponent = () => {
  
  return (
    
      <Map 
        // zoom={10} 
        // center={{lat: 53.54992, lng: 10.00678}}
        defaultCenter={{lat: 22.54992, lng: 0}}
        defaultZoom={3}
        renderingType='VECTOR'
        
      />
    
  )
}

export default MapComponent