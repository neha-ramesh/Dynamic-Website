import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sensor-groups")
public class SensorGroupController {

    @Autowired
    private SensorGroupService sensorGroupService;

    @GetMapping("/count")
    public Long countDistinctSensorGroups(@RequestParam String createdBy) {
        return sensorGroupService.countDistinctSensorGroupsByUser(createdBy);
    }
}
