class CustomerDiscount {
    public static void main(String[] args) {

        boolean premiumMember = false;
        boolean saleOngoing = true;
        boolean cartValueAbove5000 = true;

        boolean discountApplicable =
                premiumMember || (cartValueAbove5000 && saleOngoing);

        System.out.println(discountApplicable);
    }
}
