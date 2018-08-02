package arrays.highScore;


public class UserProfile {
	
	private String name = "";
	private int score = 0;
	
	public UserProfile(String name, int score){
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}
	
	public String toString(){
		return "(" + name + ", " + score + ")";
	}

}
