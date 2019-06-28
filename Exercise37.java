public class Exercise37 {

 public static void main(String[] args) {

  for (int i = 0; i < 8; i++) {
   for (int j = 0; j < 10 - i; j++)
    System.out.print(" ");
   for (int k = 0; k < (2 * i + 1); k++)
    System.out.print("*");
   System.out.println();
  }
  for (int i = 0; i < 3; i++) {
      for(int j = 0; j < 9; j++){
          System.out.print(" ");
      }
        System.out.println("***");

  }
 }
}