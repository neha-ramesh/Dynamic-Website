import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceOnboardRepository extends JpaRepository<DeviceOnboard, Long> {

    @Query("SELECT COUNT(DISTINCT d.customerAdminName) " +
           "FROM DeviceOnboard d " +
           "JOIN AppUser u ON d.customerAdminName = u.casdoorUsername " +
           "WHERE u.casdoorUsername = :casdoorUsername " +
           "AND u.parentName = :parentName " +
           "AND u.userType = :userType " +
           "AND u.isActive = true " +
           "AND u.isBlocked = false " +
           "AND u.status = :status " +
           "AND u.isDeleted = false")
    Long countUniqueCustomersByAdmin(@Param("casdoorUsername") String casdoorUsername,
                                     @Param("parentName") String parentName,
                                     @Param("userType") String userType,
                                     @Param("status") String status);
}
