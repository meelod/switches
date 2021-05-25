import java.lang.Math;
import java.util.Scanner;
public class Switches {
	
	public static void main(String[] args) {
		System.out.println("Meelod Waheed");
		System.out.println("Please enter the number of Switches you want to have");
		Scanner scan = new Scanner(System.in);
		int numSwitches = scan.nextInt();
		boolean[] switches = new boolean[numSwitches];
		int counter = 0;
		
		while (true) {
			int randNum = (int)(Math.random()*numSwitches);
			counter++;
			if (switches[randNum] == false) {
				switches[randNum] = true;
			} else {
				switches[randNum] = false;
			}
			if (searchArray(switches) == true) {
				break;
			} else {
				continue;
			}
		}
		
		System.out.println("The game took " + counter + " tries!");
	}
	
	public static boolean searchArray(boolean[] array) {
		for (boolean b: array) {
			if (b != false) {
				continue;
			} else {
				return false;
			}
		
		}
	return true;
	}
		
}
