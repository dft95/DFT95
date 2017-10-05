package hw3; // Find out how to take the results from the three functions, and combine them in another function,
// formatted correctly

import java.util.Scanner;

public class MainApp {

    public static Scanner sc = new Scanner(System.in); // this creates the scanner


    public static void getRoomInfo() {
        String roomTypeOne;
        String roomTypeTwo;
        String roomTypeThree;
        String roomTypeFour;
        String roomTypeFive;

        System.out.println();
        System.out.println("Number of rooms: ");
        roomTypeOne = sc.next(); // use nextLine if you want the user to use only one line
        System.out.println("Living room area: ");
        int roomAreaOne = sc.nextInt();
        System.out.println("Dining room area: ");
        int roomAreaTwo = sc.nextInt();
        System.out.println("Bedroom One area: ");
        int roomAreaThree = sc.nextInt();
        System.out.println("Bedroom Two area: ");
        int roomAreaFour = sc.nextInt();
        System.out.println("Kitchen area: ");
        int roomAreaFive = sc.nextInt();
        System.out.println("Bathroom area: ");
        int roomAreaSix = sc.nextInt();

        double totalArea;
        totalArea = ((roomAreaOne) + (roomAreaTwo) + (roomAreaThree) + (roomAreaFour) + (roomAreaFive) + (roomAreaSix));// ADD THREE MORE OF THE ABOVE
        System.out.println("Total Area: " + totalArea);
        double pricePerSqFt = 150.50;
    }//getRoomInfo close

    public static void getInputTwo() {

        // House Number: 123a<Enter> //the enter equals decimal 10/Line Feed. it is a white space character
        //  Street Name: Main Street<Enter>
        //         Town: Fall River<Enter>
        //          Zip: 01234<Enter>
        //        State: MA<Enter>
        System.out.print("House Number: ");
        String houseNumber = sc.next();
        sc.nextLine(); // consumes/gets rid of, the Line Feed (Enter)
        System.out.print("Street Name: ");
        String streetName = sc.nextLine(); // nextLine is the method used to get everything including white space
        System.out.print("        Town: ");
        String town = sc.nextLine();
        System.out.print("       State: ");
        String state = sc.nextLine();
        System.out.print("         Zip: ");
        String zip = sc.nextLine();

        System.out.println(); // this adds a line for formatting
        System.out.print("[" + houseNumber + "]");
        System.out.print("[" + streetName + "]");
        System.out.print("[" + town + "]");
        System.out.print("[" + state + "]");
        System.out.print("[" + zip + "]");

        System.out.print("done");
    }//getInputTwo close

    public static void getInputOne() {

        int i = sc.nextInt();
        double d = sc.nextDouble();
        String str = sc.next();
        String textLine = sc.nextLine();
    }//getInput close

    public static void main(String[] args) {
// put code here that executes the stuff above
        //getInputTwo(); // executes the getInputTwo function
        getRoomInfo(); // executes the getRoomInfo function
    }
}
