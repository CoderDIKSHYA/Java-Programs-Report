class StudentExam {
    public static void main(String[] args) {

        boolean attendanceAbove75 = false;
        boolean medicalSubmitted = true;
        boolean feesPaid = true;

        boolean allowedForExam =
                (attendanceAbove75 || medicalSubmitted) && feesPaid;

        System.out.println(allowedForExam);
    }
}
