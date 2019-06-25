import java.util.Scanner;
public class Exercise32
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
		System.out.println("Enter N: ");
		int N = scanner.nextInt();
		double sum = 0;
		
		
		while (N > 0){
		    sum = sum + (1.0/N);
		    N = N - 1;
		}
		
		System.out.printf("Sum is %s", sum);
	}
}
