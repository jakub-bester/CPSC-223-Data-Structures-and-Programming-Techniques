/**
 * @author Jakub Bester
 * 
 *         This class deals with chapter 10.10 in the eText. Turn this in to the
 *         dropbox. Note: You are only allowed to use methods from the official
 *         APCS Subset. The String class specific ones are:
 *         <ol>
 *         <li>int length()</li>
 *         <li>String substring(from, to),</li>
 *         <li>String substring(from),</li>
 *         <li>int indexOf(String value),</li>
 *         <li>int compareTo(Object other),</li>
 *         <li>boolean equals(Object other)</li>
 *         <li>String toString()</li>
 *         </ol>
 *         <p>
 *         Use of any other method from the String class will result in a zero.
 *         </p>
 * 
 * @version 1.0
 */

public class JU14
{
  // TODO: Add constant declarations here.
  // Use descriptive names. Do not say FIVE = 5, rather HIGH_SCORE = 5;

  /**
   * Create a String made up of just the first two letters. Hashtags are used if
   * there are not enough letters.
   * 
   * <pre>
   * firstTwoCharacters("superman") -> "su" 
   * firstTwoCharacters("e") -> "e#"
   * firstTwoCharacters("") -> "##"
   * </pre>
   * 
   * @param phrase
   *          != null
   * @return the first two letters, or hashtags if there's not enough letters
   *         for that.
   */
  public static String firstTwoCharacters(String phrase)
  {
    int length = phrase.length();
    String firstTwoCharacters = "";

    switch (length)
    {
      case 0:
        firstTwoCharacters = "##";
      case 1:
        if (phrase.equals(""))
        {
          firstTwoCharacters = "##";
          break;
        }
        else
        {
          firstTwoCharacters = phrase.substring(0, 1) + "#";
          break;
        }
      default:
        firstTwoCharacters = phrase.substring(0, 2);
        break;
    }

    return firstTwoCharacters;
  }

  /**
   * Given 2 strings, return their concatenation, except dump the first char of
   * each. The strings will be at least length 1.
   * 
   * <pre>
   * noFirstLetterConcat("Hello", "There") -> "ellohere"
   * noFirstLetterConcat("java", "code") -> "avaode"
   * noFirstLetterConcat("shotl", "java") -> "hotlava"
   * </pre>
   * 
   * @param word1
   * @param word2
   * @return
   */
  public static String noFirstLetterConcat(String word1, String word2)
  {
    String revisedWord1 = word1.substring(1, word1.length());
    String revisedWord2 = word2.substring(1, word2.length());

    return revisedWord1 + revisedWord2;
  }

  /**
   * Given a string of odd length, return a three letter word from its middle,
   * so "Candy" yields "and". The string length will be at least 3. If the
   * string is not of odd length or has less than 3 letters, return "nope".
   * 
   * <pre>
   * getMiddleThree("Candy") -> "and"
   * getMiddleThree("graceap") -> "ace"
   * getMiddleThree("ababab") -> "nope"
   * </pre>
   */
  public static String getMiddleThree(String str)
  {
    String threeLetterWord = "";

    if ((str.length() % 2 == 0) || (str.length() < 3))
    {
      return "nope";
    }
    else
    {
      int startIndex = (str.length() / 2) - 1;
      int endIndex = (str.length() / 2) + 2;
      threeLetterWord = str.substring(startIndex, endIndex);
      return threeLetterWord;
    }
  }

  /**
   * Determines if a, b, and c are in order from least to greatest.
   * 
   * <pre>
   * Examples
   * 
   * inNumericalOrder(3, 5, 19) -> true;
   * inNumericalOrder(3, 3, 3) -> true;
   * inNumericalOrder(3, 5, 4) -> false;
   * inNumericalOrder(1, 2, 7) -> true;
   * inNumericalOrder(4, 2, 1) -> false;
   * </pre>
   * 
   * @param a
   * @param b
   * @param c
   * @return
   */
  public static boolean inNumericalOrder(int a, int b, int c)
  {
    boolean result = false;

    if ((a < b) && (a < c) && (b < c) || (a == b) && (b == c))
    {
      result = true;
    }

    return result;
  }

  /**
   * Determines if the String's a, b, c are sorted in alphabetical order.
   * 
   * <pre>
   * Examples:
   * 
   * inAlphabeticalOrder("acorn", "apple", "pizza") -> true
   * inAlphabeticalOrder("bear", "morning", "zebra") -> true
   * inAlphabeticalOrder("giraff", "morning", "zebra") -> false
   * inAlphabeticalOrder("egg", "egg", "egg") -> true
   * inAlphabeticalOrder("egg", "egg", "eg") -> false
   * </pre>
   * 
   * @param a
   *          lowercase != null
   * @param b
   *          lowercase != null
   * @param c
   *          lowercase != null
   * @return
   */
  public static boolean inAlphabeticalOrder(String a, String b, String c)
  {
    boolean result = false;

    if ((a.compareTo(b) < 0) && (a.compareTo(c) < 0) && (b.compareTo(c) < 0)
      || (a == b) && b == c)
    {
      return true;
    }

    return result;
  }

