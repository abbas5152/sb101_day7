import java.io.*;

public class Main2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Address add=new Address("Gujarat","Jamnagar","361001");
        emp e=new emp(10,"Abbas",add,"Abbas@gmail.com","23ert");

        ObjectOutputStream op=new ObjectOutputStream(new FileOutputStream("emp.txt"));
        op.writeObject(e);
        op.flush();

        ObjectInputStream ip= new ObjectInputStream(new FileInputStream("emp.txt"));
        Object o=ip.readObject();
        emp ee=(emp) o;
        System.out.println(ee.empid);
        System.out.println(ee.empname);
        System.out.println(ee.add.state+" "+ee.add.city+" "+ee.add.pincode);
        System.out.println(ee.email);
        System.out.println(ee.password);

    }
}
