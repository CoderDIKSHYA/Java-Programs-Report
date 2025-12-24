import java.util.Scanner;

public class CheckAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        String result =
            ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
            ? "Alphabet"
            : "Not an Alphabet";

        System.out.println(result);
    }
}

