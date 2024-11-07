import * as React from 'react';
import Box from '@mui/material/Box';
import Typography from '@mui/material/Typography';
import { createTheme } from '@mui/material/styles';
import DashboardIcon from '@mui/icons-material/Dashboard';
import ShoppingCartIcon from '@mui/icons-material/ShoppingCart';
import { AppProvider, type Navigation,type Session } from '@toolpad/core/AppProvider';
import { useDemoRouter } from '@toolpad/core/internal';
import Grid from '@mui/material/Grid2';
import DonutChart from '../components/Donutchart'
import Heatmap from '../components/Heatmap'
import HorizontalBars from '../components/Horizontalbar';
import StackedBarChart from '../components/Stackedbar';
import Tablenew from './Tablenew';
import Gaugechart from './Gaugechart'
import ScatterPlot from './ScatterPlot';
import SimpleLineChart from './SimpleLineChart'
import TwoLevelPieChart from './TwoLevelPieChart';
import TextField from '@mui/material/TextField';
import SearchIcon from '@mui/icons-material/Search';
import {
  DashboardLayout,
  type SidebarFooterProps,
} from '@toolpad/core/DashboardLayout';
import IconButton from '@mui/material/IconButton';
import Tooltip from '@mui/material/Tooltip';

const NAVIGATION: Navigation = [
  {
    segment: 'dashboard',
    title: 'Dashboard',
    icon: <DashboardIcon />,
  },
  {
    segment: 'orders',
    title: 'Orders',
    icon: <ShoppingCartIcon />,
  },
];


const demoTheme = createTheme({
  cssVariables: {
    colorSchemeSelector: 'data-toolpad-color-scheme',
  },
  colorSchemes: { light: true, dark: true },
  breakpoints: {
    values: {
      xs: 0,
      sm: 800,
      md: 600,
      lg: 1200,
      xl: 1536,
    },
  },
});

function Search() {
  return (
    <React.Fragment>
      <Tooltip title="Search" enterDelay={1000}>
        <div>
          <IconButton
            type="button"
            aria-label="search"
            sx={{
              display: { xs: 'inline', md: 'none' },
            }}
          >
            <SearchIcon />
          </IconButton>
        </div>
      </Tooltip>
      <TextField
        label="Search"
        variant="outlined"
        size="small"
        slotProps={{
          input: {
            endAdornment: (
              <IconButton type="button" aria-label="search" size="small">
                <SearchIcon />
              </IconButton>
            ),
            sx: { pr: 0.5 },
          },
        }}
        sx={{ display: { xs: 'none', md: 'inline-block' }, mr: 1 }}
      />
    </React.Fragment>
  );
}

function SidebarFooter({ mini }: SidebarFooterProps) {
  return (
    <Typography
      variant="caption"
      sx={{ m: 1, whiteSpace: 'nowrap', overflow: 'hidden' }}
    >
      {mini ? '© MUI' : `© ${new Date().getFullYear()} Made with love by MUI`}
    </Typography>
  );
}

function DemoPageContent({ pathname }: { pathname: string }) {
  return (
    <>
    <Box sx={{ position: 'relative', display: 'flex' }}>
      
      <Box component="main" sx={{ flexGrow: 1,p:0, position: 'relative'}}>
      </Box>
      <Box
    sx={{
      position: 'absolute', // Position this box absolutely within the parent
      top: 20,
      left: 50,
      right: 40,
      zIndex: 1,           // Ensures it's on top of the first Box
      p: 2,
      flexGrow: 1,
    }}
  >
        
        
        <Grid container rowSpacing={1} columnSpacing={{ xs: 1, sm: 2, md: 3 }}>
          <Grid size={4} sx={{ border: '1px solid #ccc', padding: 2,borderRadius:2 }}>
          <DonutChart></DonutChart>
         </Grid>
         <Grid size={4}sx={{ border: '1px solid #ccc', padding: 2,borderRadius:2 }}>
          <StackedBarChart></StackedBarChart>
        </Grid>
        <Grid size={4}sx={{ border: '1px solid #ccc', padding: 2,borderRadius:2 }}>
          <ScatterPlot></ScatterPlot>
        </Grid>
          <Grid size={4.5} sx={{ border: '1px solid #ccc', padding: 2,borderRadius:2 }}>
          <HorizontalBars></HorizontalBars>
          </Grid>
          <Grid size={3} sx={{ border: '1px solid #ccc', padding: 2,borderRadius:2 }}>
          <Gaugechart></Gaugechart>
          </Grid>
          <Grid size={4.5}sx={{ border: '1px solid #ccc', padding: 2,borderRadius:2 }}>
          <SimpleLineChart></SimpleLineChart>
        </Grid>
        
        
          <Grid size={4}sx={{ border: '1px solid #ccc', padding: 2,borderRadius:2 }}>
          <Heatmap></Heatmap>
        </Grid>
          
          
        
        <Grid size={3}sx={{ border: '1px solid #ccc', padding: 2,borderRadius:2 }}>
          <TwoLevelPieChart></TwoLevelPieChart>
        </Grid>
        <Grid size={5} sx={{ border: '1px solid #ccc', padding: 2,borderRadius:2 }}>
          <HorizontalBars></HorizontalBars>
          </Grid>
        <Grid size={13}sx={{ border: '1px solid #ccc', padding: 2,borderRadius:2 }}>
          <Tablenew></Tablenew>
        </Grid>
        
      </Grid>
      </Box>
      </Box>
    </>
  );
}

interface DemoProps {
  /**
   * Injected by the documentation to work in an iframe.
   * Remove this when copying and pasting into your project.
   */
  window?: () => Window;
}

export default function DashboardLayoutBranding(props: DemoProps) {
  const { window } = props;

  const [session, setSession] = React.useState<Session | null>({
    user: {
      name: 'Neha Ramesh',
      email: 'nehaannamramesh@gmail.com',
      image: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRYRjpcUKEV3KuyJ0OEVDPJkdd-fHI_dVEOC2sxnN3L0o0iunSh',
    },
  });

  const authentication = React.useMemo(() => {
    return {
      signIn: () => {
        setSession({
          user: {
            name: 'Neha Ramesh',
            email: 'nehaannamramesh@gmail.com',
            image: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRYRjpcUKEV3KuyJ0OEVDPJkdd-fHI_dVEOC2sxnN3L0o0iunSh',
          },
        });
      },
      signOut: () => {
        setSession(null);
      },
    };
  }, []);

  const router = useDemoRouter('/dashboard');

  // Remove this const when copying and pasting into your project.
  const demoWindow = window !== undefined ? window() : undefined;

  return (
    // preview-start
    <AppProvider
      session={session}
      authentication={authentication}
      navigation={NAVIGATION}
      branding={{
        logo: <img src="data:image/png;base64,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" alt="MUI logo" />,
        title: 'DATAYAAN',
      }}
      router={router}
      theme={demoTheme}
      window={demoWindow}
    >
      <DashboardLayout hideNavigation slots={{ toolbarActions: Search, sidebarFooter: SidebarFooter }}>
  <DemoPageContent pathname={router.pathname} />
</DashboardLayout>
    </AppProvider>
    // preview-end
  );
}