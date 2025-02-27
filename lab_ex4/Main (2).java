public class Main {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        int result = calculate(a, b);  

        System.out.println("Eager Evaluation Result: " + result);
    }

    public static int calculate(int a, int b) {
        System.out.println("Performing eager calculation...");
        return a + b;
    }
}
