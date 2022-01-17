//Name:         Nolan Jaeger
//Class:        CSE 1322L
//Intructor:    Jorge
//Term:         Spring 2021
//Assignment:   6
public class AdvanceBooking extends Ticket{
    private double price;
    private int numDaysUntilGame;
    public AdvanceBooking(int num)
    {
        super();
        numDaysUntilGame = num;
        if(numDaysUntilGame >= 15)
        {
            price = 25.00;
        }
        else
        {
            price = 50.00;
        }
    }
    @Override
    public double getPrice() {
        return price;
    }
    @Override
    public String toString()
    {
        return "Ticket number " + this.getTicketNumber() + " with price " + getPrice() + " for a game in " + numDaysUntilGame + " days";
    }
}
