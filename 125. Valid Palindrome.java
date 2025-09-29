#BruteForce tc-O(n²) (string concatenation har step me new object banta hai) Sc-O(n)
class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = "";
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned += Character.toLowerCase(c);
            }
        }
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }
}

#Regex cleanup + reverse Tc -O(N) Sc -O(N)
class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }
}

# SringBuilder Beginner friendly TC - O(N) Sc -O(N)
class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(System.in);
        for (char ch: s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }
        String newStr = sb.toString();
        return newStr.equals(sb.reverse().toString());
    }
# 2 Pointer Approach Best TC -O(N) Sc -O(1)
class Solution {
    public boolean isPalindrome(String s) {
       int l = 0;int r = s.length()-1;
       while(l<r){
           while(l<r && !Character.isLetterOrDigit(s.charAt(l)))l++;
           while(l<r && !Character.isLetterOrDigit(s.charAt(r)))r--;
           
           if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false; 
            }l++;r--;
       }
       return true;
    }
