import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "penalties")
public class Penalties {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long penaltyId;
    private Double amount;
    private String description;
    private LocalDate dueDate;
    private LocalDate issueDate;
    private LocalDate paidDate;
    private String paidStatus;
    private Double penaltyPercentage;
    private Double previousAmount;
    private Double totalAmount;
    private Long fineId;
    private Boolean isPaid;

    // Getters and Setters
    public Long getPenaltyId() { return penaltyId; }
    public void setPenaltyId(Long penaltyId) { this.penaltyId = penaltyId; }

    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public LocalDate getDueDate() { return dueDate; }
    public void setDueDate(LocalDate dueDate) { this.dueDate = dueDate; }

    public LocalDate getIssueDate() { return issueDate; }
    public void setIssueDate(LocalDate issueDate) { this.issueDate = issueDate; }

    public LocalDate getPaidDate() { return paidDate; }
    public void setPaidDate(LocalDate paidDate) { this.paidDate = paidDate; }

    public String getPaidStatus() { return paidStatus; }
    public void setPaidStatus(String paidStatus) { this.paidStatus = paidStatus; }

    public Double getPenaltyPercentage() { return penaltyPercentage; }
    public void setPenaltyPercentage(Double penaltyPercentage) { this.penaltyPercentage = penaltyPercentage; }

    public Double getPreviousAmount() { return previousAmount; }
    public void setPreviousAmount(Double previousAmount) { this.previousAmount = previousAmount; }

    public Double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(Double totalAmount) { this.totalAmount = totalAmount; }

    public Long getFineId() { return fineId; }
    public void setFineId(Long fineId) { this.fineId = fineId; }

    public Boolean getIsPaid() { return isPaid; }
    public void setIsPaid(Boolean isPaid) { this.isPaid = isPaid; }
}
