package Games;
import java.util.Random;
import java.util.Scanner;



public class RockPaperScissor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random randomm = new Random();
		System.out.println("**RULES & INSTRUCTIONS**");
		System.out.println(" 0 = rock ");
		System.out.println(" 1 = Paper ");
		System.out.println(" 2 = Scissors ");
		
		int inputuser = sc.nextInt(3);
		int compin = randomm.nextInt(3);
		
		System.out.println("COMPUTER = "+compin);
		System.out.println("YOUR INPUT = "+inputuser);

		
		if (  inputuser > compin ) {
			System.out.println("You win");
		}
		
		else if( inputuser < compin ) {
			System.out.println("You Lose");
		}
		
		else {
			System.out.println("Its a Tie");
		}
		
		
		
		
		

	}
}


