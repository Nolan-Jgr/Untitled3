//Nolan Jaeger
//CSE 1322L
//Jorge
//Spring 2021
//Assignment10
package assignment10;
import java.util.*;

public class ConnectFour {
	char[][] c = new char[6][7];
	String turn;
	char token;
	public ConnectFour() {
		for(int i = 0; i < 6;i++)
		{
			for(int j = 0; j < 7;j++)
			{
				c[i][j] = ' ';
			}
		}
		turn = "Red";
		token = 'R';
	}
	public void nextTurn()
	{
		if(turn.equals("Red"))
		{
			turn = "Yellow";
			token = 'Y';
		}
		else
		{
			turn = "Red";
			token = 'R';
		}
	}
	public int nextAvailablePosition(int col)
	{
		for(int i = c.length-1; i >= 0;i--)
		{
			if(c[i][col] == ' ')
			{
				return i;
			}
		}
		return -1;
	}
	public void dropPiece(int col, char t)
	{
		try {
			if(col >= c[0].length || col < 0)
			{
				throw new ArrayIndexOutOfBoundsException("Not a spot on board");
			}
			if(nextAvailablePosition(col) == -1)
			{
				throw new ColumnFull("Column is full");
			}
			c[nextAvailablePosition(col)][col] = t;

		}
		catch(ColumnFull cf)
		{
			System.out.println(cf.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println(a.getMessage());
		}
		finally {
			
		}
	}
	@Override
	public String toString() {
	String to_return= "  0   1   2   3   4   5   6";
	for(int i=0;i<6;i++) {
	to_return += "\n-----------------------------\n";
	to_return+="| ";
	for(int j=0;j<7;j++) {
	to_return+= c[i][j]+" | ";
	}
	}
	to_return+="\n-----------------------------\n";
	return to_return;
	}
	public static void main(String[] args)
	{
		ConnectFour board = new ConnectFour();
		int input;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println(board.toString());
			System.out.println("Which column would " + board.turn + " like to go in(9 to quit)");
			input = scan.nextInt();
			try {
				if(board.nextAvailablePosition(input) == -1)
				{
					throw new ColumnFull("Column is full");
				}
				else
				{
					board.dropPiece(input, board.token);
					board.nextTurn();
				}
			}
			catch(ColumnFull cf)
			{
				System.out.println(cf.getMessage());
			}
			finally {
				
			}
		}while(input != 9);
		
	}
	

}
