package Practice;
class Book extends  Author{

    Book(){
        super("Ashpak","ashpakpatel81@gmail.com" , 'M');
    }

    private  String name;
    private double price;
    private int qty;

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String getAuthor(){
         return  super.getName();
    }

    public double getPrice(){
        return  price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getQty(){
        return qty;
    }

    public void setQty(int qty){
        this.qty = qty;
    }

    public void bookdetails (){
        System.out.println(name+"by" + getAuthor() + "(" + super.getGender() +")" +"at" + getMail());
    }
}

public class Author {

    private String name;
    private String eMail;
    private char gender;

    Author(String name, String eMail, char gender) {
        this.eMail = eMail;
        this.gender = gender;
        this.name = name;
    }

    String getName() {
        return name;
    }

    String getMail() {
        return eMail;
    }

    void setMail(String eMail) {
        this.eMail = eMail;
    }

    char getGender() {
        return gender;
    }

    void Details() {
        System.out.println(name + "(" + gender + ")" + eMail + "");
    }

    public static void main(String[] args) {
        Author obj = new Author("Ashpak", "ashpakpatel81@gmail.com", 'M');
        obj.Details();
    }
}
