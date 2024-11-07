import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/penalties")
public class PenaltyController {

    @Autowired
    private PenaltyService penaltyService;

    @GetMapping("/total-amounts")
    public Map<String, Double> getTotalAmounts(@RequestParam String parentName) {
        Object[] result = penaltyService.getTotalAmountReceivedAndPending(parentName);

        Map<String, Double> response = new HashMap<>();
        response.put("totalReceived", (Double) result[0]);
        response.put("totalPending", (Double) result[1]);

        return response;
    }
}
