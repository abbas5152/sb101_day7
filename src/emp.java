import java.io.Serializable;

public class emp implements Serializable {
    Integer empid;
    String empname;
    Address add;
    String email;
    transient  String password;

    public emp(Integer empid, String empname, Address add, String email, String password) {
        this.empid = empid;
        this.empname = empname;
        this.add = add;
        this.email = email;
        this.password = password;
    }
}
