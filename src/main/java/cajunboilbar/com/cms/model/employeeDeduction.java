package cajunboilbar.com.cms.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class employeeDeduction {

    @GeneratedValue
    @Id
    private long id;
    @ManyToOne
    private employee employee;
    private float deductionAmount;
    private String desc;
    private Date date;

}
