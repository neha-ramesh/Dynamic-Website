
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "app_user")
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userType;
    private Date createdAt;
    private String createdBy;
    private Date deletedAt;
    private String deletedBy;
    private Boolean isDeleted;
    private Date lastModifiedAt;
    private String lastModifiedBy;
    private String casdoorEmail;
    private String casdoorMobileNumber;
    private String casdoorPassword;
    private String casdoorUserUniqueId;
    private String casdoorUsername;
    private String currency;
    private Boolean isActive;
    private Boolean isBlocked;
    private String organizationName;
    private String status;
    private String timezone;
    private String parentName;

    // Getters and Setters
    // Add getter and setter methods for each field here

    // Example
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }


    public Boolean getisActive(){
        return isActive;
    }

    public void setisActive(Boolean isActive){
        this.isActive = isActive;
    }

    public Boolean getisBlocked(){
        return isBlocked;
    }

    public void setisBlocked(Boolean isActive){
        this.isBlocked = isBlocked;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

}
