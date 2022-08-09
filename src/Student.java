import java.io.Serializable;

public class Student implements Serializable {
//    fields: roll: Integer name: String address: Address //
//    Student Has Address email: String password: String;

    Integer roll;
    String name;
    Address add;
    String email;
    transient String password;

    public Student(Integer roll, String name, Address add, String email, String password) {
        this.roll = roll;
        this.name = name;
        this.add = add;
        this.email = email;
        this.password = password;
    }
}
