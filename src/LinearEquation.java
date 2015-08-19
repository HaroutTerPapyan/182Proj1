/* Harout Ter-Papyan
 * A program for a 2x2 system of linear equations
 */

import java.util.Scanner;


 public class LinearEquation {
	 
	 public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 double a,b,c,d,e,f;
		 
		 System.out.println("Enter a value for a");
		 a = input.nextDouble();
		 System.out.println("Enter a value for b");
		 b = input.nextDouble();
		 System.out.println("Enter a value for c");
		 c = input.nextDouble();
		 System.out.println("Enter a value for d");
		 d = input.nextDouble();
		 System.out.println("Enter a value for e");
		 e = input.nextDouble();
		 System.out.println("Enter a value for f");
		 f = input.nextDouble();
		 
		 LinearEquation lineq = new LinearEquation(a, b, c, d, e, f);
		 
		 System.out.println("The value of x= " + lineq.getX());
		 System.out.println("The value of y= " + lineq.getY());
		 
			
		}
	
	 private double a;
	 private double b;
	 private double c;
	 private double d;
	 private double e;
	 private double f;
	 private double x;
	 private double y;
	
	LinearEquation(double a, double b, double c, double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}
	
	public double getA(){
		return a;
	}
	
	public double getB(){
		return b;
	}
	
	public double getC(){
		return c;
	}
	
	public double getD(){
		return d;
	}
	
	public double getE(){
		return e;
	}
	
	public double getF(){
		return f;
	}
	
	public boolean isSolvable() {
		if ((a*d)-(b*c) == 0) {
			return false;
		}
		return true;
	}
	
	public double getX() {
		if(!isSolvable()) {
			System.out.println("Error: Cannot divide by 0. \nThe equation has no solution");
		}
		
		x = ((e*d)-(b*f))/((a*d)-(b*c));
		return x;
	}
	
	public double getY() {
		if(!isSolvable()) {
			System.out.println("Error: Cannot divide by 0. \nThe equation has no solution");
		}
		
		y = ((a*f)-(e*c))/((a*d)-(b*c));
		return y;
	}
	
	
 }

	
