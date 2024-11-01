import CustomizedTables from '../components/Table';
import { Box, Typography } from '@mui/material';
import SelectAutoWidth from '../components/SelectChart';
import Item from '../components/Item';
import Charts from '../components/Charts';


export default function Home() {
  return (
    <Box sx={{ display: "flex", flexDirection: "column", flexWrap: "wrap", width: "100%"}}>
      <Item sx={{width: "100%"}}>
        <Box sx={{ backgroundColor: 'black', display: 'flex', flexWrap: "wrap", height: "fit-content", width: "100%"}}>
          <Item sx={{ border: "3px solid grey", margin: 2 }}>
            <CustomizedTables />
          </Item>

          <Item sx={{ border: "3px solid grey", margin: 2 }}>
            <CustomizedTables />
          </Item>
        </Box>
      </Item>

      <Item sx={{width: "100%"}}>
        <Box sx={{ display: "flex", flexDirection: "column", flexWrap: "wrap", width: "100%"}}>
          <Item sx={{width: "100%", display: "flex", flexDirection: "row", justifyContent: "center", alignItems: "center"}}>
            <Typography variant='h5'>Select the chart : </Typography>
            <SelectAutoWidth />
          </Item>

          <Item sx={{width: "100%"}}>
            <Charts />
          </Item>
        </Box>
      </Item>

    </Box>
  )
}
