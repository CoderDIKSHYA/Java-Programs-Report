class CouponExpiry {
    public static void main(String[] args) {
        int today = 12, expiry = 15;
        String result = (today < expiry) ? "Coupon Valid" : "Coupon Expired";
        System.out.println(result);
    }
}
