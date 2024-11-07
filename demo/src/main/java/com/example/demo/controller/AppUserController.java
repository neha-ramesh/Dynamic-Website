
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class AppUserController {

    private final AppUserService appUserService;

    @Autowired
    public AppUserController(AppUserService appUserService) {
        this.appUserService = appUserService;
    }

    @GetMapping("/count")
    public String getCustomerCounts(@RequestParam String parentName) {
        long totalCustomers = appUserService.getTotalCustomersByParent(parentName);
        long activeCustomers = appUserService.getActiveCustomersByParent(parentName);
        long inactiveCustomers = appUserService.getInactiveCustomersByParent(parentName);

        return "Total Customers: " + totalCustomers +
               ", Active Customers: " + activeCustomers +
               ", Inactive Customers: " + inactiveCustomers;
    }
}
