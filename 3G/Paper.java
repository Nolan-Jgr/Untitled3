package assignment8;

public class Paper {
	public static void main(String[]args)
	{
		for(int i = 1; i < 10;i++)
		{
			String fold_string = paperFold(i);
			System.out.println("For " + i + " folds we get: " + fold_string + "\n");
		}
		
	}
	public static String reverse(String str)
	{
		if(str.isEmpty())
		{
			return str;
		}
		return reverse(str.substring(1)) + str.charAt(0);
	}
	public static String convert(String str)
	{
		String temp = "";
		if(str.isEmpty())
		{
			return str;
		}
		for(int i = 0;i < str.length();i++)
		{
			if(str.substring(i,i+1).equals("v"))
			{
				temp += "^";
			}
			if(str.substring(i,i+1).equals("^"))
			{
				temp += "v";
			}
		}
		return temp;
		
	}
	public static String paperFold(int x)
	{
		if(x == 1)
		{
			return "v";
		}
		else if(x == 0)
		{
			return "";
		}
		else
		{
			String temp = reverse(paperFold(x-1));
			String temp2 = convert(temp);
			return temp2 + "v" + paperFold(x-1);
		}
	}

}
