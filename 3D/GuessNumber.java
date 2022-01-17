//Name:         Nolan Jaeger
//Class:        CSE 1322L
//Term:         Spring 2021
//Instructor:   Jorge
//Assignment:   4
package assignment4;
import java.util.*;

public class GuessNumber {
	public void play_game()
	{
		int myRand = (int) (Math.random()*100+1);
		int guess;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose your language\n1. English\n2. Español\n3. Français\n4. 简体中文");
		int input = scan.nextInt();
		switch(input)
		{
		case 1:
			Language e = new English();
			System.out.println(e.make_Guess());
			guess = scan.nextInt();
			while(guess != myRand) 
			{
				if(guess < myRand)
				{
					System.out.println(e.too_low());
				}
				else if(guess > myRand)	
				{
					System.out.println(e.too_high());
				}
				System.out.println(e.make_Guess());
				guess = scan.nextInt();
			}
			if(guess == myRand)
			{
				System.out.println(e.correct());
			}
			break;
		case 2:
			Language s = new Spanish();
			System.out.println(s.make_Guess());
			guess = scan.nextInt();
			while(guess != myRand) 
			{
				if(guess < myRand)
				{
					System.out.println(s.too_low());
				}
				else if(guess > myRand)	
				{
					System.out.println(s.too_high());
				}
				System.out.println(s.make_Guess());
				guess = scan.nextInt();
			}
			if(guess == myRand)
			{
				System.out.println(s.correct());
			}
			break;
		case 3:
			Language f = new French();
			System.out.println(f.make_Guess());
			guess = scan.nextInt();
			while(guess != myRand) 
			{
				if(guess < myRand)
				{
					System.out.println(f.too_low());
				}
				else if(guess > myRand)	
				{
					System.out.println(f.too_high());
				}
				System.out.println(f.make_Guess());
				guess = scan.nextInt();
			}
			if(guess == myRand)
			{
				System.out.println(f.correct());
			}
			break;
		case 4: 
			Language c = new SimplifiedChinese();
			System.out.println(c.make_Guess());
			guess = scan.nextInt();
			while(guess != myRand) 
			{
				if(guess < myRand)
				{
					System.out.println(c.too_low());
				}
				else if(guess > myRand)	
				{
					System.out.println(c.too_high());
				}
				System.out.println(c.make_Guess());
				guess = scan.nextInt();
			}
			if(guess == myRand)
			{
				System.out.println(c.correct());
			}
			break;
		default:
			break;
		}
		
	}

}
