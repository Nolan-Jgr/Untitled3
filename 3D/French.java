//Name:         Nolan Jaeger
//Class:        CSE 1322L
//Term:         Spring 2021
//Instructor:   Jorge
//Assignment:   4
package assignment4;

public class French extends Language{

	@Override
	public String make_Guess() {
		return "Devinez un nombre";
	}

	@Override
	public String too_low() {
		return "Trop bas";
	}

	@Override
	public String too_high() {
		return "Trop haut";
	}

	@Override
	public String correct() {
		return "Correct";
	}

}
