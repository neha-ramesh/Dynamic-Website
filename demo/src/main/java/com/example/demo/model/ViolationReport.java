import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "violation_reports")
public class ViolationReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "violation_id")
    private Long violationId;

    @Column(name = "warning_group_id")
    private Long warningGroupId;

    @Column(name = "violation_code")
    private String violationCode;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "customer_admin_name")
    private String customerAdminName;

    @Column(name = "device_id")
    private Long deviceId;

    @Column(name = "sensor_id")
    private Long sensorId;

    @Column(name = "sensor_type")
    private String sensorType;

    @Column(name = "fine_amount")
    private Double fineAmount;

    @Column(name = "violation_date")
    private LocalDateTime violationDate;

    @Column(name = "due_date")
    private LocalDateTime dueDate;

    @Column(name = "update_time")
    private LocalDateTime updateTime;

    @Column(name = "device_warning_count")
    private Integer deviceWarningCount;

    @Column(name = "actual_warning_count")
    private Integer actualWarningCount;

}
