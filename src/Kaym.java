import java.util.*;

public class Kaym {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[]args) {
		
		System.out.print("Christian Zyrus Manglapus");
		System.out.print("Print with age");
	}
	
	
	
	static void Issa() {
		Scanner sc= new Scanner(System.in);
		int curr =0,comp = 1;
		System.out.println("Enter number");
		int num = sc.nextInt();
		if(num > 0) {
			while(curr<num) {
				comp *= curr+1;
				curr++;
				System.out.println(comp);
			}
			System.out.println("The factorial of " + num+ " is " + comp);
		}else {
			System.out.println("Please enter positive number only");
		}
	}
	
	
	static void countArr() {
		int num[]= {1,2,3,4,5};
		int cunt =0;
		for(int c:num) 
			cunt++;
		System.out.println(cunt);
		
	}

	
	static void serPaw() {
		for(int i = 0;i<=10;i++) {
			System.out.println(i);
			System.out.println(i&5);
		}
	}
}

