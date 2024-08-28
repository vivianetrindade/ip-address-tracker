import React from 'react'
import { Paper, InputBase, Button } from '@mui/material'
import ArrowForwardIosIcon from '@mui/icons-material/ArrowForwardIos'

const CustomizedInput = () => {
  return (
    <Paper
      sx={{ p: '2px 4px', display: 'flex', alignItems: 'center', width: 400 }}
    >
      <InputBase placeholder="Search for any IP address or domain" fullWidth 
        sx={{ flexGrow: 1, fontSize: '18px' }}
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
        }}
      >
        <ArrowForwardIosIcon style={{ color: 'white' }} />
      </Button>
    </Paper>
  )
}

export default CustomizedInput
