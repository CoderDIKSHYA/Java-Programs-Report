import java.util.Scanner;
public class CheckAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println((age>=18) ? "Valid Age" : "Invalid Age");
    }
}
