/**
 * Hi, you have Preference Version 101019 CONTROL-SHIFT-F will clean up your
 * code
 * 
 * @author: Jakub Bester
 */

public class RecursivePalindrome
{
  public static boolean isPalindrome(String s)
  {
    return isPalindrome(s, 0, s.length() - 1);
  }

  private static boolean isPalindrome(String s, int low, int high)
  {
    if (high <= low) // base case
    	return true;
    else if (!(s.substring(low, low + 1)).equals(s.substring(high, high + 1))) // base case
    	return false;
    else
    	return isPalindrome(s, low + 1, high - 1);
  }

  public static void main(String[] args)
  {
    System.out.println("Is moon a palindrome? " + isPalindrome("moon"));
    System.out.println("Is noon a palindrome? " + isPalindrome("noon"));
    System.out.println("Is a a palindrome? " + isPalindrome("a"));
    System.out.println("Is aba a palindrome? " + isPalindrome("aba"));
    System.out.println("Is ab a palindrome? " + isPalindrome("ab"));
  }
}
