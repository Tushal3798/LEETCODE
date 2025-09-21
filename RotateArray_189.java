import java.util.*;

public class RotateArray_189 {
    public static void rotateArray(int nums[], int k) {
        int n = nums.length;
        k = k % n;
        int count = 0;

        for (int start = 0; count < n; start++) {
            int current = start;
            int prev = nums[start];

            do {
                int nextIdx = (current + k) % n;
                int temp = nums[nextIdx];
                nums[nextIdx] = prev;
                prev = temp;
                current = nextIdx;
                count++;
            } while (start != current);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter The Size: ");
        int n = sc.nextInt();
        
        int[] nums = new int[n];
        
        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter the Number to Rotate: ");
        int k = sc.nextInt();

        rotateArray(nums, k);

        System.out.println("Rotated Array: ");
        for (int i=0; i<nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}
