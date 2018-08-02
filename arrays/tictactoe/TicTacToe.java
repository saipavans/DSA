package arrays.tictactoe;

public class TicTacToe {
	
	private static final int X = 1, O = -1, EMPTY = 0;
	private int board[][] = null;
	private int player = X; // X starts first
	
	public TicTacToe(){
		board = new int[3][3];
	}
	
	public void displayBoard(){
		StringBuilder result = new StringBuilder();
		
		for (int i = 0; i < board.length; i++){
			for ( int j = 0; j < board[0].length; j++){
				result.append(j < 2 ? board[i][j] + " | " : board[i][j]);	
			}
			result.append(i < 2 ? "\n---------\n" : "\n");
		}
		
		System.out.println(result);
	}
	
	

}
