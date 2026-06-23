class Solution {
    public boolean isPalindrome(int x) {
        
        int reversedHalf = 0;

        if(x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }
        
        int temp = x;
        while (temp != 0) {
            int digit = temp % 10;
            reversedHalf = reversedHalf * 10 + digit;
            temp = temp / 10;
        }

        return x == reversedHalf || x == reversedHalf / 10;
    }
}