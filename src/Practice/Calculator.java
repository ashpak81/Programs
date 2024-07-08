package Practice;
public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Integer Operations:");
        System.out.println("5 + 3 = " + calc.add(5, 3));
        System.out.println("5 - 3 = " + calc.subtract(5, 3));
        System.out.println("5 * 3 = " + calc.multiply(5, 3));

        System.out.println("Double Operations:");
        System.out.println("5.5 + 3.3 = " + calc.add(5.5, 3.3));
        System.out.println("5.5 - 3.3 = " + calc.subtract(5.5, 3.3));
        System.out.println("5.5 * 3.3 = " + calc.multiply(5.5, 3.3));
    }
}

