public class Solution1 {

    static class ParkingLot {

        private int availableSlots;

        public void setAvailableSlots(int slots) {
            this.availableSlots = slots;
        }

        public void parkCar() {
            if (availableSlots > 0) {
                availableSlots--;
            } else {
                System.out.println("Parking Full");
            }
        }

        public void removeCar() {
            availableSlots++;
        }

        public void display() {
            System.out.println("Available Slots: " + availableSlots);
        }
    }

    public static void main(String[] args) {

        ParkingLot lot = new ParkingLot();

        lot.setAvailableSlots(5);

        for (int i = 0; i < 6; i++) {
            lot.parkCar();
        }

        lot.removeCar();

        lot.display();
    }
}
