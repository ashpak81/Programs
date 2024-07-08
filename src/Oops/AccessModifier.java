package Oops;


class A{
private int a = 23;
}
class B extends A{
    void printData(){
//        System.out.println(a);
    }
}
public class AccessModifier {

    public static void main(String[] args) {
         B obj = new B();
//         obj.printData(); // we cant Access here becouse a is private
    }

    

}
