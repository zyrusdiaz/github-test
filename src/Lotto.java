import java.util.*;
public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
//		int[] nums = new int[6];
//		System.out.println("Top 6 Random Numbers from 1-20\n\n");
//		
//		for(int i = 0; i <6;i++) {
//			int num = rand.nextInt(20)+1;
//				for(int x = 0; x<nums.length;x++) {
//					while(nums[x] == num) {
//						num = rand.nextInt(20)+1;
//					}
//				}
//			String ind = (num%2==0)? "even" : "odd";
//			nums[i] = num;
//			System.out.println("Generated random number: " + num + " is "+ ind);
//		}
		
		for(int i = 0;i<3;i++) {
			int num = rand.nextInt(20);
			String ind = (num % 2 ==0 )? "even" : "odd";
			System.out.println(num + " " + ind);
		}
		
	}

}
