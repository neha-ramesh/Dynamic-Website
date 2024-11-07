import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeviceOnboardController {

    private final DeviceOnboardService deviceOnboardService;

    @Autowired
    public DeviceOnboardController(DeviceOnboardService deviceOnboardService) {
        this.deviceOnboardService = deviceOnboardService;
    }

    @GetMapping("/count-unique-customers")
    public Long countUniqueCustomers(
            @RequestParam String casdoorUsername,
            @RequestParam String parentName,
            @RequestParam String userType,
            @RequestParam String status) {
        return deviceOnboardService.getUniqueCustomerCountByAdmin(casdoorUsername, parentName, userType, status);
    }
}
