import java.util.*;
public class sum2_167{
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        int[] result = new int[2];

        while (numbers[i] + numbers[j] != target) {
            int sum = numbers[i] + numbers[j];
            if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        result[0] = i + 1;
        result[1] = j + 1;

        return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an array :");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        System.out.println("Enter Elements : ");
        for(int i=0; i<n; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println("Enter target : ");
        int target = sc.nextInt();
    }
}