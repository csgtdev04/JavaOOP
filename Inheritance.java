// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Person {
    private String gender;
    
    public Person(String g) {
        gender = g;
    }
    // what goes away?
    
    public Person() {
        gender = "N/A";
    }
    
    // dynamic binding
    public void sleep() {
        System.out.println("Person sleeping...");
    }
    
    public void run(String miles) {
        System.out.println("Person run void...");
    }
    
}

// class Object {
//     // ....
    
    
//     public String toString() {
//         System.out.println("Object toString()...");
//     }
// }

class Student extends Person {
    private String name;
    private int age;
    private String grade;
    
    public Student(String name, int age, String grade, String gender) {
        // first make a Person
        // super(gender);
        this.name = name;    
        this.age = age;    
        this.grade = grade;    
    }
    
    // method overloading - whenn you have 2 function with same name
    // but diff num of argyments
    
    public void learn(String subject) {
        System.out.println("Learning " + subject);
    }
    
    public void learn(String subject, int hours) {
        System.out.println("Learning " + subject + " for " + hours + " hours...");
    }
    
    // // method override
    public String toString() {
        return age + " " + name + " " + grade;
    }
    
    // public void sleep() {
    //     System.out.println("Student sleeping...");
    // }
    
}

public class Inheritance {
    public static void main(String[] args) {
        Student arnav = new Student("Arnav", 16, "10", "Male");
        arnav.learn("CS");
        arnav.learn("CS", 4);
        System.out.println(arnav); // type Student, Object
        arnav.sleep();
        arnav.run("10");
        // it will print (arnav 16 10)
        
        
        Person sai = new Student("Arnav", 16, "10", "Male");
        // Person arnav = new Person("Male");
        // sai, type = Person
        sai.sleep();
        
        
    }
}
