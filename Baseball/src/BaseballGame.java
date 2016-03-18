import java.util.ArrayList;

public class BaseballGame {

	public static boolean compareDigits(ArrayList<Integer> generatedRandomDigits, ArrayList<Integer> threeUserDigits){
		boolean isGameOver = false;
		int strikes = 0;
		int ball = 0;
		
		//Checking conditions for strikes
		if(generatedRandomDigits.get(0) == threeUserDigits.get(0) 
				&& generatedRandomDigits.get(1) == threeUserDigits.get(1) 
				&& generatedRandomDigits.get(2) == threeUserDigits.get(2) ){
			strikes = 3;
		}else if(generatedRandomDigits.get(0) == threeUserDigits.get(0) 
				&& generatedRandomDigits.get(1) == threeUserDigits.get(1)){
			strikes = 2;
			ball = 0;
		}else if(generatedRandomDigits.get(1) == threeUserDigits.get(1) 
				&& generatedRandomDigits.get(2) == threeUserDigits.get(2)){
			strikes = 2;
			ball = 0;
		}else if(generatedRandomDigits.get(0) == threeUserDigits.get(0) 
				&& generatedRandomDigits.get(2) == threeUserDigits.get(2)){
			strikes = 2;
			ball = 0;
		}else if(generatedRandomDigits.get(0) == threeUserDigits.get(0)){
			strikes = 1;
			if(generatedRandomDigits.get(1) == threeUserDigits.get(2)){
				ball++;
			}
			if(generatedRandomDigits.get(2) == threeUserDigits.get(1)){
				ball++;
			}
		}else if(generatedRandomDigits.get(1) == threeUserDigits.get(1)){
			strikes = 1;
			if(generatedRandomDigits.get(0) == threeUserDigits.get(2)){
				ball++;
			}
			if(generatedRandomDigits.get(2) == threeUserDigits.get(0)){
				ball++;
			}
		}else if(generatedRandomDigits.get(2) == threeUserDigits.get(2)){
			strikes = 1;
			if(generatedRandomDigits.get(0) == threeUserDigits.get(1)){
				ball++;
			}
			if(generatedRandomDigits.get(1) == threeUserDigits.get(0)){
				ball++;
			}
		}else{
			//Incase there is no strike at all
			if(generatedRandomDigits.get(0) == threeUserDigits.get(1) || generatedRandomDigits.get(0) == threeUserDigits.get(2)){
				ball++;
			}
			if(generatedRandomDigits.get(1) == threeUserDigits.get(0) || generatedRandomDigits.get(1) == threeUserDigits.get(2)){
				ball++;
			}
			if(generatedRandomDigits.get(2) == threeUserDigits.get(0) || generatedRandomDigits.get(2) == threeUserDigits.get(1)){
				ball++;
			}
		}
		
		System.out.println("Strikes = "+strikes +"  Ball = "+ball);
		if(3 == strikes){
			isGameOver = true;
		}
		return isGameOver;
	}
}
