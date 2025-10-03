public class Calculator {
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero not allowed");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result = calc.divide(10, 2);
        System.out.println("Result: " + result);
    }
}
