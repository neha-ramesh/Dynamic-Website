import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "warning_reports")
public class WarningReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "warning_id")
    private Long warningId;

    @Column(name = "warning_code")
    private String warningCode;

    @Column(name = "warning_group_id")
    private Long warningGroupId;

    @Column(name = "device_id")
    private Long deviceId;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "customer_admin_name")
    private String customerAdminName;

    @Column(name = "sensor_type")
    private String sensorType;

    @Column(name = "device_warning_count")
    private Integer deviceWarningCount;

    @Column(name = "reset_period")
    private String resetPeriod;

    @Column(name = "update_time")
    private LocalDateTime updateTime;

    @Column(name = "time")
    private LocalDateTime time;

}
