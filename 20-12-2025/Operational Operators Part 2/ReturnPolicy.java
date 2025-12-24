class ReturnPolicy {
    public static void main(String[] args) {
        int daysAfterDelivery = 8;
        String result = (daysAfterDelivery <= 7) ? "Return Accepted" : "Return Rejected";
        System.out.println(result);
    }
}
