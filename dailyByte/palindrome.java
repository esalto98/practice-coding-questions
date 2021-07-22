class palindrome {
    public static void main(String[] args){
        String test = "ci vic"; //true
        String test2 = "test"; //false
        String test3 = "level"; // true
        String test4 = "A man, a plan, a canal: Panama.";//true

        System.out.println(isPalindrome(test));
        System.out.println(isPalindrome(test2));
        System.out.println(isPalindrome(test3));
        System.out.println(isPalindrome(test4));
    }

    public static boolean isPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        
        str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();

        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
        