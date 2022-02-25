package cajunboilbar.com.cms.model;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Entity
public class employee {

    @Id
    @GeneratedValue
    private long id;
    private String firstName;
    private  String lastName;
    private  String email;
    private String phoneNumber;
    private Date birthday;
    private String position;
    private float defaultPayRate;
    @OneToMany(mappedBy = "employee")
    private Collection<employeeDeduction> employeeDeductions;

    @OneToMany(mappedBy = "employee")
    private Collection<tipData> tipDatas;

    public employee(String firstName, String lastName, String email, String phoneNumber, Date birthday, String position, float defaultPayRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
        this.position = position;
        this.defaultPayRate = defaultPayRate;
        this.tipDatas = new ArrayList<>();
    }

    public employee(){

    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getPosition() {
        return position;
    }

    public float getDefaultPayRate() {
        return defaultPayRate;
    }

    public Collection<cajunboilbar.com.cms.model.tipData> getTipDatas() {
        return tipDatas;
    }
}
