import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter X");
		double x = scanner.nextDouble();
		System.out.println("Enter N");
		double n = scanner.nextDouble();
		double p = 1.0 ;
		
		for (int i = 0; i <= n-1; i++){
		    p = p * x; 
		    
		}
	
		System.out.printf("%s raised to the power of %s is: %.5f", x, n, p);
	}
}
