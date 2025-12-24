class EmployeeEntry {
    public static void main(String[] args) {

        boolean hasIDCard = true;
        boolean permanentEmployee = false;
        boolean contractEmployee = true;
        boolean managerApproval = true;

        boolean canEnterOffice =
                hasIDCard && (permanentEmployee || (contractEmployee && managerApproval));

        System.out.println(canEnterOffice);
    }
}
