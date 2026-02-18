package DSA.PatternBased.TwoPointer;

public class ValidPalindrome_125 {

    public static boolean isPalindrome(String s) {

        String sentenceOne = s.replaceAll("[-+.^:, ]","").toLowerCase();
        StringBuilder sentwo = new StringBuilder(sentenceOne);
        sentwo.reverse();

        if (sentenceOne.equals(sentwo)){
            return true;
        }else {
            return false;
        }


    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean palindrome = isPalindrome(s);

        System.out.println(palindrome);
    }
}
