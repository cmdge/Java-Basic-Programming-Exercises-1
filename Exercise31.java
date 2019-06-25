import java.util.Scanner;
public class Exercise31
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
		System.out.println("Enter N: ");
		int num = scanner.nextInt();
		int sum = 0;
		
		
		while (num > 0){
		    System.out.println("Enter an integer: ");
		    int integer = scanner.nextInt();
		    sum = sum + integer;
		    num = num - 1;
		}
		
		System.out.printf("The sum is %s", sum);
	}
}
