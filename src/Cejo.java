public class Cejo {
	public static void main(String[]args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		
		
	}
	
	static void ArmstrongNumber(int num) {
		System.out.println("Armstrong numbers");
		System.out.print("Enter a number: ");
		int numLength = (int)(Math.log10(num)+1);
		int checker = 0;
		String x = "";
		for(int i = 0;i<numLength;i++) {
			
		}
		
	}
	
	static void Fibonacci() {
		System.out.println("Fibonacci Sequence: ");
		
		int prevNum = 0,i=1,currNum=0;
		
		for(; i<1000;) {
			
			prevNum += i;
			
			System.out.println(i);
			
			currNum = prevNum;
			
			System.out.println(currNum);
			
			i+=currNum;
		}
	}
}
