import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import App from './App.tsx'
import { ThemeProvider } from '@mui/material/styles'
import { theme } from './styles/theme'
import {APIProvider} from '@vis.gl/react-google-maps';
import './index.css'

createRoot(document.getElementById('root')!).render(
  <StrictMode>
    <APIProvider apiKey={import.meta.env.VITE_GOOGLE_MAPS_API_KEY}>
      <ThemeProvider theme={theme}>
        <App />
      </ThemeProvider>
    </APIProvider>
  </StrictMode>
)
