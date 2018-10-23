
public class xxx {
	public static void main(String[]args) {
		
		String name = "Kimmie";
		int age = 70;
		
		//Nested if
		if(name.equals("Kimmie")) 
		{
			System.out.println("I am "+ name);
			if(age>50) 
			{
				System.out.println("I am greater than 50yrs old");
				if(age == 70) 
				{
					System.out.println("I am 70 years old");
				}
			}
		}//Switch case
		switch(name) {
			
		case "Zyrus":
			System.out.println("I am Zy");
			break;
		case "EUT":
			System.out.println("I am Eutable");
			break;
		case "Kimmie":
			System.out.println("I am Buzz Lightyear");
			break;
		
		}
	
		
	}
}
