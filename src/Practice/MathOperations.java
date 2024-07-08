package Practice;

public class MathOperations {

    // Write a Java Program and create a class called MathOperations with methods to perform various mathematical operations
    // such as finding the square root, cube root, and factorial of a number.
    // Implement method overloading for the factorial method to handle both integer and long data types.

    public double squareRoot(double number) {
        return Math.sqrt(number);
    }

    public double cubeRoot(double number) {
        return Math.cbrt(number);
    }

    public int factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public long factorial(long number) {
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        long result = 1;
        for (long i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();

        double number = 16;
        System.out.println("Square root of " + number + " is " + mathOps.squareRoot(number));

        number = 27;
        System.out.println("Cube root of " + number + " is " + mathOps.cubeRoot(number));

        int intNumber = 5;
        System.out.println("Factorial of " + intNumber + " is " + mathOps.factorial(intNumber));

        long longNumber = 20;
        System.out.println("Factorial of " + longNumber + " is " + mathOps.factorial(longNumber));
    }


}
