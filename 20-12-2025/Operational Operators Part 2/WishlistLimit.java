/*
Question:
A product can be added to the cart only if the available stock
is more than zero. Use conditional (ternary) operator.
*/
class WishlistLimit {
    public static void main(String[] args) {
        int items = 100;
        String result = (items < 100) ? "Item Added to Wishlist" : "Wishlist Full";
        System.out.println(result);
    }
}
