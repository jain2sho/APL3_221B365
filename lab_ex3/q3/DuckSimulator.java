
interface Flyable {
    void fly();
}

interface Quackable {
    void quack();
}

interface Swimmable {
    void swim();
}

interface Squeakable {
    void squeak();
}

interface Mute {
    void mute();
}

class RubberDuck implements Swimmable, Squeakable {
    
    public void swim() {
        System.out.println("Rubber Duck is swimming!");
    }

    public void squeak() {
        System.out.println("Rubber Duck squeaks!");
    }
}

class WoodenDuck implements Swimmable, Mute {
   
    public void swim() {
        System.out.println("Wooden Duck is swimming!");
    }

    public void mute() {
        System.out.println("Wooden Duck is mute!");
    }
}

class RedHeadDuck implements Flyable, Quackable, Swimmable {
    
    public void fly() {
        System.out.println("RedHead Duck is flying!");
    }

    public void quack() {
        System.out.println("RedHead Duck is quacking!");
    }

    public void swim() {
        System.out.println("RedHead Duck is swimming!");
    }
}

class LakeDuck implements Flyable, Quackable, Swimmable {

    public void fly() {
        System.out.println("Lake Duck is flying!");
    }

    public void quack() {
        System.out.println("Lake Duck is quacking!");
    }

    public void swim() {
        System.out.println("Lake Duck is swimming!");
    }
}

public class DuckSimulator {
    public static void main(String[] args) {
        RubberDuck rubberDuck = new RubberDuck();
        WoodenDuck woodenDuck = new WoodenDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        LakeDuck lakeDuck = new LakeDuck();

        System.out.println("Rubber Duck:");
        rubberDuck.swim();
        rubberDuck.squeak();

        System.out.println("\nWooden Duck:");
        woodenDuck.swim();
        woodenDuck.mute();

        System.out.println("\nRedHead Duck:");
        redHeadDuck.swim();
        redHeadDuck.fly();
        redHeadDuck.quack();

        System.out.println("\nLake Duck:");
        lakeDuck.swim();
        lakeDuck.fly();
        lakeDuck.quack();
    }
}
