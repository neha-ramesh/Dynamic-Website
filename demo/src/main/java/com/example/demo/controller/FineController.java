import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fines")
public class FineController {

    @Autowired
    private FineService fineService;

    @GetMapping("/top5-unpaid")
    public List<Object[]> getTop5UnpaidDevices(@RequestParam String parentName) {
        return fineService.getTop5UnpaidDevices(parentName);
    }
}
