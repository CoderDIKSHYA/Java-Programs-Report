/*
Question:
A product can be added to the cart only if the available stock
is more than zero. Use conditional (ternary) operator.
*/
class StockAvailability {
    public static void main(String[] args) {
        int stock = 5;
        String result = (stock > 0) ? "Product Added to Cart" : "Out of Stock";
        System.out.println(result);
    }
}

