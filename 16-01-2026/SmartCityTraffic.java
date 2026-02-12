package FileHandling;

import java.util.*;

class Vehicle {

    private String vehicleNumber;
    private String type;
    private String checkpointName;
    private long timestamp;

    public Vehicle(String vehicleNumber, String type, String checkpointName) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.checkpointName = checkpointName;
        this.timestamp = System.currentTimeMillis();
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public String getCheckpointName() { return checkpointName; }
    public long getTimestamp() { return timestamp; }

    @Override
    public String toString() {
        return "Vehicle[" + vehicleNumber + ", " + type + ", " +
                checkpointName + ", " + timestamp + "]";
    }

    // For duplicate removal (same vehicleNumber + timestamp)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Vehicle)) return false;
        Vehicle v = (Vehicle) obj;
        return vehicleNumber.equals(v.vehicleNumber)
                && timestamp == v.timestamp;
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicleNumber, timestamp);
    }
}

public class SmartCityTraffic {

    static ArrayList<Vehicle> vehicleList = new ArrayList<>();
    static HashMap<String, List<Vehicle>> checkpointMap = new HashMap<>();
    static HashMap<String, Vehicle> vehicleSearchMap = new HashMap<>();
    static LinkedList<Vehicle> lastFive = new LinkedList<>();

    static PriorityQueue<Vehicle> emergencyQueue =
            new PriorityQueue<>((v1, v2) -> {
                return getPriority(v1.getType()) - getPriority(v2.getType());
            });

    static int getPriority(String type) {
        if (type.equalsIgnoreCase("Ambulance")) return 1;
        if (type.equalsIgnoreCase("FireTruck")) return 2;
        return 3;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== SMART CITY TRAFFIC MANAGEMENT ===");
            System.out.println("1. Add Vehicle Entry");
            System.out.println("2. Remove Duplicates");
            System.out.println("3. Display Vehicles by Checkpoint");
            System.out.println("4. Process Emergency Vehicle Queue");
            System.out.println("5. Traffic Report");
            System.out.println("6. Show Last 5 Vehicles");
            System.out.println("7. Exit");
            System.out.print("Choose: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Vehicle Number: ");
                    String number = sc.nextLine();

                    System.out.print("Type (Car/Bike/Bus/Truck/Ambulance/FireTruck): ");
                    String type = sc.nextLine();

                    System.out.print("Checkpoint: ");
                    String checkpoint = sc.nextLine();

                    Vehicle v = new Vehicle(number, type, checkpoint);

                    vehicleList.add(v);
                    vehicleSearchMap.put(number, v);

                    checkpointMap
                            .computeIfAbsent(checkpoint, k -> new ArrayList<>())
                            .add(v);

                    emergencyQueue.add(v);

                    lastFive.addFirst(v);
                    if (lastFive.size() > 5)
                        lastFive.removeLast();

                    System.out.println("Entry added!");
                    break;

                case 2:
                    HashSet<Vehicle> set = new HashSet<>(vehicleList);
                    vehicleList = new ArrayList<>(set);
                    System.out.println("Duplicates removed!");
                    break;

                case 3:
                    System.out.print("Enter checkpoint name: ");
                    String cp = sc.nextLine();

                    List<Vehicle> list = checkpointMap.get(cp);

                    if (list == null || list.isEmpty()) {
                        System.out.println("No vehicles found.");
                    } else {
                        System.out.println("Vehicles at " + cp + ":");
                        for (Vehicle vehicle : list)
                            System.out.println(vehicle);
                    }
                    break;

                case 4:
                    if (emergencyQueue.isEmpty()) {
                        System.out.println("No vehicles in queue.");
                    } else {
                        Vehicle processed = emergencyQueue.poll();
                        System.out.println("Processing emergency vehicle:");
                        System.out.println(processed);
                    }
                    break;

                case 5:
                    System.out.println("--- Traffic Report ---");

                    HashMap<String, Integer> congestion = new HashMap<>();

                    for (Vehicle vehicle : vehicleList) {
                        congestion.put(vehicle.getCheckpointName(),
                                congestion.getOrDefault(vehicle.getCheckpointName(), 0) + 1);
                    }

                    System.out.println("Checkpoint congestion:");
                    for (String key : congestion.keySet()) {
                        System.out.println(key + ": " + congestion.get(key));
                    }

                    if (!congestion.isEmpty()) {
                        String busiest = Collections.max(congestion.entrySet(),
                                Map.Entry.comparingByValue()).getKey();

                        String least = Collections.min(congestion.entrySet(),
                                Map.Entry.comparingByValue()).getKey();

                        System.out.println("Busiest: " + busiest);
                        System.out.println("Least Busy: " + least);
                    }
                    break;

                case 6:
                    System.out.println("Last 5 vehicles:");
                    for (Vehicle vehicle : lastFive)
                        System.out.println(vehicle);
                    break;

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 7);

        sc.close();
    }
}
