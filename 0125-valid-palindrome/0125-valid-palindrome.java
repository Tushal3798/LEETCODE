class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder cleaned = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }
        
        String filtered = cleaned.toString();
        String reversed = cleaned.reverse().toString();
        
        return filtered.equals(reversed);
    }
}