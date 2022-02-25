package cajunboilbar.com.cms.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class tipData {
@Id
@GeneratedValue
    private long id;
    private float tipAmount;
    private float subTotal;
    private Date date;
    @ManyToOne
    private employee employee;
    private float tipOutPercent;
    private float tipOutAmount;
    private String shift;
    private float hoursWorked;
    private int storeID;




}
