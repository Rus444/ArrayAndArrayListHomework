import java.util.Scanner;

public class CountWordsAndSpacesInString {
    public static int countWords(String str) {
        int count1 = 1;
        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                count1++;
            }
        }
        return count1;
    }


    public static int countSpaces(String str) {
        int count2 = 0;
        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.charAt(i) == ' ') {
                count2++;
            }
        }
        return count2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a sentence: ");
        String sentence = in.nextLine();

        System.out.println(sentence);
        System.out.print("Your sentence has " + countWords(sentence) + " words and " + countSpaces(sentence) + " spaces.");
    }
}
