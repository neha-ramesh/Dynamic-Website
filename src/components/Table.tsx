import * as React from 'react';
import { styled } from '@mui/material/styles';
import Table from '@mui/material/Table';
import TableBody from '@mui/material/TableBody';
import TableCell, { tableCellClasses } from '@mui/material/TableCell';
import TableContainer from '@mui/material/TableContainer';
import TableHead from '@mui/material/TableHead';
import TableRow from '@mui/material/TableRow';
import Paper from '@mui/material/Paper';
import { Padding } from '@mui/icons-material';

const StyledTableCell = styled(TableCell)(({ theme }) => ({
    [`&.${tableCellClasses.head}`]: {
        backgroundColor: theme.palette.common.black,
        color: theme.palette.common.white,
    },
    [`&.${tableCellClasses.body}`]: {
        fontSize: 14,
    },
}));

const StyledTableRow = styled(TableRow)(({ theme }) => ({
    '&:nth-of-type(odd)': {
        backgroundColor: theme.palette.action.hover,
    },
    '&:last-child td, &:last-child th': {
        border: 4,
    },
}));

function createData(
    device_name: string,
    latitude: number,
    longitude: number,
    customer_name: string,
) {
    return { device_name, latitude, longitude, customer_name };
}

const rows = [
    createData('Device 1', 12.3, 45.6, 'Name 1'),
    createData('Device 2', 78.9, 910.11, 'Name 2'),
    createData('Device 3', 12.13, 14.15, 'Name 3'),
    createData('Device 4', 161.7, 18.19, 'Name 4'),
    createData('Device 5', 20.21, 222.3, 'Name 5'),
];

export default function CustomizedTables() {
    return (
        <TableContainer component={Paper} sx={{width: "full"}}>
            <Table aria-label="customized table">
                <TableHead>
                    <TableRow>
                        <StyledTableCell align="center">Device Name</StyledTableCell>
                        <StyledTableCell align="center">Latitude</StyledTableCell>
                        <StyledTableCell align="center">Longitude</StyledTableCell>
                        <StyledTableCell align="center">Customer Name</StyledTableCell>
                    </TableRow>
                </TableHead>
                <TableBody>
                    {rows.map((row) => (
                        <StyledTableRow key={row.device_name}>
                            <StyledTableCell align="center">{row.device_name}</StyledTableCell>
                            <StyledTableCell align="center">{row.latitude}</StyledTableCell>
                            <StyledTableCell align="center">{row.longitude}</StyledTableCell>
                            <StyledTableCell align="center">{row.customer_name}</StyledTableCell>
                        </StyledTableRow>
                    ))}
                </TableBody>
            </Table>
        </TableContainer>
    );
}
