// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {

    public static boolean IsPalindrome(String str) {
        str = str.toLowerCase();
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;

    }

    public static void main(String[] args) {
        String str = "racecaR";

        System.out.println(IsPalindrome(str) ? "String is a palindrome" : "String is not a palindrome");
    }
}