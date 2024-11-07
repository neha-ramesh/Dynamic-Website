// DeviceLocationDTO.java
public class DeviceLocationDTO {

    private String deviceName;
    private Double latitude;
    private Double longitude;
    private String customerName;

    public DeviceLocationDTO(String deviceName, Double latitude, Double longitude, String customerName) {
        this.deviceName = deviceName;
        this.latitude = latitude;
        this.longitude = longitude;
        this.customerName = customerName;
    }

    // Getters and Setters
    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
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

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
