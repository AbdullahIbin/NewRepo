public class Palindrome1 {
    public static boolean isPalindromeString(String text){
        String reverse=reverse(text);
        if (text.equals(reverse)){
            return true;

        }
        return false;
    }
    public static String reverse(String input){
        if (input==null || input.isEmpty()){
            return input;

        }
        return input.charAt(input.length()-1)+reverse(input.substring(0,input.length()-1));

    }
    public static void main(String[] args ){
        System.out.println("Is apple Palindrome? "+isPalindromeString("apple"));
        System.out.println("Is MOM palindrome? "+ isPalindromeString("MOM"));
    }
}
