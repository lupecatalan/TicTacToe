
public class TicTacToeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TicTacToe ttt = new TicTacToe(); 
	
		ttt.game();
		ttt.playAndSwitchPlayers();
		ttt.makeMove(0,0);
		ttt.printBoard();
		ttt.checkForWins(0,0);
	} 
}

