


import java.util.Scanner;

public class Exercise30{

     public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String firstWord = scanner.nextLine();
        System.out.println("Enter second word: ");
        String secondWord = scanner.nextLine();
        
        int firstLength = firstWord.length();
        int secondLength = secondWord.length();
        int times = 30 - (firstLength + secondLength);
        
        
        System.out.print(firstWord);
        
        for (int i = 1; i <= times; i++){
            System.out.print(".");
        }
        
        System.out.print(secondWord);
        
     } 
}