import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "sensor_group_mapping")
public class SensorGroupMapping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sensorGroupMappingId;

    private LocalDateTime createdat;
    private String createdby;
    private Boolean isdeleted;
    private LocalDateTime updatedat;
    private String updatedby;
    private String currency;
    private String customerName;
    private Double fineAmount;
    private Integer frequencyCount;
    private Integer frequencyDuration;
    private Double latitude;
    private Double longitude;
    private String make;
    private String model;
    private Integer penaltyDuration;
    private Double penaltyPercentage;
    private Boolean reset;
    private String sensorType;
    private String status;
    private Integer warningCount;
    private Integer warningDuration;
    private Long deviceId;
    private Long sensorGroupId;

    // Getters and Setters
    public Long getSensorGroupMappingId() {
        return sensorGroupMappingId;
    }

    public void setSensorGroupMappingId(Long sensorGroupMappingId) {
        this.sensorGroupMappingId = sensorGroupMappingId;
    }

    public LocalDateTime getCreatedat() {
        return createdat;
    }

    public void setCreatedat(LocalDateTime createdat) {
        this.createdat = createdat;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public Boolean getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Boolean isdeleted) {
        this.isdeleted = isdeleted;
    }

    public LocalDateTime getUpdatedat() {
        return updatedat;
    }

    public void setUpdatedat(LocalDateTime updatedat) {
        this.updatedat = updatedat;
    }

    public String getUpdatedby() {
        return updatedby;
    }

    public void setUpdatedby(String updatedby) {
        this.updatedby = updatedby;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Double getTimeAmount() {
        return fineAmount;
    }

    public void setTimeAmount(Double timeAmount) {
        this.fineAmount = fineAmount;
    }

    public Integer getFrequencyCount() {
        return frequencyCount;
    }

    public void setFrequencyCount(Integer frequencyCount) {
        this.frequencyCount = frequencyCount;
    }

    public Integer getFrequencyDuration() {
        return frequencyDuration;
    }

    public void setFrequencyDuration(Integer frequencyDuration) {
        this.frequencyDuration = frequencyDuration;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getPenaltyDuration() {
        return penaltyDuration;
    }

    public void setPenaltyDuration(Integer penaltyDuration) {
        this.penaltyDuration = penaltyDuration;
    }

    public Double getPenaltyPercentage() {
        return penaltyPercentage;
    }

    public void setPenaltyPercentage(Double penaltyPercentage) {
        this.penaltyPercentage = penaltyPercentage;
    }

    public Boolean getReset() {
        return reset;
    }

    public void setReset(Boolean reset) {
        this.reset = reset;
    }

    public String getSensorType() {
        return sensorType;
    }

    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getWarningCount() {
        return warningCount;
    }

    public void setWarningCount(Integer warningCount) {
        this.warningCount = warningCount;
    }

    public Integer getWarningDuration() {
        return warningDuration;
    }

    public void setWarningDuration(Integer warningDuration) {
        this.warningDuration = warningDuration;
    }

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public Long getSensorGroupId() {
        return sensorGroupId;
    }

    public void setSensorGroupId(Long sensorGroupId) {
        this.sensorGroupId = sensorGroupId;
    }
}
