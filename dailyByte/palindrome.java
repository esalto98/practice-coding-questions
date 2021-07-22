package dailyByte;

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

    public static boolean isPalindrome(String str){
        if(str == null)
            return false;
        if(str.length() <= 1)
            return true;

        boolean isPalindrome = false;
        //remove spaces 
        str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        StringBuilder test = new StringBuilder(str);
        //compare reversed string to orginal string 
        if(test.reverse().toString().equals(str))
            isPalindrome = true;
       
        return isPalindrome;

    }

}