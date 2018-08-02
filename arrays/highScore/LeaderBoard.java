package arrays.highScore;

public class LeaderBoard {
	
	private static final int DEFAULT_MAX_ENTRIES = 10;
	private int maxEntries = 0;
	private int currentEntries = 0;
	private UserProfile[] leaderBoard = null;
	
	public LeaderBoard(){
		this(DEFAULT_MAX_ENTRIES);
	}
	
	public LeaderBoard(int maxEntries){
		this.maxEntries = maxEntries;
		leaderBoard = new UserProfile[maxEntries];
	}
	
	
	/* Add Score to the leaderboard if it is high enough
	 */
	public void addProfile(UserProfile user){
		int i = 0;

		if (currentEntries == 0){
			// When there are no entries in leader board, the current user profile is simply added at index 0
			leaderBoard[0] = user;
			currentEntries++;
			return;
		}
		
		while ( i < currentEntries){
			
			if (leaderBoard[i].getScore() > user.getScore()){
				i++;
			}else{
				shiftRight(i);
				leaderBoard[i] = user;
				break;
			}
			
			if(i == currentEntries){
				// Current User profile is high enough to be added in the end (There is space in leaderBoard)
				leaderBoard[currentEntries++] = user;
				break;
			}
		}
		
	}
	
	public void shiftRight(int index){
		UserProfile picked = null;
		UserProfile temp = null;
		for ( int i = index; i < currentEntries; i++){
				temp = leaderBoard[i];
				leaderBoard[i] = picked;
				picked = temp;
		}
		if(currentEntries < maxEntries){
			// There is an addition in the leaderboard
			currentEntries++;
			leaderBoard[currentEntries-1] = picked;
		}
		/* else: The leader board is full already and the current user profile with high score 
		 * is added to the leader board where as the last high score in the leader board is picked and 
		 * never added to the leader board. (Removed from the leader board)
		 */
	}
	

	
	public String toString(){
		StringBuilder boardDetails = new StringBuilder();
		for (int i = 0; i < currentEntries; i++){
			boardDetails.append((leaderBoard[i]).toString());
		}
		return boardDetails.toString();
	}
	
	

}
