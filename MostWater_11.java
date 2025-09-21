import java.util.*;

public class MostWater_11 {
    public static int maxArea(int[] height, int size) {
        int Right = size - 1;
        int Left = 0;
        int Area = 0;

        while (Left < Right) {
            int h = Math.min(height[Left], height[Right]);
            int w = Right - Left;
            Area = Math.max(Area, h * w);

            if (height[Left] < height[Right]) {
                Left++;
            } else {
                Right--;
            }
        }
        return Area;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int height[] = new int[size];
        System.out.println("Enter the heights:");
        for (int i = 0; i < size; i++) {
            height[i] = sc.nextInt();
        }
        
        System.out.println("Most Water:");
        System.out.println(maxArea(height, size));

        sc.close();
    }
}
