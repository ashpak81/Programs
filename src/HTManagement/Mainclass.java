package HTManagement;

public class Mainclass {

    String name;
    float salary;
    int joiningDate;
    static String department = "FSD";
    static String companyName = "MindTree";

    public Mainclass(String name, float salary, int joiningDate) {
        this.name = name;
        this.salary = salary;
        this.joiningDate = joiningDate;
    }

    public void printDetails() {
        System.out.println(name);
        System.out.println(joiningDate);
        System.out.println(department);

        if (salary < 20000) {
            System.out.println((salary * 110) / 100);
        } else {
            System.out.println(salary);
        }

        System.out.println(companyName);
    }

    public static void main(String[] args) {
        Mainclass comDetails = new Mainclass("Ashpak", 8000f, 15);
        comDetails.printDetails();
    }

}
