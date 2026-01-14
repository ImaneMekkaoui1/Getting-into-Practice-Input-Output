public class Calculator {

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero not possible.");
            return 0;
        }
        return a / b;
    }

    public static int convertToNumber(String text) {
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            System.out.println("Error: '" + text + "' is not a valid number");
            return 0;
        }
    }

    public static double calculate(char op, double a, double b) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return divide(a, b);
            default:
                System.out.println("Error: Operation '" + op + "' not supported");
                return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(divide(10, 2));
        System.out.println(divide(10, 0));

        System.out.println(convertToNumber("123"));
        System.out.println(convertToNumber("abc"));

        System.out.println(calculate('+', 4, 5));
        System.out.println(calculate('&', 4, 5));
    }
}
