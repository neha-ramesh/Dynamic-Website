import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SensorGroupService {

    @Autowired
    private SensorGroupRepository sensorGroupRepository;

    public Long countDistinctSensorGroupsByUser(String createdBy) {
        return sensorGroupRepository.countDistinctSensorGroupsByUser(createdBy);
    }
}
