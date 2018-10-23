import java.util.*;
public class PauloFlores {
	
	static Scanner sc = new Scanner(System.in);
	static Random rand = new Random();

	public static void main(String[]args) {

	}
	
	public void serpaw() {
		System.out.println("Testing bitch");
		int num = 10%2;
		
		switch(num) {
		
		case 1:
			System.out.println("Odd");
			break;
		default:
			System.out.println("Even");
			break;
		}
	}
	
	public static void xx() {
		System.out.println("The array has 5 elements: ");
		String names[] = {"Kym","Allen","Roseman","Iglot","Angry Bird"};
		for(int i = 0; i<names.length;i++) {
			System.out.println(names[i]);
		}
		System.out.println("---------------------------------------------\n\n\n");
		System.out.println("Randomized: ");
		System.out.println();
		for(int x = 0;x<names.length;x++) {
			int num = rand.nextInt(names.length);
			if(names[num] == "MARKED") {
				System.out.println("Duplicate");
			}else {
				System.out.println(names[num]);
				names[num] = "MARKED";
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void specifier() {
		System.out.println("Enter a word");
		String word = sc.nextLine();
		for(int i = 0; i<word.length();i++) {
			char x = word.charAt(i);
			if(Character.isLetter(x)) {
				System.out.println("Character ["+ x + "] is a letter");
			}else if(Character.isDigit(x)) {
				System.out.println("Character ["+ x + "] is a digit");
			}else if(Character.isWhitespace(x)) {
				System.out.println("A white space");
			}else {
				System.out.println("I am a special character");
			}
		}
	}
	
	public static void pauFlores() {

		boolean con =true;
		ArrayList<String> al = new ArrayList<String>();
		al.add("1.Randomize a number and print it");
		al.add("2.Get the user's FirstName, MiddleName and LastName and print it");
		al.add("3.Get a number input and identify if it is an odd or an even number");
		al.add("4.Print the full name of your teacher in CoPro1");
		al.add("5.Create a variable and pass its value to another variable and pass the value of the variable which you passed. Also, print the value of the variable which receives the value of the original variable");
		al.add("6.Create a try-catch block with exception catcher");
		al.add("7.Create a class named BSIT104 and print \"Hello Guys\"");
		al.add("8.Instantiate a Scanner");
		al.add("9.Shift to HRM");
		al.add("10.Flowchart how to go to STI");
		al.add("11.Flowchart how to open a computer");
		al.add("12.Flowchart how to wear clothes");
		al.add("13.Make a flowchart on how to cook an egg");
		System.out.println("Press G to get a problem");
		String g = sc.nextLine();
		if(g.equalsIgnoreCase("G")) {
			while(con) {
				int r = rand.nextInt(al.size());
				System.out.println("Give a randomized problem? [Y/N]");
				System.out.println("Remaining Problems: " + al.size());
				String ch = sc.nextLine();
				if(ch.equalsIgnoreCase("Y")) {
					String question = al.get(r).toUpperCase();
					System.out.println("-=============================================================");
					System.out.println("\n\n\n\n" + question+ "\n\n\n\n");
					al.remove(al.get(r));
					if(al.size() <=0) {
						System.out.println("That is the last question.");
						break;
					}
				}else {
					con = false;
				}
		}
		}
				
	}
	
	public static void fixme() {
		try {
			String x = "1123kj";
			int x1 = Integer.parseInt(x);
		}catch(Exception e) {
			String exc = e.toString();
			if(exc.contains("NumberFormatException")) {
				
			}
		}
	}
	
	public static void Kaym() {
		boolean ordering = true;
		int total = 0;
		ArrayList<String> arList = new ArrayList<String>();
		System.out.println("A. Kanin - 10");
		System.out.println("B. Java Rice - 20");
		System.out.println("C. Kinaning Kanin - 100");
		while(ordering) {
			System.out.print("Enter the order");
			String ord = sc.nextLine();
			
			String order = null;
			int price = 0;
			
			switch(ord) {
			case "A":
				break;
			case "a":
				order =  "Kanin";
				price = 10;
				break;
				
			case "B":
			case "b":
				order =  "Java Rice";
				price = 20;
				break;
				
			case "C":
			case "c":
				order =  "Kinaning Kanin";
				price = 100;
				break;
				
				default:
					System.out.println("Enter a valid order!!!");
					ordering = false;
					break;
				
			}
			arList.add(order);
			total+=price;
			System.out.println("Added " + order + " to orders.");
			System.out.println("Subtotal: "+ total);
			System.out.print("Do you have any other order? [Y/N] ");
			String more = sc.nextLine();
			ordering = (more.equalsIgnoreCase("Y")) ? true : false ;
			
		}
		System.out.println("You ordered: ");
		for(int x = 0; x < arList.size();x++) {
			System.out.println("\t" + arList.get(x));
		}
		System.out.println("Total: " + total);
		
	}
	
	public static void Encrypt(String word) {
		String out = "";
		for(int i = 0; i<word.length();i++) {
			char let = word.charAt(i);
			let+=5;
			out+=let;
		}
		System.out.println(out);
	}
	
	
	public static void inputData() {
	
		parse:for(;;) {
			System.out.print("\n\nEnter the number: ");
			String x = sc.nextLine();
			try {
				int checker = Integer.parseInt(x);
				System.out.println(checker);
				String xxx;
				if(checker % 2 == 0) {
					xxx = "even";
				}else {
					xxx = "odd";
				}
				System.out.println("Your e+ntered number : " + checker + " is " + xxx );
				break;
			}catch(Exception e) {
				System.out.println("\nThe value inserted is not a number");
				continue parse;
			}
		}
	
	
		
	}
	
	public void first() {
Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		
		String name = sc.nextLine();
		
		System.out.print("Are you working full time? [Y/N] ");
		String work = sc.nextLine();
		
		if(work.equalsIgnoreCase("Y")) {
			System.out.print("Enter your monthly salary rate:");
			int mSalary = sc.nextInt();
			System.out.println("Name: "+ name + " " + "\nSalary: "+ mSalary);
		}else {
			System.out.print("Enter your hourly rate: ");
			int hourRate = sc.nextInt();
			System.out.print("Enter your number of working hours: ");
			int workHours = sc.nextInt();
			int fSalary = hourRate * workHours;
			System.out.println("Name: "+ name + " " + "\nSalary: "+ fSalary);
		}
	}
	
//	public void Encrypt(String word) {
//		for(int x = 0; x< word.length();x++) {
//			char let = word.charAt(x);
//			
//		}
//	}
}
