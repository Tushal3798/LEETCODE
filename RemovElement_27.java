import java.util.Scanner;

public class RemovElement_27 {

   public static int romoveElement(int[] var0, int var1) {
      int var2 = 0;

      for(int var3 = 0; var3 < var0.length; ++var3) {
         if (var0[var3] == var1) {
            var0[var2] = var0[var3];
            ++var2;
         }
      }

      return var2;
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter The Size of an array : ");
      int var2 = var1.nextInt();
      int[] var3 = new int[var2];
      System.out.println("Enter the array Elements :");

      int var4;
      for(var4 = 0; var4 < var2; ++var4) {
         var3[var4] = var1.nextInt();
      }

      System.out.print("Enter the Value :");
      var4 = var1.nextInt();
   }
}
