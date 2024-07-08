package Practice;

public class StringManipulator {


    public String reverse(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }

    public String capitalize(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        return input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
    }

    public String append(String original, String toAppend) {
        return original + toAppend;
    }

    public String append(String original, char toAppend) {
        return original + toAppend;
    }

    public String append(String original, int toAppend) {
        return original + toAppend;
    }

    public static void main(String[] args) {
        StringManipulator strManipulator = new StringManipulator();

        String str = "hello";
        System.out.println("Reversed string: " + strManipulator.reverse(str));

        str = "java programming";
        System.out.println("Capitalized string: " + strManipulator.capitalize(str));

        String original = "Java";
        String toAppendString = " Programming";
        char toAppendChar = '!';
        int toAppendInt = 2024;

        System.out.println("Appended string: " + strManipulator.append(original, toAppendString));
        System.out.println("Appended character: " + strManipulator.append(original, toAppendChar));
        System.out.println("Appended integer: " + strManipulator.append(original, toAppendInt));
    }

}
