package dailyByte;
class reverseString {
    public static void main(String[] args) {
        String test = "the white cat";
        String test2 = null;
        String test3 = "hello world";
        String palindrome = "civic";
        
        System.out.println(reverseStr(test));
        System.out.println(reverseStr(test2));
        System.out.println(reverseStr(test3));
        System.out.println(reverseStr(palindrome));
    }

    public static String reverseStr(String str) {
        String reversedString = "";

        if (str == null) 
            return str;
        
        if (str.length() <= 1)
            return str;
            
        // iterate through str
        for (int i = (str.length() - 1); i >= 0; --i) {
            // start at end of str and add to new string until to the start of str
            reversedString += str.charAt(i);
        }
        return reversedString;
    }
}