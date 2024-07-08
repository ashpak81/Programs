package Practice;

public class carRentalL {
     int CarId;
     String CarType;
     float Rent;

    public void GetCar(int carId, String carType) {
        this.CarId = carId;
        this.CarType = carType;
        GetRent();
    }

    public void GetRent() {
        if (CarType.equals("Small Car")) {
            Rent = 1000;
        } else if (CarType.equals("Van")) {
            Rent = 800;
        } else if (CarType.equals("SUV")) {
            Rent = 2500;
        } else {
            Rent = 0;
        }
    }

    public void ShowCar() {
        System.out.println("Car ID: " + CarId);
        System.out.println("Car Type: " + CarType);
        System.out.println("Rent: " + Rent);
    }

    public static void main(String[] args) {
        carRentalL carRental = new carRentalL();
        carRental.GetCar(1, "SUV");
        carRental.ShowCar();
    }
}