import java.io.IOException;
import java.util.ArrayList;

public class UserInterface {

	public static void main(String[] args) throws IOException{
		int noOfUserAttempts = -1;
		int score = 0;
		boolean isGameOver = false;
		//Get Random 3 Digits
		ArrayList<Integer> generatedRandomDigits = new ArrayList<Integer>();
		generatedRandomDigits = RandomGenerator.generateRandomDigits();
		//For testing the game the generated number is being displayed
		/*System.out.println("For testing the game the generated number is being displayed");
		System.out.println("Generated digits = " + generatedRandomDigits.get(0) + "  " + generatedRandomDigits.get(1) + "  " +generatedRandomDigits.get(2));*/
		while(!(isGameOver)){
			//Accept Correct User Input
			int userNumber = -1;
			while(userNumber == -1){
				userNumber = AcceptUserInput.receiveUserInput();
				if(userNumber == -1){
					System.out.println("!!!!!!!You can only m,dfn,msndfenter 3 digits to play the game!!!!!!!");
				}
			}
			//Split the number entered by user into 3 different digits
			ArrayList<Integer> threeUserDigits = new ArrayList<Integer>();
			threeUserDigits = SplitNumber.supplyThreeDigits(userNumber);
			isGameOver = BaseballGame.compareDigits(generatedRandomDigits, threeUserDigits);
			noOfUserAttempts++;
		}
		System.out.println("Number of attempts = " + noOfUserAttempts);
		score = Score.calculateScore(noOfUserAttempts);
		System.out.println("Your Score is = " + score);
	}

}
