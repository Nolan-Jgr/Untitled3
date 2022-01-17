//Name:         Nolan Jaeger
//Class:        CSE 1322L
//Term:         Spring 2021
//Instructor:   Jorge
//Assignment:   4
package assignment4;

public class Spanish extends Language{

	@Override
	public String make_Guess() {
		return "Adivina un numero";
	}

	@Override
	public String too_low() {
		return "Demasiado bajo";
	}

	@Override
	public String too_high() {
		return "Demasiado alto";
	}

	@Override
	public String correct() {
		return "Correcto";
	}

}
