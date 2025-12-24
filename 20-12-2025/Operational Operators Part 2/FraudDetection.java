class FraudDetection {
    public static void main(String[] args) {
        int orderValue = 15000, averageValue = 9000;
        String result = (orderValue > averageValue) ? "Flagged for Review" : "Normal Order";
        System.out.println(result);
    }
}
