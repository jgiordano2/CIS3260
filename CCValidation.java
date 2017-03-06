import java.util.Scanner;
public class CCValidation {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a credit card number: ");
		long num = userInput.nextLong();
		System.out.println(
			num + " is " + (isValid(num) ? "valid" : "invalid"));
	}
	public static boolean isValid(long num) {
		boolean valid =
			(getSize(num) >= 13 && getSize(num) <= 16) &&
			(prefixMatched(num, 4) || prefixMatched(num, 5) ||
			prefixMatched(num, 37) || prefixMatched(num, 6)) &&
			((sumOfDoubleEvenPlace(num) + sumOfOddPlace(num)) % 10 == 0);
		return valid;
	}
	
	public static int sumOfDoubleEvenPlace(long num) {
		int sum = 0;
		String num2 = num + "";
		for (int i = getSize(num) - 2; i >= 0; i -= 2) {
			sum += getDigit(Integer.parseInt(num2.charAt(i) + "") * 2);
		}
		return sum;
	}
	public static int getDigit(int num) {
		if (num < 9)
			return num;
		else
			return num / 10 + num % 10;
	}
	public static int sumOfOddPlace(long num) {
		int sum = 0;
		String num2 = num + "";
		for (int i = getSize(num) - 1; i >= 0; i -= 2) {
			sum += Integer.parseInt(num2.charAt(i) + "");
		}
		return sum;
	}
	public static boolean prefixMatched(long num, int d) {
		return getPrefix(num, getSize(d)) == d;
	}
	public static int getSize(long d) {
		String num2 = d + "";
		return num2.length();
	}
	public static long getPrefix(long num, int k) {
		if (getSize(num) > k)  {
			String num2 = num + "";
			return  Long.parseLong(num2.substring(0, k));
		}
		return num;
	}
}
