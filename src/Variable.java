import java.util.Scanner;

public class Variable {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        /*

//      Q.8  You're creating a program to evaluate job applicants based on their qualifications and
//        experience. Implement a Java program using if-else statements to assess the eligibility of
//        each applicant for a job position

        System.out.println("Enter number of qualification 1.10th , 2.12th, 3.graduation");
        int qualification = sc.nextInt();
        System.out.println("Enter Your experience in years");
        int experience = sc.nextInt();

        if(qualification == 3 && experience >=2){
            System.out.println("You can Applay for this role");
        }else {
            System.out.println("You Cant apply");
        }

//      Q.9  You're developing a weather recommendation program that suggests activities based
//           on the current temperature. Implement a Java program using if-else statements to
//           provide recommendations as follows:
//                    If the temperature is below 10°C, recommend skiing.
//                    If the temperature is between 10°C and 20°C (inclusive), recommend hiking.
//                    If the temperature is between 20°C and 30°C (inclusive), recommend cycling.
//                    If the temperature is above 30°C, recommend swimming


        System.out.println("Enter the Temperature ");
        int Temp = sc.nextInt();

        if (Temp < 10) {
            System.out.println("Skiing ");
        } else if (Temp > 10 && Temp < 20) {
            System.out.println("hiking ");
        } else if (Temp > 20 && Temp < 30) {
            System.out.println("Cycling");
        } else {
            System.out.println("Swimming");
        }


//      Q.8 You're developing a program to calculate the final grade of a student based on their
//test scores. Implement a Java program using if-else statements to determine the grade
//according to the following grading scale:
// If the score is between 90 and 100 (inclusive), assign grade A.
// If the score is between 80 and 89 (inclusive), assign grade B.
// If the score is between 70 and 79 (inclusive), assign grade C.
// If the score is between 60 and 69 (inclusive), assign grade D.
// If the score is below 60, assign grade F.

        System.out.println("Enter Your test Score ");

        int testScore = sc.nextInt();

        if (testScore >= 90 && testScore <= 100) {
            System.out.println("your grade is A ");
        } else if (testScore >= 80 && testScore <= 89) {
            System.out.println("Your grade is B ");
        } else if (testScore >= 70 && testScore <= 79) {
            System.out.println("Your grade is C ");
        } else if (testScore >= 60 && testScore <= 69) {
            System.out.println("Your grade is D ");
        } else {
            System.out.println("FAIL ..........");
        }




//      Q.9  You're tasked with creating a program to calculate the total bill for customers at a
//restaurant. Implement a Java program using if-else statements to calculate the bill based
//on the items ordered and their prices. The program should also apply any applicable
//discounts or service charges.
// Consider the following menu:
// Starter: $5.00
// Main Course: $10.00
// Dessert: $4.50
// Drinks: $2.50
// Additional rules:
// If the total bill is above $50, apply a 10% discount.
// If the customer orders a dessert, offer a 20% discount on the dessert if they also order a
//main course

        System.out.println("How many Starter do you want($5.00): ");
        float starter = sc.nextFloat();

        System.out.println("How many Main Course do you want($10.00): ");
        float mainCourse = sc.nextFloat();

        System.out.println("How many Dessert do you want($4.50): ");
        float dessert = sc.nextFloat();

        System.out.println("How many Drinks do you want($2.50): ");
        float drinks = sc.nextFloat();

        float total = (starter * 5) + (mainCourse * 10) + (dessert * 4.50f) + (drinks * 2.50f);
        boolean discount = false;
        float total_discount  = 0;
        if (total > 50) {
            System.out.println("Congrats you got 10 % discount on order above $50");
        }
        if (dessert > 0) {
            if (mainCourse > 0) {
                System.out.println("Congrats you got 20 % discount for ordering Dessert and Main Course ");
                discount = true;

            } else {
                System.out.println("If you add main_course you get 20 % discount");
            }
        }

        if(total > 50) {
            total_discount =  total * 10 /100;
        }

        if (discount == true){
            total_discount =  total * 20 /100;
        }

        System.out.println("Your bill Amount is " + total);
        System.out.println("After Discount Your bill Amount is "+ (total - total_discount));



         */
//        10. You're tasked with creating a program to calculate the fine for overdue library books.
//        Implement a Java program using if-else statements to determine the fine based on the
//        number of days the book is overdue.
//          Rules:
//        If the book is returned within 7 days of the due date, there is no fine.
//        If the book is returned between 8 and 30 days after the due date, the fine is $1.00 per day.
//        If the book is returned more than 30 days after the due date, the fine is $2.00 per day

        System.out.println("Enter Due Day : ");
        int dueDay = sc.nextInt();

        if (dueDay <= 7) {
            System.out.println("No fine");
        }else if(dueDay >7 && dueDay<=30){
            System.out.println("Fine is " + (dueDay - 7));
        } else if (dueDay > 30) {
            System.out.println("Fine is " + (dueDay-7) * 2);
        }
    }
}
