class PaymentVerification {
    public static void main(String[] args) {
        int paid = 1000, order = 1000;
        String result = (paid == order) ? "Payment Successful" : "Payment Failed";
        System.out.println(result);
    }
}
