import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface SensorGroupMappingRepository extends JpaRepository<SensorGroupMapping, Long> {

    @Query("SELECT COUNT(s) FROM SensorGroupMapping s " +
           "JOIN DeviceOnboard d ON s.deviceId = d.deviceId " +
           "JOIN AppUser u ON d.customerAdminName = u.casdoorUsername " +
           "WHERE s.createdby = :createdBy " +
           "AND u.casdoorUsername = :username " +
           "AND u.parentName = :parentName " +
           "AND u.userType = 'BUSINESS_USER' " +
           "AND u.isActive = true " +
           "AND u.isBlocked = false " +
           "AND u.status = 'active' " +
           "AND u.isDeleted = false")
    Long countDevicesByCriteria(@Param("createdBy") String createdBy,
                                @Param("username") String username,
                                @Param("parentName") String parentName);
}
