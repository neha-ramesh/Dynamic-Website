import java.time.LocalDate;

public class ViolationCountDTO {

    private String customerName;
    private LocalDate violationDate;
    private Long violationCount;

    public ViolationCountDTO(String customerName, LocalDate violationDate, Long violationCount) {
        this.customerName = customerName;
        this.violationDate = violationDate;
        this.violationCount = violationCount;
    }

    // Getters and Setters
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public LocalDate getViolationDate() {
        return violationDate;
    }

    public void setViolationDate(LocalDate violationDate) {
        this.violationDate = violationDate;
    }

    public Long getViolationCount() {
        return violationCount;
    }

    public void setViolationCount(Long violationCount) {
        this.violationCount = violationCount;
    }
}
