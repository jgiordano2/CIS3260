
public class MyInvestment {

	
	    public static void cal (double initial, double annual, int years){

	        while(years != 31) {
	            double futureVal;
	            double temp;
	            double month = annual / 1200;
	            temp = Math.pow((1 + month), (years * 12));
	            futureVal = temp * initial;
	            
	            System.out.println("the value after " + years + " years is " + "$"+futureVal);
	            years++;
	    }

	}
}