import java.util.Scanner;
public class AlphabetVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        System.out.println(("AEIOUaeiou".indexOf(ch)>=0) ? "Vowel" : "Consonant");
    }
}
