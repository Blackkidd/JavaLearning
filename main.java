
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class main {
    public static void menu() {
        System.out.println("--------Menu--------");
        System.out.println("0. Exit");
        System.out.println("1. Insert");
        System.out.println("2. Update");
        System.out.println("3. Delete");
        System.out.println("4. Search");
        System.out.println("5. Display");
        System.out.println("--------------------");
        System.out.print("Your options: ");
    }

    public static void main(String[] args) {

        int checkOptions;
        String employeeName = "";
        boolean dataFound;

        // []carList
        List<Car> carList = new ArrayList<Car>();

        Scanner scanKeyboard = new Scanner(System.in);
        Scanner scanKeyboardString = new Scanner(System.in);

        // Start
        System.out.print("Enter Your Name: ");
        employeeName = scanKeyboard.next();

        // menu select
        do {
            // ListInterator > cursors
            ListIterator<Car> clist = carList.listIterator();
            // Iterator > loop in List<Car>
            Iterator<Car> carIterator = carList.iterator();

            System.out.println("--------------------");
            System.out.println("USERNAME : " + employeeName);
            menu();
            checkOptions = scanKeyboard.nextInt();
            switch (checkOptions) {
                // Exit
                case 0:
                    System.out.println("Exit...");
                    break;
                // Insert
                case 1:
                    System.out.println("--------Insert--------");
                    System.out.print("Enter Car ID: ");
                    int newCarId = scanKeyboard.nextInt();

                    System.out.print("Enter Car Name: ");
                    String newCarName = scanKeyboardString.nextLine();

                    System.out.print("Enter Car Type: ");
                    String newCarType = scanKeyboardString.nextLine();

                    System.out.print("Enter Car Price: ");
                    int newCarPrice = scanKeyboard.nextInt();

                    // create new
                    carList.add(new Car(newCarId, newCarName, newCarType, newCarPrice));
                    System.out.println("insert success.");

                    break;
                // Update
                case 2:
                    System.out.println("---UPDATE---");
                    // ListInterator > cursors
                    // ListIterator<Car> clist = carList.listIterator();
                    // Iterator > loop in List<Car>
                    // Iterator<Car> carIterator = carList.iterator();

                    dataFound = false;
                    System.out.print("Enter ID : ");
                    newCarId = scanKeyboard.nextInt();
                    while (clist.hasNext()) {
                        Car cars = clist.next();
                        if (cars.getCarId() == newCarId) {
                            System.out.print("Enter New Name(" + cars.getCarName() + "): ");
                            newCarName = scanKeyboard.next();
                            System.out.print("Enter New Type: ");
                            newCarType = scanKeyboard.next();
                            System.out.print("Enter New Price ");
                            newCarPrice = scanKeyboard.nextInt();

                            // update
                            clist.set(new Car(newCarId, newCarName, newCarType, newCarPrice));
                            dataFound = true;
                        }
                    }
                    if (!dataFound) {
                        System.out.print("Car Not Found");
                    } else {
                        System.out.println("Data Updated");
                    }
                    break;
                // Delete
                case 3:
                    System.out.println("---DELETE---");
                    dataFound = false;
                    System.out.println("---Enter ID---");
                    newCarId = scanKeyboard.nextInt();
                    carIterator = carList.iterator();
                    while (carIterator.hasNext()) {
                        Car cars = carIterator.next();
                        if (cars.getCarId() == newCarId) {
                            carIterator.remove();
                            System.out.println("Car ID: " + newCarId + " has Delete");
                            dataFound = true;
                        }
                    }
                    if (!dataFound) {
                        System.out.print("Car Not Found");
                    } else {
                        System.out.println("Data Deleted");
                    }
                    break;

                // Search
                case 4:
                    System.out.println("---SEARCH---");
                    dataFound = false;
                    System.out.println("---Enter ID---");
                    newCarId = scanKeyboard.nextInt();
                    carIterator = carList.iterator();

                    while (carIterator.hasNext()) {
                        Car cars = carIterator.next();
                        if (cars.getCarId() == newCarId) {
                            System.out.println(cars);
                            dataFound = true;
                        }
                    }
                    if (!dataFound) {
                        System.out.println("Data Not Found!!");
                    }
                    break;
                // Display
                case 5:
                    carIterator = carList.iterator();
                    while (carIterator.hasNext()) {
                        Car cars = carIterator.next();
                        System.out.println(cars + "\n");
                    }
                    break;
            }
        } while (checkOptions != 0);
    }
}
