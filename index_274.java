import java.util.Scanner;
import java.util.Arrays;
public class index_274{
    public static int citation(int []citations){
        Arrays.sort(citations);
        int n = citations.length;

        for(int i=0; i<n; i++){
            int h = n - i;
            if(citations[i]>=h){
                return h;
            }
        }
        return 0;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size :");
        int n = sc.nextInt();

        int []citations = new int[n];
        System.out.println("Enter Array Element : ");
        for(int i=0; i<n; i++){
            citations[i] = sc.nextInt();
        }
        System.out.println("H-Index : " + citation(citations));
    }
}