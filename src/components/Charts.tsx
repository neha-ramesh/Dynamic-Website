import { Box } from "@mui/material";
import Item from "./Item";
import CustomizedTables from "./Table";
import DashedLineChart from "./LineChart";

export default function Charts() {
    return <Box sx={{display: "flex", flexDirection: "row", flexWrap: "wrap", justifyItems: "center", alignItems: "center", width: "100", padding: 1}}>
        <Item sx={{border: "3px solid grey", margin: 2}}>
            <CustomizedTables />
        </Item>

        <Item sx={{ border: "3px solid grey", margin: 2}}>
            <DashedLineChart />
        </Item>

    </Box>

}
