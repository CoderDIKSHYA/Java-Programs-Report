public class Solution7 {

    static class ShoppingCart {

        private int itemCount;

        public void setInitialItems(int count) {
            this.itemCount = count;
        }

        public void addItems(int count) {
            if (count > 0) {
                itemCount += count;
            }
        }

        public void removeItems(int count) {
            if (count > 0 && count <= itemCount) {
                itemCount -= count;
            }
        }

        public void display() {
            System.out.println("Total Items in Cart: " + itemCount);
        }
    }

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        cart.setInitialItems(2);
        cart.addItems(3);
        cart.removeItems(1);
        cart.display();
    }
}
