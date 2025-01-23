public class Application {
    public static void main(String[] args) {
        Mother m1 = new Child(); 
        m1.show(); 
        m1.staticShow(); 
        Mother.staticShow(); 
        Child.staticShow(); 
    }
}
