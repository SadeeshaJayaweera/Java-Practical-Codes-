public class EncapTest {
    public static void main(String [] args)
    {
        Encapsulation obj1 = new Encapsulation();
        obj1.setName("Sadeesha");
        obj1.getName();
        System.out.println("The Name is: "+obj1.getName());

        obj1.setAge(22);
        obj1.getAge();
        obj1.setSalary(100000000);
        obj1.getSalary();
        System.out.println("The Age is: " +obj1.getAge());
        System.out.println("The Salary is: " +obj1.getSalary());

    }
}
