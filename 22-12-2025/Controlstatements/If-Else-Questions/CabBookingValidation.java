//Online Cab Booking Validation 
//A cab can be booked only if the driver is avaiable , the user location is serviceable , and payment mode is selected .
//Question : Frame the decison -making logic in java 


import java.util.Scanner;

class CabBookingValidation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter driver availability (yes/no): ");
        String driver = sc.nextLine();

        System.out.print("Enter location serviceable (yes/no): ");
        String location = sc.nextLine();

        System.out.print("Enter payment mode (cash/online): ");
        String payment = sc.nextLine();

        if (driver != null && !driver.isEmpty()
            && location != null && !location.isEmpty()
            && payment != null && !payment.isEmpty()) {

            System.out.println("Cab Booked Successfully");
        } else {
            System.out.println("Cab Booking Failed");
        }

        sc.close();
    }
}
