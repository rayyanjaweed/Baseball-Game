
public class Score {

	public static int calculateScore(int noOfUserAttempts){
		int score = 0;
		score = (100- (noOfUserAttempts*5));
		return score;
	}
}
