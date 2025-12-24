import java.util.Scanner;
public class LowercaseVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        System.out.println((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') ?
                "Lowercase Vowel" : "Lowercase Consonant");
    }
}
