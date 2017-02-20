import java.util.*;


public class reverse {

	
	public static void main(String[] args){
		MyReverse revnum = new MyReverse();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to see a trick");
		int num = input.nextInt();
		MyReverse.reverse(num);
	}	
}
