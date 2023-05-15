package CodeSignal;

public class CheckPalindrome {

    boolean solution(String inputString) {
        int length = inputString.length();

        for (int i = 0; i < length / 2; i++) {

            if (inputString.charAt(i) == inputString.charAt(length - i - 1)) {
                return true;
            }
        }

        return false;

    }


    //test cases
    public static void main(String[] args) {
        CheckPalindrome checker = new CheckPalindrome();

        //test case 1
        String palindrome = "level";
        boolean result1 = checker.solution(palindrome);
        System.out.println(palindrome + " is a palindrome: " + result1);

        //test case 2
        String notPalindrome = "not a palindrome";
        boolean result2 = checker.solution(notPalindrome);
        System.out.println(notPalindrome + " is not a palindrome: " + result2);

        //test case 3
        String emptyString = "";
        boolean result3 = checker.solution(emptyString);
        System.out.println(emptyString + " is not a palindrome: " + result3);


    }

}
