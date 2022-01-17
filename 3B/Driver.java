//Nolan Jaeger
//CSE 1322L
//Jorge
//Spring 2021
//Assignment 2
package Assignment2;
import java.util.*;

public class Driver extends Caesar{
	public static void main(String[]args)
	{
		Caesar x = new Caesar();
		System.out.println("1. Encrypt Message\n2. Decrypt Message\n3. Quit");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		while(input != 3)
		{
			switch(input)
			{
			case 1:
				System.out.println("Enter message to encrypt");
				String str = scan.next();
				str = str.toLowerCase();
				System.out.println("The encrypted message is: " + x.encrypt(str));
				break;
			case 2:
				System.out.println("Enter encrypted message");
				String str1 = scan.next();
				str = str1.toLowerCase();
				System.out.println("the decrpted message is: " + x.decrypt(str1));
				break;
			default:
				break;
			}
		System.out.println("1. Encrypt Message\n2. Decrypt Message\n3. Quit");
		input = scan.nextInt();
		}
	}
}
