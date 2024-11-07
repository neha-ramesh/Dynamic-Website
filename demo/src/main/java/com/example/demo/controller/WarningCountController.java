import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class WarningCountController {

    @Autowired
    private WarningCountService warningCountService;

    @GetMapping("/api/warning-count")
    public List<WarningCountDTO> getWarningCountByCustomerWithinDateRange(
            @RequestParam("startDate") LocalDateTime startDate,
            @RequestParam("endDate") LocalDateTime endDate) {
        return warningCountService.getWarningCountByCustomerWithinDateRange(startDate, endDate);
    }
}
