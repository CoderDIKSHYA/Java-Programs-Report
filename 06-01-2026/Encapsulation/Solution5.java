public class Solution5{

    static class FoodDispenser {

        private int capacity;
        private int foodLevel;
        private int portionSize;
        private int calibration;

        public void setInitialValues(int capacity, int foodLevel, int portionSize, int calibration) {
            this.capacity = capacity;
            this.foodLevel = foodLevel;
            this.portionSize = portionSize;
            this.calibration = calibration;
        }

        public int getFoodLevel() {
            return foodLevel;
        }

        public void dispensePortion() {
            System.out.println("Dispensing " + portionSize + " grams of food...");
            if (foodLevel >= portionSize) {
                foodLevel -= portionSize;
                System.out.println("Food dispensed successfully. Current food level: " + foodLevel + " grams");
            } else {
                System.out.println("Error: Not enough food to dispense " + portionSize + " grams.");
            }
        }

        public void dispenseFood(int amount) {
            System.out.println("Attempting to dispense " + amount + " grams of food...");
            if (amount > 0 && amount <= foodLevel) {
                foodLevel -= amount;
                System.out.println("Food dispensed successfully. Current food level: " + foodLevel + " grams");
            } else {
                System.out.println("Error: Not enough food to dispense " + amount + " grams.");
            }
        }

        public void refillFood(int amount) {
            System.out.println("Refilling " + amount + " grams of food...");
            if (foodLevel + amount <= capacity) {
                foodLevel += amount;
            } else {
                foodLevel = capacity;
            }
            System.out.println("Food refilled successfully. Current food level: " + foodLevel + " grams");
        }
    }

    public static void main(String[] args) {

        FoodDispenser dispenser = new FoodDispenser();

        dispenser.setInitialValues(1000, 500, 100, 1);

        System.out.println("Current food level: " + dispenser.getFoodLevel() + " grams");

        dispenser.dispensePortion();

        dispenser.dispenseFood(600);

        dispenser.refillFood(300);

        System.out.println("Final food level: " + dispenser.getFoodLevel() + " grams");
    }
}
