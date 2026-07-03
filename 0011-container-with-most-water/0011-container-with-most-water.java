class Solution {
    public int maxArea(int[] height) {
       int Right = height.length-1;
       int Left = 0;
       int Area = 0;
       int h;

    while(Left<Right){
        if(height[Left]<height[Right]){
            h = height[Left];
        }else{
            h = height[Right];
        }
        int w = Right - Left;
        int temp = h * w;
        if(temp>Area){
            Area = temp;
        }
        if(height[Left]<height[Right]){
            Left++;
        }else{
            Right--;
        }
    } 
    return Area;
}
}