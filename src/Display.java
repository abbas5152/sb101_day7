import java.io.*;

public class Display {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee e=new Employee();
        e.setName("Abbas");
        e.setDob("21-02-2000");
        e.setDesignation("Devloper");
        e.setDepartment("Backend");
        e.setSalary(200000);

        ObjectOutputStream op=new ObjectOutputStream(new FileOutputStream("outobj.txt"));
        op.writeObject(e);
        op.flush();

        ObjectInputStream ip=new ObjectInputStream(new FileInputStream("outobj.txt"));
        Object o=ip.readObject();
        Employee ee=(Employee) o;
        System.out.println(ee.getName());
        System.out.println(ee.getDob());
        System.out.println(ee.getDepartment());
        System.out.println(ee.getDesignation());
        System.out.println(ee.getSalary());


    }
}
