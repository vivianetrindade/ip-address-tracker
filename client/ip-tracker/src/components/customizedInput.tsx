import React from 'react'
import { Paper, InputBase, Button } from '@mui/material'
import ArrowForwardIosIcon from '@mui/icons-material/ArrowForwardIos'

const CustomizedInput = () => {
  return (
    <Paper
      className='responsive-paper'
    >
      <InputBase placeholder="Search for any IP address or domain" fullWidth 
        sx={{ flexGrow: 1, fontSize: '18px', width: '50%' }}
      />
      <Button
        aria-label="search"
        style={{
          backgroundColor: 'black',
          width: '50px',
          height: '100%',
          minWidth: 0,
          margin: '-4px -5px',
          borderTopLeftRadius: 0,
          borderBottomLeftRadius: 0,
          border: '2px solid black',
        }}
      >
        <ArrowForwardIosIcon style={{ color: 'white' }} />
      </Button>
    </Paper>
  )
}

export default CustomizedInput
