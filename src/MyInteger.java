/* Harout Ter-Papyan
 * A program that checks if an integer is even, odd, or prime.
 *  Can also convert a string or array of numeric characters 
 *   into an int value.
 */


class MyInteger{
	  private int value;

	  public int getValue()  {
	    return this.value;
	  }

	  public MyInteger(int value) {
	    this.value = value;
	  }

	  public boolean isPrime() {
	    return isPrime(this.value);
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

	  public static boolean isPrime(MyInteger o) {
	    return isPrime(o.getValue());
	  }

	  public boolean isEven() {
	    return isEven(this.value);
	  }

	  public boolean isOdd() {
	    return isOdd(this.value);
	  }

	  public static boolean isEven(int n) {
	    return n % 2 == 0;
	  }

	  public static boolean isOdd(int n) {
	    return n % 2 != 0;
	  }

	  public static boolean isEven(MyInteger n) {
	    return isEven(n.getValue());
	  }

	  public boolean equals(int anotherNum) {
	    return this.value == anotherNum;
	  }

	  public boolean equals(MyInteger o) {
	    return this.value == o.getValue();
	  }

	  public static int parseInt(char[] numbers)
	  {
	    int result = 0;
	    for (int i = 0; i < numbers.length; i++) {
	      result = result * 10 + (numbers[i] - '0');
	    }

	    return result;
	  }

	  public static int parseInt(String s)
	  {
	    int result = 0;
	    for (int i = 0; i < s.length(); i++) {
	      result = result * 10 + (s.charAt(i) - '0');
	    }

	    return result;
	  }
	}