  /**
   * Given a sentence, this returns the number of words in the sentence.
   * <p>
   * PRECONDITION: sentence will not have more than one space between each word.
   * </p>
   * 
   * @param sentence
   *          != null && there is only one space between each word.
   * @return the number of words
   */
  public static int wordCount(String sentence)
  {
    int count = 0;

    for (int i = 0; i < sentence.length(); i++)
    {
      if (" ".equals(sentence.substring(i, i + 1)))
      {
        count++;
      }
    }

    if (sentence.equals(""))
    {
      return count;
    }
    else
    {
      return count + 1;
    }
  }

  /**
   * A string dateStr represents a date in the format "mm/dd/yyyy" (for example,
   * "05/31/2009"). Write a statement or a fragment of code that changes dateStr
   * to the format "dd-mm-yyyy" (e.g., "31-05-2009"). It shouldn't matter if the
   * parameter uses forward slashes or hypens as a delimiter.
   * 
   * @param usaDate
   * @return
   */
  public static String getEuroDate(String usaDate)
  {
    return usaDate.substring(3, 5) + "-" + usaDate.substring(0, 2) + "-"
      + usaDate.substring(6);
  }

  /**
   * In the hangman game, you guess a letter, and then the player reveals any of
   * those letters. Mystery ones remain a hyphen.
   * 
   * <pre>
   * getHangmanResponse("apple", "p") -> "-pp--"
   * getHangmanResponse("apple", "e") -> "----e"
   * getHangmanResponse("apple", "x") -> "-----"
   * getHangmanResponse("apple", "q") -> "-----"
   * getHangmanResponse("apple", "a") -> "a----"
   * </pre>
   * 
   * @param answer
   *          != null
   * @param letterGuess
   *          != null
   * @return see description above.
   */
  public static String getHangmanReponse(String answer, String letterGuess)
  {
    String result = "";

    for (int i = 0; i < answer.length(); i++)
    {
      if (letterGuess.equals(answer.substring(i, i + 1)))
      {
        result += letterGuess;
      }
      else
      {
        result += "-";
      }
    }

    return result;
  }

  /**
   * Given two strings, return a new string created with the first letter of
   * firstWord and the last letter of lastWord. Substitute a hashtag symbol for
   * any string parameter that is empty.
   * 
   * <pre>
   * Examples: 
   * firstAndLast("kitten", "zip") -> "kp" 
   * firstAndLast("", "egg") -> "#p"
   * </pre>
   * 
   * @param firstWord
   * @param lastWord
   * @return
   */
  public static String firstAndLast(String firstWord, String lastWord)
  {
    String firstLetterOfFirstWord = "";
    String lastLetterOfLastWord = "";

    // the first letter of the first word
    if (firstWord.equals(""))
    {
      firstLetterOfFirstWord = "#";
    }
    else
    {
      firstLetterOfFirstWord = firstWord.substring(0, 1);
    }

    // the last letter of the last word
    if (lastWord.equals(""))
    {
      lastLetterOfLastWord = "#";
    }
    else
    {
      lastLetterOfLastWord =
        lastWord.substring(lastWord.length() - 1, lastWord.length());
    }

    return firstLetterOfFirstWord + lastLetterOfLastWord;
  }

  /**
   * Given a pattern and a String toSearch, this method returns the number of
   * times the pattern is found. I used indexOf to search.
   * 
   * <pre>
   * patternCount("appleappleacorn", "app") -> 2
   * patternCount("eggtoeggtoto", "to") -> 3
   * patternCount("eggtoeggtoto", "too") -> 0
   * </pre>
   * 
   * @param toSearch
   *          !null && is lowercase.
   * @param pattern
   *          !null && is lowercase.
   * @return the number of times pattern is found in toSearch
   */
  public static int patternCount(String toSearch, String pattern)
  {
    int count = 0;
    int additionalIndexValue = pattern.length();

    for (int i = 0; i < toSearch.length() - additionalIndexValue + 1; i++)
    {
      if (pattern.equals(toSearch.substring(i, i + additionalIndexValue)))
      {
        count++;
      }
    }

    return count;
  }

