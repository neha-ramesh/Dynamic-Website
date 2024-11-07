import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface FineRepository extends JpaRepository<Fines, Long> {

    @Query("SELECT f.deviceId, (SUM(f.amount) + SUM(p.amount)) AS totalUnpaidAmount " +
           "FROM Fines f JOIN Penalties p ON f.fineId = p.fineId " +
           "WHERE f.isPaid = false AND p.isPaid = false AND f.parentName = :parentName " +
           "GROUP BY f.deviceId " +
           "ORDER BY totalUnpaidAmount DESC")
    List<Object[]> findTop5DevicesWithHighestUnpaidAmounts(String parentName);
}
