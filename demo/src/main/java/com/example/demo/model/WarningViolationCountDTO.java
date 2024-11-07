public class WarningViolationCountDTO {

    private String customerAdminName;
    private Long totalWarnings;
    private Long totalViolations;

    public WarningViolationCountDTO(String customerAdminName, Long totalWarnings, Long totalViolations) {
        this.customerAdminName = customerAdminName;
        this.totalWarnings = totalWarnings;
        this.totalViolations = totalViolations;
    }

    // Getters and Setters
    public String getCustomerAdminName() {
        return customerAdminName;
    }

    public void setCustomerAdminName(String customerAdminName) {
        this.customerAdminName = customerAdminName;
    }

    public Long getTotalWarnings() {
        return totalWarnings;
    }

    public void setTotalWarnings(Long totalWarnings) {
        this.totalWarnings = totalWarnings;
    }

    public Long getTotalViolations() {
        return totalViolations;
    }

    public void setTotalViolations(Long totalViolations) {
        this.totalViolations = totalViolations;
    }
}
