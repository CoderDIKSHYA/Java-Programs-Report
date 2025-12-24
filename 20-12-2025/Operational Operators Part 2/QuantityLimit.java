/*
Question:
A customer is allowed to purchase a maximum of 5 units of
a single product in one order. Use conditional operator.
*/
class QuantityLimit {
    public static void main(String[] args) {
        int quantity = 6;
        String result = (quantity <= 5) ? "Order Allowed" : "Quantity Limit Exceeded";
        System.out.println(result);
    }
}
