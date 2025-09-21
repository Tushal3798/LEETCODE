import java.util.*;
public class Median_4{
    public static double median(int []nums1, int []nums2){
        int n = nums1.length + nums2.length;
        int i = 0, j = 0, count = 0, element1 = 0, element2 = 0;
        int ind2 = n/2;
        int ind1 = n/2 -1;

        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                if(count==ind1){
                    element1 = nums1[i];
                }
                if(count==ind2){
                    element2 = nums1[i];
                }
                i++;
                count++;
            }else{
                if(count==ind1){
                    element1 = nums2[j];
                }
                if(count==ind2){
                    element2 = nums2[j];
                }
                j++;
                count++;
            }
        }
        while(i<nums1.length){
            if(count==ind1){
                element1 = nums1[i];
            }
            if(count==ind2){
                element2 = nums1[i];
            }
            i++;
            count++;
        }
        while(j<nums2.length){
            if(count==ind1){
                element1 = nums2[j];
            }
            if(count==ind2){
                element2 = nums2[j];
            }
            j++;
            count++;
        }
        if(n%2==1){
            return element2;
        }else{
            double element = (element1 + element2)/2.0;
            return element;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enete Size of 1st Array : ");
        int m = sc.nextInt();
        int []nums1 = new int[m];
        System.out.println("Ente 1st Array Elements : ");
        for(int i=0; i<m; i++){
            nums1[i] = sc.nextInt();
        }

        System.out.print("Enter Size of 2nd Array : ");
        int n = sc.nextInt();
        int []nums2 = new int[n];
        System.out.println("Enter 2nd Array Elements : ");
        for(int i=0; i<n; i++){
            nums2[i] = sc.nextInt(); 
        }
        System.out.print("Median : " + median(nums1, nums2));
    }
}