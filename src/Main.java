import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Address add=new Address("Gujarat","Jamnagar","361001");
        Student s1=new Student(1,"Abbas",add,"abbasghaniwala92@gmail.com","12345gha");
        ObjectOutputStream op=new ObjectOutputStream(new FileOutputStream("new.txt"));
        op.writeObject(s1);
        op.flush();
        op.close();

        ObjectInputStream ip=new ObjectInputStream(new FileInputStream("new.txt"));
       Object o= ip.readObject();
       Student s= (Student) o;
       ip.close();
        System.out.println("Roll number is "+s.roll);
        System.out.println("Name is "+s.name);
        System.out.println("Address is "+s.add.city+" "+s.add.state+" "+s.add.pincode);
        System.out.println("Email is "+s.email);
        System.out.println("Password is "+s.password);


    }
}
