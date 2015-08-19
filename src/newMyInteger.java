
public class newMyInteger {

	public static void main(String[] args) {
		MyInteger n1 = new MyInteger(29);
		System.out.println("is n1 even?" + n1.isEven() +
							"\nis n1 prime?" + n1.isPrime() +
							"\nis 20 prime?" + MyInteger.isPrime(20));
		
		
	    char[] chars = { '1', '4', '7', '9' };
	    System.out.println(MyInteger.parseInt(chars));

	    String s = "1479";
	    System.out.println(MyInteger.parseInt(s));

	    MyInteger n2 = new MyInteger(24);
	    System.out.println("is n2 odd?" + n2.isOdd() + 
	    					"\nis 17 odd?" + MyInteger.isOdd(17) + 
	    					"\nis n1 equal to n2?" + n1.equals(n2) +
	    					"\nis n1 equal to 20?" + n1.equals(20));
	}

}
