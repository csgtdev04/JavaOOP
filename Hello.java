import java.rmi.server.ObjID;

public class Hello {
    private String name;
    public static void main(String[] args) {
        Person p = new Person("Arnav", 16);
        Person p2 = new Person("Arnav", 16);
        Person p3 = new Person();
        System.out.println(p.getName());
        System.out.println(p.getAge());
        p.setName("Sai");
        p.setAge(20);

        // Soccer s = new Soccer();
        // s.doPenaltyKick(); // ok

        System.out.println(p); // Person@6b95977
        System.out.println(p2);

        // Object o = new Person();
        // Person o2 = new Object();

        
        // Important Words
        
        // Encapsulation
        // Abstraction
        // Polymorphism
        // Inheritance

        // Animal a = new Animal();
        Pig a = new Pig();
        Animal b = new Pig();
        Animal c = new Dog();
    }
}