  /**
   * Suppose a string holds a person's last name and first name, separated by a
   * comma. Write a method convertName that takes such a string and returns a
   * string where the first name is placed first followed by one space and then
   * the last name.
   * 
   * <pre>
   * convertName("Hopper, Grace") -> "Grace Hopper"
   * convertName("Skywalker, Luke") -> "Luke Skywalker"
   * </pre>
   * 
   * @param phrase
   *          has two strings separated by a comma and a space. There will
   *          always be a comma and a space after the comma.
   * @return the first name followed by a space and the last name. No comma.
   */
  public static String convertName(String phrase)
  {
    int indexOfComma = 0;

    for (int i = 0; i < phrase.length(); i++)
    {
      if (",".equals(phrase.substring(i, i + 1)))
      {
        indexOfComma = i;
      }
    }

    return phrase.substring(indexOfComma + 2) + " "
      + phrase.substring(0, indexOfComma);
  }

  /**
   * Determines if phrase is a palendrome. A palendrome is a word or sentence
   * that spells the same way forwards as it does backwards.
   * 
   * <pre>
   * Examples:
   * isPalendrome("Rise to vote, sir") -> true
   * isPalendrome("beans") -> false
   * isPalendrome("kayak") -> true
   * isPalendrome("Able was i ere i saw Elba") -> true
   * isPalendrome("Madam I'm Adam") -> true
   * isPalendrome("I really love CDO") -> false
   * </pre>
   * <p>
   * Hints: You may use the toLowerCase() method of the String class even though
   * it is not covered on the AP exam
   * </p>
   * 
   * @param phrase
   *          could have spaces, commas, apostrophes, or uppercase letters. It
   *          will not have any other characters besides these.
   * @return
   */
  public static boolean isPalendrome(String phrase)
  {
    // You don't have to use these local variables. That's just how I solved it.
    String simplePhrase = phrase.toLowerCase();
    String reversePhrase = "";

    String tempSimplePhrase = "";

    // Lots of code here that's missing
    for (int i = 0; i < simplePhrase.length(); i++)
    {
      if (!((simplePhrase.substring(i, i + 1)).equals(" "))
        && !((simplePhrase.substring(i, i + 1)).equals("'"))
        && !((simplePhrase.substring(i, i + 1)).equals(",")))
      {
        tempSimplePhrase += simplePhrase.substring(i, i + 1);
      }
    }

    for (int i = tempSimplePhrase.length(); i > 0; i--)
    {
      reversePhrase += tempSimplePhrase.substring(i - 1, i);
    }

    // You can change this to whatever. It's just what I did to solve it.
    return (tempSimplePhrase.equals(reversePhrase));
  }

  /**
   * Given two strings, original and deleteInfo, return a new string that
   * doesn't have any matches with deleteInfo.
   * 
   * PRECONDITION: original and removeData are lowercase and contain at least
   * one character.
   * 
   * <pre>
   * searchAndRemove("steve jobs invented apple computers", "te") returns
   * "sve jobs invend apple compurs"
   * 
   * searchAndRemove("aaa", "aa"); returns "a"
   * </pre>
   * 
   * @param original
   *          is not null and original.length() >= 1 and lowercase
   * @param removeData
   *          is not null and removeData.length() >= 1 and lowercase
   * @return
   */
  public static String searchAndRemove(String original, String removeData)
  {
    String modifiedOriginal = "";
    int additionalIndexValue = removeData.length();

    int i = 0;
    while (i < original.length())
    {
      if (i > original.length() - additionalIndexValue)
      {
        modifiedOriginal += original.substring(i, i + 1);
        i++;
      }
      else
      {
        if (original.substring(i, i + additionalIndexValue).equals(removeData))
        {
          i += additionalIndexValue;
        }
        else
        {
          modifiedOriginal += original.substring(i, i + 1);
          i++;
        }
      }
    }

    return modifiedOriginal;
  }

  /**
   * Creates a string that displays the first position of the letters a, e, i,
   * o, and u in sentence. If a vowel is not located, it will report -1 as the
   * position. Hint: use indexOf to simplify things.
   * 
   * <pre>
   *  findVowels("appleapp") would return
   *  The first position of a is 0.
   *  The first position of e is 4.
   *  The first position of i is -1.
   *  The first position of o is -1.
   *  The first position of u is -1.
   * </pre>
   * 
   * @param sentence
   *          != null and lowercase
   * @return
   */
  public static String findVowels(String sentence)
  {
    int firstPositionOfA = sentence.indexOf("a");
    int firstPositionOfE = sentence.indexOf("e");
    int firstPositionOfI = sentence.indexOf("i");
    int firstPositionOfO = sentence.indexOf("o");
    int firstPositionOfU = sentence.indexOf("u");

    return "The first position of a is " + firstPositionOfA + ".\n"
      + "The first position of e is " + firstPositionOfE + ".\n"
      + "The first position of i is " + firstPositionOfI + ".\n"
      + "The first position of o is " + firstPositionOfO + ".\n"
      + "The first position of u is " + firstPositionOfU + ".\n";
  }

