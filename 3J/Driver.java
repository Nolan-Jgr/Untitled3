//Nolan Jaeger
//CSE 1322L
//Jorge
//Spring 2021
//Assignment11
package assignment11;
import java.util.*;
import java.io.*;

public class Driver {
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		try {
		System.out.println("Enter a file name");
		@SuppressWarnings("resource")
		Scanner scan1 = new Scanner(System.in);
		String fileName = scan1.next();
		System.out.println();
		String str = "";
		File file = new File(fileName);
		@SuppressWarnings("resource")
		Scanner scan2 = new Scanner(file);
		int line = 0;
		int words = 0;
		int Chars = 0;
		while(scan2.hasNextLine())
		{
			str = scan2.nextLine();
			String[] strArr = str.split(" ");
			for(String s: strArr)
			{
				words++;
			}
			for(String s: strArr)
			{
				char[] numChar = s.toCharArray();
				for(char c: numChar)
				{
					Chars++;
				}
			}
			line++;
			
		}
		System.out.println("Lines: " + line + "\nWords: " + words + "\nChars: " + Chars);
				
		}
		catch(IOException io)
		{
			System.out.println("Error: " + io.getMessage());
		}
		
	}
	

}
