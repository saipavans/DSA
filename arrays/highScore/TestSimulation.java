package arrays.highScore;

public class TestSimulation {
	
	private static LeaderBoard leaderBoard = new LeaderBoard(3);
	
	public static void main(String[] args){
		
		System.out.println("The leader board initially " + "\n" + leaderBoard);
		
		System.out.println("Alice played and scored 43 points");
		UserProfile user = new UserProfile("Alice", 43);
		leaderBoard.addProfile(user);
		System.out.println("The leader board now " + "\n" + leaderBoard);

		
		System.out.println("Bob played and scored 46 points");
		user = new UserProfile("Bob", 46);
		leaderBoard.addProfile(user);
		System.out.println("The leader board now " + "\n" + leaderBoard);

		
		System.out.println("Cathy played and scored 40 points");
		user = new UserProfile("Cathy", 40);
		leaderBoard.addProfile(user);
		System.out.println("The leader board now " + "\n" + leaderBoard);
		
		
		System.out.println("Don played and scored 50 points");
		user = new UserProfile("Don", 50);
		leaderBoard.addProfile(user);
		System.out.println("The leader board now " + "\n" + leaderBoard);
		
		System.out.println("Cathy played and scored 48 points");
		user = new UserProfile("Cathy", 48);
		leaderBoard.addProfile(user);
		System.out.println("The leader board now " + "\n" + leaderBoard);

	}
	

}
