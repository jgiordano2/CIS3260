
public class MyReverse {
	
	public static void reverse(int num){
		
		int reverse = 0;
		while (num != 0){
			
			reverse = reverse * 10;
			reverse = reverse + (num % 10);
			num = num  /10;
		}
		System.out.println("The reverse is " + reverse);
	}

}
