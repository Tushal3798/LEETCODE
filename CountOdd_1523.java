import java.util.*;
public class CountOdd_1523 {
    public static int countOddNumber(int low, int high){
        if(low%2 == 0 && high%2 == 0){
            int count = (high - low)/2;
            return count;
        }else{
            int count = (high - low)/2 + 1;
            return count;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Low : ");
        int low = sc.nextInt();

        System.out.print("Enter High : ");
        int high = sc.nextInt();

        System.out.println("Count of Odd Number : " + countOddNumber(low, high));
    }
}
