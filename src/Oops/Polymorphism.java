package Oops;

class Superclass{
    void print(){
        System.out.println("SuperClass");
    }
}

class Subclass extends Superclass{

    // method Overriding
    void print(){
        System.out.println("Subclass");
    }
}

public class Polymorphism extends Superclass {


    // Method overloading

    float add(float a, float b) {
        return a + b;
    }

    float add(int a, int b, int c) {
        return a + b + c;
    }

    float add(float a, int b, int c) {
        return a + b + c;
    }

    int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {

        Polymorphism obj = new Polymorphism();

        System.out.println(obj.add(20, 23));
        System.out.println(obj.add(20, 30, 10));
        System.out.println(obj.add(20, 30, 10, 40));
        System.out.println(obj.add(20.51f, 30, 10));


    }
}
