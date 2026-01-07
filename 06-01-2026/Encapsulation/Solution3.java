public class Solution3 {

    static class Thermostat {

        private int currentTemperature;

        public void setInitialTemperature(int temp) {
            this.currentTemperature = temp;
        }

        public void setTemperature(int temp) {
            if (temp < 16 || temp > 30) {
                System.out.println("Temperature out of range");
            } else {
                currentTemperature = temp;
            }
        }

        public void display() {
            System.out.println("Current Temperature: " + currentTemperature);
        }
    }

    public static void main(String[] args) {

        Thermostat t = new Thermostat();

        t.setInitialTemperature(22);
        t.setTemperature(35);
        t.setTemperature(25);
        t.display();
    }
}
