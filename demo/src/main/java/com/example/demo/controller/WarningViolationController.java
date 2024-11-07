import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WarningViolationController {

    @Autowired
    private WarningViolationService warningViolationService;

    @GetMapping("/api/warning-violation-count")
    public WarningViolationCountDTO getWarningViolationCount(@RequestParam String customerAdminName) {
        return warningViolationService.getWarningViolationCount(customerAdminName);
    }
}
