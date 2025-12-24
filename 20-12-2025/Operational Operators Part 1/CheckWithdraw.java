import java.util.Scanner;
public class CheckWithdraw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amt = sc.nextInt();
        System.out.println((amt>0 && amt%100==0) ? "Withdrawal Allowed" : "Not Allowed");
    }
}
