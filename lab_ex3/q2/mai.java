
interface Testable {
    void display();  
}


abstract class AbsTest implements Testable {
    public void someOtherMethod() {
        System.out.println("Some other method in AbsTest.");
    }
}

class ConcreteTest extends AbsTest {
    @Override
    public void display() {
        System.out.println("Displaying from the ConcreteTest class.");
    }
}

public class mai {
    public static void main(String[] args) {
       
        ConcreteTest test = new ConcreteTest();
        test.display(); 
        test.someOtherMethod();  
    }
}
