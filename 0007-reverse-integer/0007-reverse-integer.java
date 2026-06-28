class Solution {
    public int reverse(int x) {
        int digit;
        int result = 0;
        
        if(x >= 0){
            while(x > 0){
                digit = x%10;
                x = x/10;
            
                if(result < Integer.MAX_VALUE/10){
                    result = result * 10 + digit;
                }else if(result == Integer.MAX_VALUE/10 && digit <= 7){
                    result = result * 10 + digit;
                }else{
                    return 0;
                }
            }
        }else{
            while(x < 0){
                digit = x%10;
                x = x/10;
                
                if(result > Integer.MIN_VALUE/10){
                    result = result * 10 + digit;
                }else if(result == Integer.MIN_VALUE/10 && digit >= -8){
                    result = result * 10 + digit;
                }else{
                    return 0;
                }
            }
        }
        
        return result;
    }
}