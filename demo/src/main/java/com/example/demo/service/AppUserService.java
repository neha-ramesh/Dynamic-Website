
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppUserService {
    
    private final AppUserRepository appUserRepository;

    @Autowired
    public AppUserService(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    public long getTotalCustomersByParent(String parentName) {
        return appUserRepository.countTotalCustomersByParentName(parentName);
    }

    public long getActiveCustomersByParent(String parentName) {
        return appUserRepository.countActiveCustomersByParentName(parentName);
    }

    public long getInactiveCustomersByParent(String parentName) {
        return appUserRepository.countInactiveCustomersByParentName(parentName);
    }
}
