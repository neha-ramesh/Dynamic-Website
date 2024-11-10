
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Map; 
import java.util.HashMap;

@Service
public class AppUserService {
    @Autowired
    private AppUserRepository appUserRepository;

    public Map<String, Long> getCustomerCountsByParentName(String parentName) {
        long totalCustomers = appUserRepository.countTotalCustomersByParentName(parentName);
        long activeCustomers = appUserRepository.countActiveCustomersByParentName(parentName);
        long inactiveCustomers = appUserRepository.countInactiveCustomersByParentName(parentName);

        Map<String, Long> customerCounts = new HashMap<>();
        customerCounts.put("Total Customers", totalCustomers);
        customerCounts.put("Active Customers", activeCustomers);
        customerCounts.put("Inactive Customers", inactiveCustomers);

        return customerCounts;
    }
}