  /**
   * returns true if and only if the array of words is in alphabetical order
   * 
   * <pre>
   * if stuff == {"alpha", "bravo", "charlie", "delta", "echo", "foxtrot"}
   * inAlphabeticalOrder(stuff) -> true
   * 
   * if group == {"mike", "kilo", "juliett"}
   * inAlphabeticalOrder(group) -> false;
   * 
   * if collection == {"quebec", "quebec", "zulu"}
   * inAlphabeticalOrder(collection) -> true;
   * </pre>
   * 
   * @param words
   *          not null and full of lowercase words.
   * @return true if in alphabetical order.
   */
  public static boolean inAlphabeticalOrder(String[] words)
  {
    boolean inAlphabeticalOrder = true;

    int i = 0;
    while (inAlphabeticalOrder == true && i < words.length - 1)
    {
      if (words[i].compareTo(words[i + 1]) > 1)
      {
        inAlphabeticalOrder = false;
      }
      i++;
    }

    return inAlphabeticalOrder;
  }

  /**
   * Given a string, if the first or last letters are 'f', return the string
   * without those 'f' letters, and otherwise return the string unchanged.
   * 
   * <pre>
   * withoutX("fHif") -> "Hi"
   * withoutX("fHi") -> "Hi"
   * withoutX("Hfif") -> "Hfi"
   * </pre>
   */
  public static String withoutF(String str)
  {
    String modifiedStr1 = "";

    if (str.substring(0, 1).equals("f"))
    {
      modifiedStr1 = str.substring(1);
    }
    else
    {
      modifiedStr1 = str;
    }

    String modifiedStr2 = "";
    if (str.substring(str.length() - 1, str.length()).equals("f"))
    {
      modifiedStr2 = modifiedStr1.substring(0, modifiedStr1.length() - 1);
    }
    else
    {
      modifiedStr2 = modifiedStr1;
    }

    return modifiedStr2;
  }

  /**
   * Merges two strings together. The first letter is always from phrase1. If
   * you run out of letters from one of the phrases, then just stitch on the
   * remaining unused letters from the other one.
   * 
   * Examples:
   * 
   * <pre>
   * mergeTwoWords("abc", "xyz") -> "axbycz" 
   * mergeTwoWords("th", "heywow") -> "thheywow" 
   * mergeTwoWords("", "pizza") -> "pizza"
   * </pre>
   * 
   * @param phrase1
   *          != null and lowercase
   * @param phrase2
   *          != null and lowercase
   * @return see above.
   */
  public static String mergeTwoWords(String phrase1, String phrase2)
  {
    String mergedWords = "";
    String shorterWord = "";
    String longerWord = "";

    if (phrase1.length() < phrase2.length())
    {
      shorterWord = phrase1;
      longerWord = phrase2;
    }
    else
    {
      shorterWord = phrase2;
      longerWord = phrase1;
    }

    for (int i = 0; i < shorterWord.length(); i++)
    {
      mergedWords += phrase1.substring(i, i + 1) + phrase2.substring(i, i + 1);
    }

    mergedWords += longerWord.substring(shorterWord.length());

    return mergedWords;
  }

  /**
   * Adds aBook to a list of books in alphabetical order. For example, if the
   * array had [adventures, barges, moon] and aBook was "barney", then
   * insertInOrder would mutate the array to [adventures, barges, barney, moon].
   * Methods used: compareTo.
   * 
   * @param bookList
   *          is not null, all items are sorted alphabetically. There is a
   *          single empty null element at the end of the array.
   * @param aBook
   *          the non-null item to insert alpabetically into bookList.
   */
  public static void insertInOrder(String[] bookList, String aBook)
  {
    for (int i = 0; i < bookList.length; i++)
    {
      if (i == bookList.length - 2)
      {
        bookList[i + 1] = aBook;
      }
      else if (i + 1 == bookList.length)
      {
        bookList[i] = aBook;
      }
      else if (bookList[i].compareTo(aBook) <= 0
        && bookList[i + 1].compareTo(aBook) >= 0)
      {
        for (int j = bookList.length - 1; j > i + 1; j--)
        {
          bookList[j] = bookList[j - 1];
          if (j - 1 == i + 1)
          {
            bookList[i + 1] = aBook;
          }
        }
        i = bookList.length;
      }
    }
  }
}