import java.util.*;
public class RandomNumber {
	
	public RandomNumber() {
		
	}
	
	public static void main(String[]args) {
		
//		Random rand = new Random();
//		Scanner sc = new Scanner(System.in);
//		boolean rightGuess = false;
//		System.out.println("Dice Guessing Game!");
//		while(!rightGuess) {
//			System.out.print("Enter your guess: " );
//			int x = sc.nextInt();
//			int randNum = rand.nextInt(6)+1;
//			System.out.println("Generated number: " + randNum);
//			if(x == randNum) {
//				System.out.println("\n\n\nCongrats! Right Guess!");
//				rightGuess =true;
//			}
//		}
		
		TestTriangle();
		
		
		
	}
	
	static void TestTriangle() {
		
		int rows = 10;
		
		for(int i = 0; i<rows;i++ ) {
//			System.out.print("\t");
			
			for(int ii = 0; ii<i;ii++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
			System.out.print(" ");
		}
	}

}
