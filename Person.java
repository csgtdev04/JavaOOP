public class Person {
    private String name;
    private int age;

    // default constructor for free

    public Person(String name, int age) {
        System.out.println("We are in the Person constructor");
        this.name = name;
        this.age = age;
    }

    public Person() {}

    public void eat() {
        // name.doPenaltyKick(); cant do this
        this.doPenaltyKick();
    }

    public void doPenaltyKick() {
        
    }

    // getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // setters
    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    // toString
    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

