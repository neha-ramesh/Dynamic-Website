import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sensor-group-mapping")
public class SensorGroupMappingController {

    private final SensorGroupMappingService sensorGroupMappingService;

    @Autowired
    public SensorGroupMappingController(SensorGroupMappingService sensorGroupMappingService) {
        this.sensorGroupMappingService = sensorGroupMappingService;
    }

    @GetMapping("/count-devices")
    public Long countDevicesByCriteria(@RequestParam String createdBy,
                                       @RequestParam String username,
                                       @RequestParam String parentName) {
        return sensorGroupMappingService.countDevicesByCriteria(createdBy, username, parentName);
    }
}
