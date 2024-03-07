interface AnimalInterface {
    public abstract String type();

    // public void eat() {

    // }
}

public abstract class Animal implements AnimalInterface {
    // non defined
    public abstract String favFood(); // promise that my child will implenet this function
    public abstract String favToy();

    // defined - every Amimal
    public void sleep() {
        System.out.println("ZZZZZZZZZZZZ");
    }
}

class Pig extends Animal {
    public String favFood() {
        return "Eating some pork";
    }

    public String favToy() {
        return "Lol";
    }

    public String type() {
        return "Lol";
    }
}

class Dog extends Animal {
    public String favFood() {
        return "Eating some  dog food";
    }

    public String favToy() {
        return "Lol 2";
    }

    public void sleep() {
        System.out.println("bark bark");
    }

    public String type() {
        return "Lol";
    }
}
