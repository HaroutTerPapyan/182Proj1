/* Harout Ter-Papyan
 * Comp 182
 * A program that displays the first 100 emirps
 */

public class Emirp {
	public static void main(String[] args) {
		int count = 1;

		for (int i = 2; ; i++) {
			if ((isPrime(i)) && (isPrime(reversal(i))) && (!isPalindrome(i))) {
				System.out.print(i + " ");

				if (count % 10 == 0) {
					System.out.println();
				}

				if (count == 100) {
					break;
				}
				count++;
			}
		}
	}

	public static boolean isPrime(int num) {
		if ((num == 1) || (num == 2)) {
			return true;
		}

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

	static int reversal(int num) {
		int result = 0;

		while (num != 0) {
			int lastDigit = num % 10;
			result = result * 10 + lastDigit;
			num /= 10;
		}

		return result;
	}

	static boolean isPalindrome(int num) {
		return num == reversal(num);
	}
}