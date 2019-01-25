import java.util.Scanner; // Needed for Scanner class

public class TicTacToe {

	private Scanner s = new Scanner(System.in);
	// 2D Array for board 
	private char[][] board = new char[3][3]; 
	// To keep count of each move
	private char keepCount = 'x' ;
	// To hold row and columns 
	private int r, c;
	
	// Constructor 
	public TicTacToe()
	{

	}
	
	public void game()
	{
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				board[i][j] = ' ';
			}
		}
	}
	// To print board and make it look nice...
	public void printBoard()
	{
		System.out.println("+---+---+");
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				if(j == 0)
				{
					System.out.print("|");
				}
				else
					System.out.print(board[i][j] + "|");
			}
			System.out.println();
			System.out.println("+---+---+");
		}
	}

	public void playAndSwitchPlayers()
	{
		boolean play = true;
		
		while(play)
		{
			System.out.println("Please enter row (1-3): ");
			r = s.nextInt() - 1;
			System.out.println("Please enter column (1-3): ");
			c = s.nextInt() - 1;
			
			board[r][c] = keepCount;
			
			if(checkForWins(r,c))
			{
				play = false;
			}
			
			if(keepCount == 'x')
				keepCount = 'o';
			else
				keepCount = 'x';
		}	
	}
	
	public boolean makeMove(int r, int c) 
	{
		if ((r >= 0) && (r < 3)) 
		{
			if ((c>= 0) && (c < 3)) 
			{
				if (board[r][c] == ' ') 
				{
					board[r][c] = keepCount;
		            return true;
		        }
		    }
	    }
		return false;
	}

	// Checks the winner 
	public boolean checkForWins(int rWins, int cWins)
	{
		if(board[0][cWins] == board[1][cWins] && board[0][cWins] == board[2][cWins])
			return true;
		
		if(board[rWins][0] == board[rWins][0] && board[rWins][0] == board[rWins][2])
			return true;
			
		if(board[0][0] == board[1][1] && board[0][0] == board[2][2])
			return true;
			
		if(board[0][2] == board[1][1] && board[0][2] == board[2][0])
			return true;
			
		return false;
	}
}

