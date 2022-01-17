//Nolan Jaeger
//CSE 1322L
//Jorge
//Spring 2021
//Assignment 2
package Assignment2;
import java.util.*;


public class Caesar {
	private ArrayList<Character> alphabet = new ArrayList<Character>();
	public Caesar()
	{
		for(char letter = 'a'; letter <= 'z'; letter++)
		{
			alphabet.add(letter);
		}
	}
	public int position_of_char(Character c)
	{
		int index = 0;
		for(Character i: alphabet)
		{
			if(i == c)
			{
				return index;	
			}
			else
			{
				index++;
			}
		}
		return index;
	}
	public Character letter_at_pos(int x)
	{
		if(x >= alphabet.size())
		{
			return '/';
		}
		return alphabet.get(x);
	}
	public Character encrypt_char(Character c)
	{
		int letter = position_of_char(c);
		letter+=3;
		if(letter >= 26)
		{
			letter -= 26;
		}
		Character e = letter_at_pos(letter);
		return e;
	}
	public Character decrypt_char(Character c)
	{
		int letter = position_of_char(c);
		letter -= 3;
		if(letter < 0)
		{
			letter += 26;
		}
		Character e = letter_at_pos(letter);
		return e;
	}
	public String encrypt(String s)
	{
		String ciphertext = "";
		for(int i = 0; i < s.length();i++)
		{
			Character x = s.charAt(i);
			ciphertext += encrypt_char(x);
		}
		return ciphertext;
	}
	public String decrypt(String s)
	{
		String ciphertext = "";
		for(int i = 0; i < s.length();i++)
		{
			Character x = s.charAt(i);
			ciphertext += decrypt_char(x);
		}
		return ciphertext;
	}

}
