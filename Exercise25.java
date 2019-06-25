


import java.util.Scanner;

public class Exercise25.java{

     public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input right front pressure");
        int rightFront = scanner.nextInt();
        System.out.println("Input left front pressure");
        int lefttFront = scanner.nextInt();
        System.out.println("Input right rear pressure");
        int rightRear = scanner.nextInt();
        System.out.println("Input left rear pressure");
        int leftRear = scanner.nextInt();
        
        if ( rightFront == lefttFront && rightRear == leftRear){
            System.out.println("Inflation is OK");
        } else {
            System.out.println("Inflation is NOT OK");
        }
        
     } 
}