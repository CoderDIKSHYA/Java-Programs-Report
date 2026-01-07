public class Solution8 {

    static class Elevator {

        private int currentFloor;

        public void setInitialFloor(int floor) {
            this.currentFloor = floor;
        }

        public void moveUp() {
            if (currentFloor < 10) {
                currentFloor++;
            } else {
                System.out.println("Already at top floor");
            }
        }

        public void moveDown() {
            if (currentFloor > 1) {
                currentFloor--;
            }
        }

        public void display() {
            System.out.println("Current Floor: " + currentFloor);
        }
    }

    public static void main(String[] args) {

        Elevator e = new Elevator();

        e.setInitialFloor(9);

        e.moveUp();
        e.moveUp();
        e.moveDown();

        e.display();
    }
}
