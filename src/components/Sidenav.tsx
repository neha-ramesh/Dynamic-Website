import React from 'react';
import { styled } from '@mui/material/styles';
import Box from '@mui/material/Box';
import List from '@mui/material/List';
import ListItem from '@mui/material/ListItem';
import ListItemText from '@mui/material/ListItemText';
import Divider from '@mui/material/Divider';
import { Typography } from '@mui/material';
import { Link } from 'react-router-dom';

const SidebarContainer = styled(Box)(({ theme }) => ({
  backgroundColor: theme.palette.mode === 'dark' ? '#1A2027' : '#f5f5f5',
  color: theme.palette.text.primary,
  width: '250px',
  minHeight: '100vh',
  padding: theme.spacing(2),
}));

const menuItems = [
  { text: 'Dashboard', path: '/' },
  { text: 'Admin', path: '/admin' },
  { text: 'Client', path: '/client' },
];

export default function Sidenav() {
  return (
    <SidebarContainer>
      <Typography variant="h6" align="center" gutterBottom>
        Decentralized App
      </Typography>
      <Divider />
      <List>
        {menuItems.map((item) => (
          <ListItem
            key={item.text}
            component={Link}
            to={item.path}
            sx={{ color: 'inherit', textDecoration: 'none' }}
          >
            <ListItemText primary={item.text} />
          </ListItem>
        ))}
      </List>
    </SidebarContainer>
  );
};
