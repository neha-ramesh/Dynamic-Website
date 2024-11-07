import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PenaltyService {

    @Autowired
    private PenaltyRepository penaltyRepository;

    public Object[] getTotalAmountReceivedAndPending(String parentName) {
        return penaltyRepository.calculateTotalAmountReceivedAndPending(parentName);
    }
}
