//Nolan Jaeger
//CSE 1322L
//Jorge
//Spring 2021
//assignment12
package assignment12;
import java.util.*;


public class Guesser implements Runnable{
	int threadID;
	static int nextThreadID = 0;
	public Guesser() {
		threadID = nextThreadID;
		nextThreadID++;
	}

	@Override
	public void run() {
		Random rand = new Random();
		int temp = rand.nextInt(1000000);
		int count = 1;
		while(temp!= 123456)
		{
			temp = rand.nextInt(1000000);
			count++;
		}
		System.out.println("I'm thread " + threadID + ", I just found the number on guess " + count);	
		
	}
	public static void main(String[]args) {
		Thread[] t = new Thread[100];
		for(int i = 0; i < t.length;i++)
		{
			Thread td = new Thread(new Guesser());
			t[i] = td;
		}
		for(Thread x: t)
		{
			x.start();
		}
	}

}
