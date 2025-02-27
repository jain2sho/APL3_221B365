import java.util.function.Supplier;

public class main {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        Supplier<Integer> lazyResult = () -> calculate(a, b);
        System.out.println("Lazy Evaluation Result: " + lazyResult.get());
    }
    public static int calculate(int a, int b) {
        System.out.println("Performing lazy calculation...");
        return a + b;
    }
}
