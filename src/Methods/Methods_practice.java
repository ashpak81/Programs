package Methods;

public class Methods_practice {

    static void swapTwoNum(int firstNumber, int secondNumber) {
        int temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;
        System.out.println(firstNumber + " " + secondNumber);
    }

    static int greatestOfThree(int firstNumber, int secondNumber, int thirdNumber) {
        int ans;
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            ans = firstNumber;
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            ans = secondNumber;
        } else {
            ans = thirdNumber;
        }
        return ans;
    }

    static boolean userSalary(int salary) {
        if (salary >= 20000 && salary <= 40000) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {

        swapTwoNum(5, 6);

        int greatestNumber = greatestOfThree(1, 2, 3);
        System.out.println("Greatest of three  " + greatestNumber);

        System.out.println(userSalary(40000));

    }
}
