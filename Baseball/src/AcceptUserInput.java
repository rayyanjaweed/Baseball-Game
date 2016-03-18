import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcceptUserInput {

	public static int receiveUserInput() throws IOException{
		int userNumber = 0;
		System.out.println("Please enter the three digits ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String userInput = br.readLine();
		userInput = userInput.replaceAll(" ","");
		userNumber = Integer.parseInt(userInput);
		if(!(99 < userNumber && userNumber < 999)){
			userNumber = -1;
		}
		return userNumber;
	}
}
