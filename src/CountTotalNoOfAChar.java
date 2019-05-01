import java.util.Scanner;

public class CountTotalNoOfAChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your String: ");
        String line = scanner.nextLine();
        System.out.println("Please enter the character the number of occurences of which you want to count: ");
        String ch=scanner.next();

        int count = line.length() - line.replace(ch, "").length();
        System.out.println("The "+ch+" occurs "+count+" times");
    }
}
