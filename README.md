
# Airline Ticket Calculator

## **Description**  
This Java program calculates the total cost of an airline ticket based on several factors, including:  
- Distance to be flown (mileage cost)  
- Number of checked bags (baggage fee)  
- Seat type preference (window, aisle, or middle)  
- Discounts for flights over 1000 miles  

The program ensures users can input their flight details and receive a clear breakdown of their total ticket price.  

## **Features**  
✅ Calculates airfare based on miles flown  
✅ Limits checked baggage to a maximum of 4 per person  
✅ Applies additional costs for seat upgrades (window or aisle)  
✅ Provides a **6.5% discount** for flights exceeding **1000 miles**  
✅ Displays a formatted ticket cost breakdown  

## **How to Run**  

1. **Compile the program** using the command:  
   ```sh
   javac AirlineTicketCosts.java
   ```  
2. **Run the program**:  
   ```sh
   java AirlineTicketCosts
   ```  
3. **Follow the on-screen prompts** to enter your flight details.  

## **Example Input & Output**  
```
Airline Ticket Price Calculator

Enter whole miles to be flown:
1200
Add baggage, or carry-on only (B or C)?
B
How many bags?
2
Seat type (1 for window, 2 for aisle, 3 for middle)?
1

TICKET DETAILS
Miles flown:            1200
Seat type:              window
Number of bags:         2

TICKET PRICE
Mileage Cost:           252.00
Seat cost:              19.00
Baggage cost:           +50.00
                        ----------
                        321.00
Discount:               -20.87
                        ----------
                        300.13
```

## **Technologies Used**  
- **Java** (Standard Edition)  
- **Scanner Class** (User input handling)  
- **Basic conditionals and calculations**  

## **Author**  
👤 **Samik Dahal**  

