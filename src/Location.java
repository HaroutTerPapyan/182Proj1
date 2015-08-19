/* Harout Ter-Papyan
 * Comp 182
 * A program that returns the location of the 
 *  largest element in a two-dimensional array
 */

import java.util.Scanner;


public class Location {

	public int row, column;
	public double maxValue;
	
	public static int[] locateLargest(double[][] a){
		double maxValue = a[0][0];
		int[] b = new int[2];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > maxValue) {
					b[0] = i;
					b[1] = j;
				}
			}
		}
		return b;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of rows");
		int numRows = input.nextInt();
		System.out.println("Enter the number of columns");
		int numColumns = input.nextInt();
		
		double[][] a = new double[numRows][numColumns];
		
		System.out.println("Enter the array: ");
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = input.nextDouble();
			}
		}
		
		Location loc = new Location(); 
		int array[] = locateLargest(a);
		System.out.println("\nThe largest element is located at (" + array[0] + "," + array[1]+ ")" );
		
	}

}


