import java.util.*;

public class factor{
    public static int kthfactor(int n, int k) {
        List<Integer> factors = new ArrayList<>();
        
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                factors.add(i);
            }
        }
        factors.add(n);

        if (k > factors.size() || k <= 0) {
            return -1;
        }

        return factors.get(k - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Any Integer: ");
        int n = sc.nextInt();

        System.out.print("Enter The Position of Factor: ");
        int k = sc.nextInt();

        int result = kthfactor(n, k);

        if (result == -1) {
            System.out.println("Invalid position! The number " + n + " doesn't have " + k + " factors.");
        } else {

            String suffix = "th";
            if (k % 10 == 1 && k % 100 != 11) suffix = "st";
            else if (k % 10 == 2 && k % 100 != 12) suffix = "nd";
            else if (k % 10 == 3 && k % 100 != 13) suffix = "rd";

            System.out.println("The " + k + suffix + " factor of " + n + " is " + result);
        }

        sc.close();
    }
}
