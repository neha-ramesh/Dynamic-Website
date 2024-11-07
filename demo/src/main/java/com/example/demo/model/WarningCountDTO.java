import java.time.LocalDate;

public class WarningCountDTO {

    private String customerName;
    private LocalDate warningDate;
    private Long warningCount;

    public WarningCountDTO(String customerName, LocalDate warningDate, Long warningCount) {
        this.customerName = customerName;
        this.warningDate = warningDate;
        this.warningCount = warningCount;
    }

    // Getters and Setters
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public LocalDate getWarningDate() {
        return warningDate;
    }

    public void setWarningDate(LocalDate warningDate) {
        this.warningDate = warningDate;
    }

    public Long getWarningCount() {
        return warningCount;
    }

    public void setWarningCount(Long warningCount) {
        this.warningCount = warningCount;
    }
}
