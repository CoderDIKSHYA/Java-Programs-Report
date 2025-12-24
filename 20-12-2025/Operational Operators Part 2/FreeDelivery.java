/*
Question:
Free delivery is applicable only when the cart value
is ₹499 or more. Use conditional operator.
*/

class FreeDelivery {
    public static void main(String[] args) {
        int cartValue = 499;
        String result = (cartValue >= 499) ? "Free Delivery" : "Delivery Charges Apply";
        System.out.println(result);
    }
}
