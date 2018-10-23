
public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recurse(10);
	}
	
	public static void Recurse(int counter) {
		System.out.println(counter);
		counter--;
		if(counter>=0)
			Recurse(counter);
		else
			System.out.println("Done");
		
	}

}
