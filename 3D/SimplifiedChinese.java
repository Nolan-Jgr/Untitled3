//Name:         Nolan Jaeger
//Class:        CSE 1322L
//Term:         Spring 2021
//Instructor:   Jorge
//Assignment:   4
package assignment4;

public class SimplifiedChinese extends Language {

	@Override
	public String make_Guess() {
		return "猜一个数字";
	}

	@Override
	public String too_low() {
		return "太低 ";
	}

	@Override
	public String too_high() {
		return "太高";
	}

	@Override
	public String correct() {
		return "正确";
	}

}
