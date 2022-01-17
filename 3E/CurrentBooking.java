//Name:         Nolan Jaeger
//Class:        CSE 1322L
//Intructor:    Jorge
//Term:         Spring 2021
//Assignment:   6
public class CurrentBooking extends Ticket{
    private double price;
    public CurrentBooking(){
        super();
        price = 75.00;
    }
    @Override
    public double getPrice() {
        return price;
    }
    @Override
    public String toString()
    {
        return "Ticket Number " + this.getTicketNumber()  + " with price " + getPrice() + " for today's game";
    }
}
