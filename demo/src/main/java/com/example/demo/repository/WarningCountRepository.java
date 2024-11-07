import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface WarningCountRepository extends JpaRepository<WarningReport, Long> {

    @Query("SELECT new com.example.dto.WarningCountDTO(w.customerName, DATE(w.time), COUNT(w)) " +
           "FROM WarningReport w " +
           "WHERE w.time BETWEEN :startDate AND :endDate " +
           "GROUP BY w.customerName, DATE(w.time)")
    List<WarningCountDTO> findWarningCountByCustomerWithinDateRange(@Param("startDate") LocalDateTime startDate,
                                                                    @Param("endDate") LocalDateTime endDate);
}
