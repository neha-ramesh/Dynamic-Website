import React from 'react';
import Home from './pages/Home';
import Sidenav from './components/Sidenav';
import {Routes, Route, BrowserRouter} from 'react-router-dom';
import Client from './pages/Client';
import Admin from './pages/Admin';


export default function App() 
{
  return (
    <>
    <BrowserRouter>
        <Routes>
            <Route path="/" element={<Home />}></Route>
            <Route path="/admin" element={<Admin />}></Route>
            <Route path="/client" element={<Client />}></Route>
        </Routes>
    </BrowserRouter>
    </>
  )
}
