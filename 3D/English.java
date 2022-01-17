//Name:         Nolan Jaeger
//Class:        CSE 1322L
//Term:         Spring 2021
//Instructor:   Jorge
//Assignment:   4
package assignment4;

public class English extends Language{

	@Override
	public String make_Guess() {
		return "Guess a number";
	}

	@Override
	public String too_low() {
		return "Too Low";
	}

	@Override
	public String too_high() {
		return "Too High";
	}

	@Override
	public String correct() {
		return "Correct";
	}

}
