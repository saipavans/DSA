package arrays.tictactoe;

public class TestSimulation {

	public static void main(String[] args) {
		
		TicTacToe game = new TicTacToe();
		game.displayBoard();
		
		while (!game.isGameOver()){
			int row = (int) (Math.random() * 3);
			int col = (int) (Math.random() * 3);
			
			//System.out.println(row+ " : " +col);
			
			try{
				game.playNext(row, col);
			} catch (IllegalArgumentException e){
				if (e.getMessage() == game.NOT_EMPTY_POSITION){
					continue;
				} else {
					System.out.println(e);
				}
			}
			
			game.displayBoard();
		}
		
		System.out.println((game.getWinner() == game.EMPTY) ? "Game Tied" : "Winner is " + game.getWinner());
		
	}

}
