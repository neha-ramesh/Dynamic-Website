import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class ViolationCountController {

    @Autowired
    private ViolationCountService violationCountService;

    @GetMapping("/api/violation-count")
    public List<ViolationCountDTO> getViolationCountByCustomerWithinDateRange(
            @RequestParam("startDate") LocalDateTime startDate,
            @RequestParam("endDate") LocalDateTime endDate,
            @RequestParam("customerAdminName") String customerAdminName,
            @RequestParam(value = "customerName", required = false) String customerName) {
        return violationCountService.getViolationCountByCustomerWithinDateRange(startDate, endDate, customerAdminName, customerName);
    }
}
