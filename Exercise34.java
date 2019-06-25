
import java.util.Scanner;
public class Exercise34{
    
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
		System.out.println("Upper Limit: ");
		int upperLimit = scanner.nextInt();
		int sumOfSquares = 0;
		int sumOfCubes = 0;
		
		for (int i = 0; i <= upperLimit; i++){
		    sumOfSquares = i*(i+1)* ((2 * i)+1)/6;
		    sumOfCubes = ((i * i) * ((i+1) * (i+1)))/4;
		}
		
		System.out.printf("The sum of Squares is %s\n", sumOfSquares);
		System.out.printf("The sum of Cubes is %s", sumOfCubes);
	}
}
