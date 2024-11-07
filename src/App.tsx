
import React, { useState } from 'react';
import { ThemeProvider, createTheme } from '@mui/material/styles';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import Home from './pages/Home';
import { CssBaseline, AppBar, Toolbar, Typography, IconButton, Box } from "@mui/material";
import { Brightness4, Brightness7 } from "@mui/icons-material";

function App() {
  const [darkMode, setDarkMode] = useState(true);

  const lightTheme = createTheme({
    palette: {
      mode: 'light',
      primary: {
        main: '#00ff31',
      },
    },
  });

  const darkTheme = createTheme({
    palette: {
      mode: 'dark',
      primary: {
        main: '#005600',
      },
    },
  });

  const handleThemeChange = () => {
    setDarkMode(!darkMode);
  };

  return (
    <ThemeProvider theme={darkMode ? darkTheme : lightTheme}>
      <CssBaseline />

      <AppBar position="static">
        <Toolbar sx={{backgroundColor: 'primary.main'}}>
          <Typography variant="h6" component="div" sx={{ flexGrow: 1 }}>
            Decentralized App
          </Typography>
          <Box display="flex" alignItems="center">
            <IconButton onClick={handleThemeChange} color="inherit">
              {darkMode ? <Brightness7 /> : <Brightness4 />}
            </IconButton>
          </Box>
        </Toolbar>
      </AppBar>

      <BrowserRouter>
        <Routes>
          <Route path="/" element={<Home />}></Route>
        </Routes>
      </BrowserRouter>
    </ThemeProvider>
  );
}

export default App;
