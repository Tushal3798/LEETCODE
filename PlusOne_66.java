import java.util.*;
public class PlusOne_66 {
    public static int[] PlusOne(int []digits){
        int count = digits.length;
        for(int i=count-1; i>=0; i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[count + 1];
        result[0] = 1;
        return result;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number");
        int num = sc.nextInt();

        String numStr = Integer.toString(num);
        int count = numStr.length();
        int[] digits = new int[count];
        for (int i = 0; i < count; i++) {
            digits[i] = numStr.charAt(i) - '0';
        }

        int []result = PlusOne(digits);
        System.out.println("Number After Plus One :");
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]);
        }
        System.out.println();
    }
}
