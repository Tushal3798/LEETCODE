import java.util.*;
public class merge_88 {
    public static void merge(int[]nums1, int m, int[]nums2, int n){
        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }else{
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        while(j>=0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
        System.out.println("Sorted Array :");
        for(int r=0; r<m+n; r++){
            System.out.print(nums1[r] + "  ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Array size : ");
        int m = sc.nextInt();
        System.out.println("Enter 2nd Array size : ");
        int n = sc.nextInt();

        int []nums1 = new int[m+n];
        System.out.println("Enter element of 1st Array : ");
        for(int i=0; i<m; i++){
            nums1[i] = sc.nextInt();
        }
        for(int i=m; i<m+n; i++){
            nums1[i] = 0;
        }

        int []nums2 = new int[n];
        System.out.println("Enter element of 2nd Array : ");
        for(int i=0; i<n; i++){
            nums2[i] = sc.nextInt();
        }
        merge(nums1, m, nums2, n);
    }
}
