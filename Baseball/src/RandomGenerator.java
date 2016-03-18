import java.util.ArrayList;
import java.util.Random;

public class RandomGenerator {

	public static ArrayList<Integer> generateRandomDigits(){
		ArrayList<Integer> generatedRandomDigits = new ArrayList<Integer>();
		int first, second, third;
		Random rn = new Random();
		first = rn.nextInt(9);
		rn = new Random();
		second = rn.nextInt(9);
		rn = new Random();
		third = rn.nextInt(9);
		generatedRandomDigits.add(first);
		generatedRandomDigits.add(second);
		generatedRandomDigits.add(third);
		return generatedRandomDigits;
	}
}