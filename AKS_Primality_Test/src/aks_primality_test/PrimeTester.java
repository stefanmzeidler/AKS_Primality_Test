package aks_primality_test;

/**
 * 
 */
public class PrimeTester {

	private static final double LOG_2 = Math.log10(2);
	private static boolean perfectPower(int n) {
		double a;
		for (double b = 2; b <= (Math.log10(n)/LOG_2); b++) {
			a = Math.pow((double)n,(1/b));
			if (a == (int)a) {
				return true;
			}
		}
		return false;
	}
	
	
	
}
