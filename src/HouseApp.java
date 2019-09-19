import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HouseApp {

    public static void main(String[] args) {

        int numWindow;
        int numFloor;
        int numDoor;
        double salesPrice;
        int sqFt;
        String winDesign;
        String flooringType;

        // present house
//        House presentHouse = new House(new Floor(),new Window(),new Door(),2000, 30000);
//            presentHouse.getFloor().setNumFloor(2);
//            presentHouse.getWindow().setNumWindow(10);
//            presentHouse.getDoor().setNumDoor(3);
//
//
//        System.out.println("My present home has " + presentHouse.getFloor().getNumFloor() + " floors,\t" +
//                presentHouse.getWindow().getNumWindow() + " windows,\t" +
//                presentHouse.getDoor().getNumDoor() +" doors,\t" +
//                presentHouse.getSqFt()+" sq ft area and it is worth $ " + presentHouse.getSalesPrice());

        List<House> houses = new ArrayList<>();
        Scanner input = new Scanner(System.in);

//        System.out.println("Do you want to purchase a house? Y / N" );
//        String response = input.nextLine();
//
//        while (!(response.equalsIgnoreCase("N"))){
//


        System.out.println("Please enter number of Floor");
        numFloor = input.nextInt();
        System.out.println("Please enter Flooring Type.");
        input.nextLine();
        flooringType = input.nextLine();
        System.out.println("Please enter number of window");
        numWindow = input.nextInt();
        input.nextLine();
        System.out.println("Please enter designs of window");
        winDesign = input.nextLine();
        input.nextLine();
        System.out.println("Please enter number of doors");
        numDoor = input.nextInt();
        System.out.println("Please enter price of house");
        salesPrice = input.nextDouble();
        System.out.println("Please enter sq feet");
        sqFt = input.nextInt();

        House futureHouse = new House();

        Floor floor = new Floor();
        floor.setNumFloor(numFloor);
        floor.setFlooringType(flooringType);
        futureHouse.setFloor(floor);


        Window window = new Window();
        window.setNumWindow(numWindow);
        window.setWinDesign(winDesign);
        futureHouse.setWindow(window);

        Door door = new Door();
        door.setNumDoor(numDoor);
        futureHouse.setDoor(door);

        futureHouse.setSalesPrice(salesPrice);

        futureHouse.setSqFt(sqFt);

        houses.add(futureHouse);

        System.out.println(futureHouse.displayHouse());

        System.out.println("\nMy house wishlists are: " + houses);



    }
}