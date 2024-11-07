import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PenaltyRepository extends JpaRepository<Penalties, Long> {

    @Query("SELECT SUM(CASE WHEN p.isPaid = true THEN p.amount ELSE 0 END) AS totalReceived, " +
           "SUM(CASE WHEN p.isPaid = false THEN p.amount ELSE 0 END) AS totalPending " +
           "FROM Penalties p JOIN Fines f ON p.fineId = f.fineId " +
           "WHERE f.parentName = :parentName")
    Object[] calculateTotalAmountReceivedAndPending(String parentName);
}
