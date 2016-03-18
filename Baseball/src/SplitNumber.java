import java.util.ArrayList;

public class SplitNumber {

	public static ArrayList<Integer> supplyThreeDigits(int userNumber){
		int first;
		int second;
		int third;
		ArrayList<Integer> threeDigits = new ArrayList<Integer>();
		first = userNumber%10;
		userNumber = userNumber/10;
		second = userNumber%10;
		userNumber = userNumber/10;
		third = userNumber;
		threeDigits.add(third);
		threeDigits.add(second);
		threeDigits.add(first);
		return threeDigits;
	}
}
