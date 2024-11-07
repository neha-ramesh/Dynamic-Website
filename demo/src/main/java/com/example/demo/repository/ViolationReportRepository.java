import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ViolationReportRepository extends JpaRepository<ViolationReport, Long> {

    @Query("SELECT COUNT(v) FROM ViolationReport v WHERE v.customerAdminName = :customerAdminName")
    Long countViolationsByCustomerAdminName(String customerAdminName);
}