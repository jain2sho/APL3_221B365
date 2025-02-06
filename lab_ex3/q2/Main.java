
interface Testable {
    void display(); 
}


class Test implements Testable {
    @Override
    public void display() {
        System.out.println("Displaying from the Test class.");
    }
}

public class Main {
    public static void main(String[] args) {
        
        Test test = new Test();
        test.display();  
    }
}
