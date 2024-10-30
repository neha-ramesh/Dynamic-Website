import React from 'react';
import { styled } from '@mui/material/styles';
import Paper from '@mui/material/Paper';
import Sidenav from '../components/Sidenav';
import CustomizedTables from '../components/Table';
import { Box } from '@mui/material';

const Item = styled(Paper)(({ theme }) => ({
  backgroundColor: theme.palette.mode === 'dark' ? '#18212c' : '#fffff',
  ...theme.typography.body2,
  padding: theme.spacing(1),
  height: 'fit-content',
  width: 'fit-content',
  justifyItems: "center",
  textAlign: 'center',
  color: theme.palette.text.secondary,
  flexGrow: 1,
})) as typeof Paper;

export default function Home() {
  return (
    <Box sx={{backgroundColor: 'primary.main', display: 'flex', flexWrap: "wrap", height: "fit-content", width: "100vw"}}>
      <Item>
        <CustomizedTables />
      </Item>

      <Item>
        <CustomizedTables />
      </Item>
    </Box>
  )
}
