import java.util.Scanner;
public class CheckLowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        String result = (ch >= 'a' && ch <= 'z') ? "Lowercase" : "Not Lowercase";

        System.out.println(result);
    }
}
