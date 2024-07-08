package Practice;

import java.util.Scanner;

public class SUPPLY {
     int Code;
     String FoodName;
     String Sticker;
     String FoodType;

    void GetType(String Sticker) {
        if (Sticker.equals("Green")) {
            FoodType = "Vegetarian";
        } else if (Sticker.equals("Yellow")) {
            FoodType = "Contains Egg";
        } else if (Sticker.equals("Red")) {
            FoodType = "Non Vegetarian";
        } else {
            FoodType = "Unknown";
        }
    }

    public void FoodIn() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the code: ");
        Code = sc.nextInt();

        System.out.println("Enter the food name: ");
        FoodName = sc.next();

        System.out.println("Enter the sticker: (Green,Yellow,Red):  ");
        Sticker = sc.next();

        GetType(Sticker);
    }

    public void foodOut() {
        System.out.println("Code: " + Code);
        System.out.println("Food Name: " + FoodName);
        System.out.println("Sticker: " + Sticker);
        System.out.println("Food Type: " + FoodType);
    }

    public static void main(String[] args) {

        SUPPLY obj = new SUPPLY();
        obj.FoodIn();
        obj.foodOut();
    }
}
