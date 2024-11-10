
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.util.Map;

@RestController
@RequestMapping("/api/customers")
public class AppUserController {
    @Autowired
    private AppUserService appUserService;

    @GetMapping("/counts")
    public ResponseEntity<Map<String, Long>> getCustomerCounts(@RequestParam String parentName) {
        Map<String, Long> counts = appUserService.getCustomerCountsByParentName(parentName);
        return ResponseEntity.ok(counts);
    }
}
