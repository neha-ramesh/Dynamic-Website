import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ViolationCountRepository extends JpaRepository<ViolationReport, Long> {

    @Query("SELECT new com.example.dto.ViolationCountDTO(v.customerName, DATE(v.violationDate), COUNT(v)) " +
           "FROM ViolationReport v " +
           "WHERE v.violationDate BETWEEN :startDate AND :endDate " +
           "AND v.customerAdminName = :customerAdminName " +
           "AND (:customerName IS NULL OR v.customerName = :customerName) " +
           "GROUP BY v.customerName, DATE(v.violationDate)")
    List<ViolationCountDTO> findViolationCountByCustomerWithinDateRange(
            @Param("startDate") LocalDateTime startDate,
            @Param("endDate") LocalDateTime endDate,
            @Param("customerAdminName") String customerAdminName,
            @Param("customerName") String customerName);
}
