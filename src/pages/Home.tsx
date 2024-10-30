import React from 'react';
import { styled } from '@mui/material/styles';
import Paper from '@mui/material/Paper';
import Sidenav from '../components/Sidenav';
import CustomizedTables from '../components/Table';
import { Box } from '@mui/material';

const Item = styled(Paper)(({ theme }) => ({
  backgroundColor: theme.palette.mode === 'dark' ? '#1A2027' : '#fff',
  ...theme.typography.body2,
  padding: theme.spacing(1),
  textAlign: 'center',
  color: theme.palette.text.secondary,
  flexGrow: 1,
})) as typeof Paper;

export default function Home() {
  return (
    <Box display="flex" minHeight="100vh">
      <Item>
        <CustomizedTables />
        <CustomizedTables />
      </Item>
    </Box>
  )
}
