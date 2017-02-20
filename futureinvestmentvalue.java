import java.util.*;

public class futureinvestmentvalue {
	
	 public static void main(String[] args) {

	        Scanner scan = new Scanner(System.in);
	        MyInvestment fVal = new MyInvestment();

	        System.out.println("enter initial amount");
	        double investAmount = scan.nextDouble();

	        System.out.println("enter annual interest rate");
	        double annualInterestRate = scan.nextDouble();

	        System.out.println("enter the years");
	        int years = scan.nextInt();


	        fVal.cal(investAmount, annualInterestRate, years);


	    }
}

