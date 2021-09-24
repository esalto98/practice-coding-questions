/*
find longest palindrome in a string 
'annannaracecar'-> racecar
'aniracecar' -> racecar

1. 2 pointer approach
 -iterate 2nd pointer until it matches to first pointer
 -if it cant find the same char increment 1st pointer and search again for new char 
2.if it found same letter check if the char between the pointer is a palindrome
    -store str if palindrome && str.length > longestString.length 
        -else iterate the first pointer and back to step 1    
3. return null or content of str

a n n a r a c e c a r
i
  j 
*/
public class longestPalindrome {
    public static void main(String[] args) {
        String palindrome1 = "racecar"; 
        String palindrome2 = "annannaracecar";
        String palindrome3 = "abcderacecar";
        String palindrome4 = "levelracecar";

        System.out.println(solution(palindrome2));


    }
    public static String solution(String str) {
        int i = 0, j;
        String longest = "";

        while (i < str.length()) {
            j = i + 1;
            while (j < str.length()) {
                if (str.charAt(i) == str.charAt(j) && isPalindrome(str.substring(i, j + 1)))
                    longest = str.substring(i, j + 1).length() > longest.length() ? str.substring(i, j + 1) : longest;
                ++j;
            }
            
            ++i;
            
        }
        return longest;
    }
    private static boolean isPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        
        str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();

        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) 
                return false;
            
            i++;
            j--;
        }
        return true;
    }
}
