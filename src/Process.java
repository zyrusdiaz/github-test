import java.util.*;
public class Process extends Calculate{ 
	public static void main(String [] args) { 
		Scanner input = new Scanner(System.in);
		Calculate C = new Calculate();
		String [] items = {"A.Adobo","B.Giniling","C.Pinekpekan","D.Ha?hatdog","E.Paksiw"};
		
		System.out.println("Enter your name:");
		String name = input.nextLine();
		
		System.out.println("Welcome "+ name);
		System.out.println("Choose your order!");
		display(items);
		String order = input.nextLine().toLowerCase();
		
		if(order.equalsIgnoreCase(items[0])) { 
			C.Adobo();
		}
		if(order.equalsIgnoreCase(items[1])) { 
			C.Ginising();
		}
		if(order.equalsIgnoreCase(items[2])) { 
			C.Pinekpekan();
		}
		if(order.equalsIgnoreCase(items[3])) { 
			C.Hatdog();
		}
		if(order.equalsIgnoreCase(items[4])) { 
			C.Paksiw();
		}
	}
	
	public static void display(String[]row) { 
		for(int x =0; x < row.length;x++) { 
			System.out.println(row[x]);
		}
	}
}