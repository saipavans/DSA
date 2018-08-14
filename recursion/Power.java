package recursion;

public class Power {
	
	private static double power(double n, int p) {
		if ( p <  0) {
			n = 1/n;
			p = -p;
		}
		return p == 0 ? 1 : n * power(n, p-1);
	}
	
	private static double enhancedPower(double n, int p) { // uses  binary recursion
		
		if ( p <  0) {
			n = 1/n;
			p = -p;
		}  
		
		if ( p == 0) {
			return 1;
		} else { // p > 0
			
			double res = 1.0;
			
			if (p%2 == 1) { // p is odd
				res *= n;
			}
			
			p = (int) Math.floor(p/2);
			return res * enhancedPower(n, p) * enhancedPower(n, p);

		}
	}

	public static void main(String[] args) {
		
		long startTime1 = System.nanoTime();
		double ans1 = power(5,125);
		long endTime1 = System.nanoTime();
		
		long startTime2 = System.nanoTime();
		double ans2 = enhancedPower(5,125);
		long endTime2 = System.nanoTime();
		
		System.out.println(" 5 raised to the power 5 is : " + ans1 + " , computed in (ns): " + (endTime1 - startTime1) );
		System.out.println(" 5 raised to the power 5 with enhanced method is : " + ans2 + " , computed in (ns): " + (endTime2 - startTime2) );
		
	}

}
