import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "sensor_group")
public class SensorGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sensorGroupId;
    private LocalDateTime createdAt;
    private String createdBy;
    private Boolean isDeleted;
    private LocalDateTime updatedAt;
    private String updatedBy;
    private String sensorGroupName;
    private Long sensorTypeId;

    // Getters and Setters

    public Long getSensorGroupId() {
        return sensorGroupId;
    }

    public void setSensorGroupId(Long sensorGroupId) {
        this.sensorGroupId = sensorGroupId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getSensorGroupName() {
        return sensorGroupName;
    }

    public void setSensorGroupName(String sensorGroupName) {
        this.sensorGroupName = sensorGroupName;
    }

    public Long getSensorTypeId() {
        return sensorTypeId;
    }

    public void setSensorTypeId(Long sensorTypeId) {
        this.sensorTypeId = sensorTypeId;
    }
}
