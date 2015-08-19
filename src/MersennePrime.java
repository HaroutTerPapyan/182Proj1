/* Harout Ter-Papyan
 * A program that finds and displays all
 *  Mersenne primes with p <= 31.
 */
public class MersennePrime {
	
	public static boolean isPrime(int M) {
		for (int i = 2; i <= Math.sqrt(M); i++) {
			if (M % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("p" + "\t" + "2^p-1");
		for (int i = 2; i <= 34; i++) {
			if (isPrime(i) && isPrime((int) (Math.pow(2,  i) - 1))) {
				System.out.println(i + "\t" + (int) (Math.pow(2, i) - 1));
			}
		}

	}

}
