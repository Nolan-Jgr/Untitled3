//Name:         Nolan Jaeger
//Class:        CSE 1322L
//Intructor:    Jorge
//Term:         Spring 2021
//Assignment:   6
import java.util.*;

public class Driver {
    public static void main(String[]args)
    {
        String menu = "1. Sell a ticket for a future game\n2. Sell a ticket for today's game\n3. Sell a discount ticket\n4. Print all tickets\n5. Exit";
        System.out.println("Choose the following: ");
        System.out.println(menu);
        ArrayList<Ticket> x = new ArrayList<Ticket>();
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        while(input != 5)
        {
            Ticket temp;
            int days;
            switch (input)
            {
                case 1:
                    System.out.println("How many days until the game?");
                    days = scan.nextInt();
                    temp = new AdvanceBooking(days);
                    x.add(temp);
                    System.out.println("You sold: " + temp.toString());
                    break;
                case 2:
                    temp = new CurrentBooking();
                    x.add(temp);
                    System.out.println("You sold: " + temp.toString());
                    break;
                case 3:
                    System.out.println("How many days until the game?");
                    days = scan.nextInt();
                    temp = new DiscountBooking(days);
                    x.add(temp);
                    System.out.println("You sold: " + temp.toString());
                    break;
                case 4:
                    for(Ticket t: x)
                    {
                        System.out.println(t.toString());
                    }
                    break;
                default:
                    System.out.println("Invalid input");
            }
            System.out.println("Choose the following: ");
            System.out.println(menu);
            input = scan.nextInt();
        }
    }
}
