public class Solution6 {

    static class Student {

        private String studentName;
        private int marks;

        public void setStudentName(String name) {
            this.studentName = name;
        }

        public void setMarks(int marks) {
            this.marks = marks;
        }

        public int getMarks() {
            return marks;
        }

        public void display() {
            System.out.println(studentName + " scored " + marks);
        }
    }

    public static void main(String[] args) {

        Student s = new Student();

        s.setStudentName("Ravi");
        s.setMarks(85);
        s.display();
    }
}
