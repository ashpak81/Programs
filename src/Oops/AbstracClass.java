package Oops;

interface Animal {
    public void sound();
}

interface dog {
    public void sound();
}

class Tiger implements Animal, dog {
    public void sound() {
        System.out.println("Sound.........");
    }
}

public class AbstracClass {
    public static void main(String[] args) {
        Tiger obj = new Tiger();
        obj.sound();
    }
}
