/*
This question is asked by Google. Given a string, 
return whether or not it uses capitalization correctly. 
A string correctly uses capitalization if all letters are capitalized, 
no letters are capitalized, or only the first letter is capitalized.

Ex: Given the following strings...
"USA", return true
"Calvin", return true
"compUter", return false
"coding", return true

 */
public class capCheck {
    public static void main(String[] args) {
        String test1 = "USA";
        String test2 = "Calvin";
        String test3 = "compUter";
        String test4 = "coding";

        System.out.println(capitalization(null));//false
        System.out.println(capitalization(test1));//true
        System.out.println(capitalization(test2));// true
        System.out.println(capitalization(test3));// false
        System.out.println(capitalization(test4));// true
    }

    private static boolean capitalization(String str) {
        boolean correctCapitalization = false;
        
        if (str == null || str.length() <= 1)
            return correctCapitalization;
            
        int capitalCounter = 0;  
        
        for (int i = 0; i < str.length(); ++i) {
            if (Character.isUpperCase(str.charAt(i)))
                capitalCounter++;
        }

        if (capitalCounter == str.length()) {
            correctCapitalization = true;
        } else if (capitalCounter == 1 && Character.isUpperCase(str.charAt(0))) {
            correctCapitalization = true;
        } else if (capitalCounter == 0) {
            correctCapitalization = true;
        }
        
        return correctCapitalization;  
    }
}
