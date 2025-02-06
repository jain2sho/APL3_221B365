
abstract class Bharatvanshi {
    String name;

    public Bharatvanshi(String name) {
        this.name = name;
    }

    public abstract void fight();

    public boolean isFighter() {
        return true;
    }
}


class Pandav extends Bharatvanshi {
    boolean obedience;
    boolean kindness;

    public Pandav(String name, boolean obedience, boolean kindness) {
        super(name);
        this.obedience = obedience;
        this.kindness = kindness;
    }

    @Override
    public void fight() {
        System.out.println(name + " is fighting as a Pandav.");
    }

    public void obey() {
        System.out.println(name + " obeys orders with great loyalty.");
    }

    public void kind() {
        System.out.println(name + " is kind, though slightly less kind than Arjun.");
    }
}


class Kaurav extends Bharatvanshi {
    boolean disobedience;
    boolean cruelty;

    public Kaurav(String name, boolean disobedience, boolean cruelty) {
        super(name);
        this.disobedience = disobedience;
        this.cruelty = cruelty;
    }

    @Override
    public void fight() {
        System.out.println(name + " is fighting as a Kaurav.");
    }

    public void disobey() {
        System.out.println(name + " disobeys orders with cruelty.");
    }

    public void beCruel() {
        System.out.println(name + " is cruel and wicked.");
    }
}

// Step 4: Concrete Class Vikarn (A noble Kaurav)
class Vikarn extends Kaurav {

    public Vikarn(String name) {
        super(name, false, false); // Vikarn is neither disobedient nor cruel
    }

    @Override
    public void fight() {
        System.out.println(name + " is fighting nobly as a Kaurav.");
    }

    public void obey() {
        System.out.println(name + " is obedient and follows orders with grace.");
    }

    public void kind() {
        System.out.println(name + " is kind and compassionate.");
    }
}


public class Main {
    public static void main(String[] args) {
        
        Pandav arjun = new Pandav("Arjun", true, true);
        Pandav bheem = new Pandav("Bheem", true, false);

        
        Kaurav duryodhan = new Kaurav("Duryodhan", true, true);
        Vikarn vikarn = new Vikarn("Vikarn");

        
        arjun.fight(); 
        arjun.obey();   
        arjun.kind();  

        
        duryodhan.fight();  
        duryodhan.disobey();  
        duryodhan.beCruel();  

        vikarn.fight();  
        vikarn.obey();   
        vikarn.kind();  
    }
}
