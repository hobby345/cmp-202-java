public class PalindromeChecker {

    public static boolean isPalindrome(char[] word) {
        int left = 0;
        int right = word.length - 1;
        
        while (left < right) {
            if (word[left] != word[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String word = "Test";
        char[] wordArray = word.toCharArray();
        
        if (isPalindrome(wordArray)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}
