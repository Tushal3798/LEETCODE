import java.util.*;
public class remove_element_27 {
    public static int removeElement(int []nums, int val){
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==val){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size of an array : ");
        int size = sc.nextInt();

        int []nums = new int[size];
        System.out.println("Enter the array Elements :");
        for(int i=0; i<size; i++){
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter the Value :");
        int val = sc.nextInt();

        System.out.println("Value of k :");
        int k = removeElement(nums,val);
        System.out.println();
    }
}