import java.util.Scanner;
public class CheckDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        System.out.println((ch>='0'&&ch<='9') ? "Digit" : "Not Digit");
    }
}
