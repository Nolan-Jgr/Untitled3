//Name:         Nolan Jaeger
//Class:        CSE 1322L
//Intructor:    Jorge
//Term:         Spring 2021
//Assignment:   6
public class DiscountBooking extends Ticket{
    private double price;
    private int numDaysUntilGame;
    public DiscountBooking(int nums)
    {
        super();
        numDaysUntilGame = nums;
        if(numDaysUntilGame == 0)
        {
            price = 75.00;
        }
        else
        {
            price = 10.00;
        }
    }
    @Override
    public double getPrice() {
        return price;
    }
    @Override
    public String toString()
    {
        if(numDaysUntilGame == 0)
            return "Ticket Number " + this.getTicketNumber() + " with price " + getPrice() + " is a discount ticket for today's game";
        else
            return "Ticket Number " + this.getTicketNumber() + " with price " + getPrice() + " is a discount ticket for a game in " + numDaysUntilGame + " days";
    }
}
