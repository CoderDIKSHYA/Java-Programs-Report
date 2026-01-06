import java.util.Scanner;
class Details {
    public static void main(String[] args) {

        System.out.println("Details \n" + details());
    }

    public static String details() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("User name : ");
		String name = sc.next();
		System.out.print("Age  : ");
		int age =sc.nextInt();
		sc.close();
		return "Name : " +name+ "\nAge : "+age;
		
    }
}
