import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FineService {

    @Autowired
    private FineRepository fineRepository;

    public List<Object[]> getTop5UnpaidDevices(String parentName) {
        return fineRepository.findTop5DevicesWithHighestUnpaidAmounts(parentName);
    }
}
