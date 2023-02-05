import java.net.SocketTimeoutException;

public class Main {
    public static void main(String[] args)
    {
        Person Dylan = new Person("Dylan", "Coffey", "000001", "Student", 2002);

        System.out.println(Dylan);
        System.out.println(Dylan.getFullName());
        System.out.print(Dylan.getFormalName());
        System.out.println("Current age is " + Dylan.getAge());
        System.out.println("Age at 2023 " + Dylan.getAge(2023));
    }
}