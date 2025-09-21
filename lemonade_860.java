import java.util.*;
public class lemonade_860 {
    public static boolean lemonadechange(int bills[]){
        int fivecount = 0;
        int tencount = 0;

        if(bills[0] > 5){
            return false;
        }

        for(int i=0; i<bills.length; i++){
            if(bills[i] == 5){
                fivecount++;
            }
            else if(bills[i] == 10){
                if(fivecount == 0){
                    return false;
                }else{
                    fivecount--;
                    tencount++;
                }
            }
            else if(bills[i] == 20){
                if(fivecount != 0 && tencount != 0){
                    fivecount--;
                    tencount--;
                }
                else if(fivecount >= 3){
                    fivecount = fivecount - 3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = sc.nextInt();

        int bills[] = new int[n];
        System.out.println("Enetr array elements : ");
        for(int i=0; i<n; i++){
            bills[i] = sc.nextInt();
        }
        System.out.println(lemonadechange(bills));
    }
}
