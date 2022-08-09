//Create an employee object having properties name, date of birth, department, designation and salary. Let
//
//        the employee class have appropriate getter/setters methods for accessing these properties. Initialize these
//        properties through the setter methods.
//        Store this object into a file "OutObject.txt". Read the same object from the same file and display its properties
//        through getter methods.

import java.io.Serializable;

public class Employee implements Serializable {
    String name;
    String dob;
    String department;
    String Designation;
    Integer Salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    public Integer getSalary() {
        return Salary;
    }

    public void setSalary(Integer salary) {
        Salary = salary;
    }

}

