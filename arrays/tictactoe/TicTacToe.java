package arrays.tictactoe;

public class TicTacToe {
	
	public final int EMPTY = 0;
	public final String NOT_EMPTY_POSITION = "Position already filled";
	private int board[][] = null;
	private int player = 1; // X starts first
	private int winner = EMPTY;
	private boolean gameOver = false;
	
	public int getWinner() {
		return winner;
	}

	public TicTacToe(){
		board = new int[3][3];
	}
	
	public void displayBoard(){
		StringBuilder result = new StringBuilder();
		char mark = 'O';
		
		for (int i = 0; i < board.length; i++){
			for ( int j = 0; j < board[0].length; j++){
				switch (board[i][j]){
				case 0:
					mark = ' ';
					break;
				case 1:
					mark = 'X';
					break;
				case -1:
					mark = 'O';
					break;
				}
				result.append(j < 2 ? mark + " | " : mark);	
			}
			result.append(i < 2 ? "\n---------\n" : "\n");
		}
		
		System.out.println(result);
	}
	
	public void playNext(int i, int j){
		
		if (gameOver){
			return;
		}
		
		if (i < 0 || i > 2 || j < 0 || j > 2){
			throw new IllegalArgumentException("Not a valid board position");
		} else if (board[i][j] != EMPTY){
			throw new IllegalArgumentException(NOT_EMPTY_POSITION);
		} else {
			board[i][j] = player;
			if (hasWon()){
				winner = player;
				gameOver = true;
			} else {
			player =- player;
			}
		}
	}
	
	private boolean hasWon(){
		// TODO: Make this logic more efficient by breaking out of the loop early.
		int leftDiagonalSum = 0, rightDiagonalSum = board[2][0] + board[1][1] + board[0][2];
		int prod = 1; // to determine if game is tie. If prod of all elements is non zero, then it is a tie.
		
		for (int i = 0; i < 3; i++){
			int horizontalSum = 0, verticalSum = 0;
			
			for (int j = 0; j < 3; j++){
				horizontalSum += board[i][j];
				verticalSum += board[j][i];
				prod *= board[i][j];
				
				if (i == j){
					leftDiagonalSum += board[i][j];
				}
				
				if ( (horizontalSum == player * 3) || (verticalSum == player * 3)){
					return true;
				}
			}	
		}
		
		gameOver = prod == 0 ? false : true;
		
		
		return (leftDiagonalSum == player*3 || rightDiagonalSum == player*3);
	}

	public boolean isGameOver() {
		return gameOver;
	}

}
