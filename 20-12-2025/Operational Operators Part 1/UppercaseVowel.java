import java.util.Scanner;
public class UppercaseVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        System.out.println((ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') ?
                "Uppercase Vowel" : "Uppercase Consonant");
    }
}
