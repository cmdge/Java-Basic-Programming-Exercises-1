
import java.util.Scanner;

public class Exercise23{

     public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Yertle's Quest");
        System.out.println("Enter the name of your character: ");
        String name = scanner.nextLine();
        System.out.println("Enter strength (1-10): ");
        int strength = scanner.nextInt();
        System.out.println("Enter health (1-10): ");
        int health = scanner.nextInt();
        System.out.println("Enter luck (1-10): ");
        int luck = scanner.nextInt();
        int total = strength + health + luck;
        
        if (total  < 15){
            System.out.printf("%s, strength: %s, health: %s, luck: %s", name, strength, health, luck);
        } else {
            System.out.println("You have give your character too many points! Default values have been assigned: %s, strength: 5, health: 5, luck: 5", name);
        }
        
        
     } 
}