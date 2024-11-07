import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WarningViolationService {

    @Autowired
    private WarningReportRepository warningReportRepository;

    @Autowired
    private ViolationReportRepository violationReportRepository;

    public WarningViolationCountDTO getWarningViolationCount(String customerAdminName) {
        Long totalWarnings = warningReportRepository.countWarningsByCustomerAdminName(customerAdminName);
        Long totalViolations = violationReportRepository.countViolationsByCustomerAdminName(customerAdminName);

        return new WarningViolationCountDTO(customerAdminName, totalWarnings, totalViolations);
    }
}
