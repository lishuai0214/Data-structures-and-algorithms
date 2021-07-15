package Algorithms;

public class PalindromeString {
    public static String longestPalindrome(String s) {
        String result = s.substring(0, 1);
        Integer lenght = s.length();
        for (Integer start = 0; start <= lenght; start++){
            for (Integer end = start + 1; end <= lenght; end++){
                String subString = s.substring(start, end);
                String reveseStr = new StringBuffer(subString).reverse().toString();
                if (subString.equals(reveseStr)) {
                    System.out.println(subString);
                    if (result.length() < subString.length()){
                        result = subString;
                    }
                }
            }
        }
        return result;
    }
}
