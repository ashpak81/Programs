package Oops;


class personalDetails {

    String name;
    private int password;
    int age;

    personalDetails(String name, int password, int age) {
        this.name = name;
        this.password = password;
        this.age = age;
    }

    void setAge(int age1){
        if (age1 >= 18 && age1 < 100)
                age = age1;
        else
            age = -1;
    }

    int getAge(){
        return  age;
    }

    void showData() {
        System.out.println(name + " " + password + " " + age);
    }
}


public class Encapsulation {


    public static void main(String[] args) {

        personalDetails en = new personalDetails("Ashpak", 2002, 22);
        en.name = "Sana";
        System.out.println(en.getAge());
    }

}

