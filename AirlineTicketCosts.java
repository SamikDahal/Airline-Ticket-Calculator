import java.util.Scanner;

/*
 * Program description FIX ME
 *
 * Author: Samik Dahal
 */
public class AirlineTicketCosts {

    public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    int milesToFly;
    String borc;
    int numOfBags = 0;
    int seatType;
    String finalseatType = "error";

    double mileageCost = 0.0;
    double seatCost = 0.0;
    double baggageCost = 0.0;
    double perMile = 0.21;
    double upgradeSeat = 19.0;
    double perBag = 25.0;
    double totalPrice = 0.0;
    double discount = 0.0;
    double finalCost = 0.0;

    
    

    System.out.println("Airline Ticket Price Calculator");
    System.out.println("");
    System.out.println("Enter whole miles to be flown:");
    milesToFly = scnr.nextInt();
    System.out.println("Add baggage, or carry-on only (B or C)?");
    borc = scnr.next().toUpperCase();
    if (borc.equals("B")) {
        System.out.println("How many bags?");
        numOfBags = scnr.nextInt();
    
    }


    
    
    System.out.println("Seat type (1 for window, 2 for aisle, 3 for middle)?");
    seatType = scnr.nextInt();

    if (numOfBags > 4) {
            System.out.println("ERROR! Only 4 checked bags allowed per person");
            System.out.println("Program will lower number of checked bags to 4");
            numOfBags = 4;
    }
    
    if (seatType == 1){
        finalseatType = "window";
    }
    else if (seatType == 2) {
        finalseatType = "aisle";
    }
    else if (seatType == 3) {
        finalseatType = "middle";
    }


    System.out.println("");
    System.out.println("");
    System.out.println("TICKET DETAILS");
    
    System.out.printf("Miles flown:%18s\n", milesToFly);
    System.out.printf("Seat type:%20s\n", finalseatType);

    System.out.printf("Number of bags:%15s\n", numOfBags);
    
    System.out.println("");
    System.out.println("TICKET PRICE");
    mileageCost = milesToFly * perMile;
    System.out.printf("Mileage Cost:%17.2f\n", mileageCost);

    if (seatType == 3) {
        upgradeSeat = 0;
       
    }
    else {
        System.out.printf("Seat cost:%20.2f\n", upgradeSeat);
    }
    baggageCost = numOfBags * perBag;
    System.out.printf("Baggage cost:       +%9.2f\n", baggageCost);
    System.out.println("                    ----------");
    
    totalPrice = mileageCost + upgradeSeat + baggageCost;
    System.out.printf("%30.2f\n", totalPrice);
    discount = totalPrice * 0.065;

    if (milesToFly >= 1000) {
        System.out.printf("Discount:           -%9.2f\n", discount);
        System.out.println("                    ----------");
        finalCost = totalPrice - discount;
        System.out.printf("%30.2f\n", finalCost);
    }
    else{
        System.out.println("");
        System.out.println("No discount: Too few miles flown");
    }
    

    



    



    }
}