import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface SensorGroupMappingRepository4 extends JpaRepository<SensorGroupMapping, Long> {

    @Query("SELECT new com.example.dto.DeviceLocationDTO(d.deviceName, sgm.latitude, sgm.longitude, sgm.customer_name) " +
           "FROM SensorGroupMapping sgm " +
           "JOIN DeviceOnboard d ON sgm.deviceId = d.id " +
           "WHERE sgm.createdby = 'abdul' " +
           "AND sgm.isdeleted = false " +
           "AND sgm.status = true")
    List<DeviceLocationDTO> findDeviceLocations();
}
