public class Car {
    private int carId;
    private String carName;
    private String carType;
    private int carPrice;

    // method
    Car(int carId, String carName, String carType, int carPrice) {
        this.carId = carId;
        this.carName = carName;
        this.carType = carType;
        this.carPrice = carPrice;
    }

    // get ; ดึงข้อมูล
    public int getCarId() {
        return carId;
    }

    public String getCarName() {
        return carName;
    }

    public String getCarType() {
        return carType;
    }

    public int getCarPrice() {
        return carPrice;
    }

    public String toString() {
        return carId + " " + carName + " " + carType + " " + carPrice;
    }

    // public void displayCar() {
    // System.out.println("ID = " + this.carId);
    // System.out.println("NAME = " + this.carName);
    // System.out.println("TYPE = " + this.carType);
    // System.out.println("PRICE = " + this.carPrice);
    // }
}