//Name:         Nolan Jaeger
//Class:        CSE 1322L
//Intructor:    Jorge
//Term:         Spring 2021
//Assignment:   6
public abstract class Ticket {
    private static int count = 1;
    private int ticketNumber;
    public Ticket()
    {
        ticketNumber = count;
        count++;
    }
    public int getTicketNumber()
    {
        return ticketNumber;
    }
    public abstract double getPrice();
    @Override
    public String toString()
    {
        return "Ticket number " + ticketNumber + " with a price of " + getPrice();
    }
}
