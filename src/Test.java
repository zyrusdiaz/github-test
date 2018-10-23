//used for importing packages, tulad nga ng sinabi ko kanina, asterisk(*) yung ginagamit 
//para lahat ng classes within that package is matatawag or magagamit mo
import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		//Different common used Datatypes: String,boolean,float,int,double
		
		Scanner sc = new Scanner(System.in);//Ito yung ginagamit para makapag take ka ng user inputs
											//Bale ang nangyayari sc yung gagamitin mo para magamit methods ng scanner
		
		
		System.out.print("Enter first num: ");
		int fnum = sc.nextInt(); //As you can see kapag integer value yung kukunin .nextInt() yung ginagamit
		System.out.print("Enter second num: ");
		int snum = sc.nextInt();
		
		//yung value ng fnum tsaka snum is iinput ng user tapos icclick enter para macontinue
		
		//Edi ayan nakuha na natin yung fnum tsaka snum operations naman
		
		int sum = fnum + snum;
		int diff = fnum -snum;
		int prod = fnum * snum;
		int quot = fnum / snum;
		
		//Tapos na yung arithmetic operations pwede na natin siyang idisplay
		
		System.out.println("Sum: "+ sum);
		System.out.println("Difference: "+ diff);
		System.out.println("Product: "+ prod);
		System.out.println("Quotient: "+ quot);
		
		//Basta lagi lang tatandaan na ang basa ng compiler is from top to bottom
		
		//Christian Zyrus D. Manglapus July 7 2018.
	}
}

						
