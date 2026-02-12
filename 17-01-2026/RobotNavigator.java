package FileHandling;

import java.util.Scanner;
import java.util.Stack;

public class RobotNavigator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stack<String> backStack = new Stack<>();
        Stack<String> forwardStack = new Stack<>();

        int position = 0;
        int choice;

        do {
            System.out.println("\n===== Robot Navigation Menu =====");
            System.out.println("1. Move Forward");
            System.out.println("2. Move Backward");
            System.out.println("3. Undo Last Move");
            System.out.println("4. Redo Last Undone Move");
            System.out.println("5. Show Current Position");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                // 1️⃣ Move Forward
                case 1:
                    System.out.print("Enter steps to move forward: ");
                    int forwardSteps = sc.nextInt();

                    position += forwardSteps;

                    backStack.push("FORWARD " + forwardSteps);
                    forwardStack.clear();  // Clear redo history

                    System.out.println("Moved Forward " + forwardSteps + " steps.");
                    break;

                // 2️⃣ Move Backward
                case 2:
                    System.out.print("Enter steps to move backward: ");
                    int backwardSteps = sc.nextInt();

                    position -= backwardSteps;

                    backStack.push("BACKWARD " + backwardSteps);
                    forwardStack.clear();  // Clear redo history

                    System.out.println("Moved Backward " + backwardSteps + " steps.");
                    break;

                // 3️⃣ Undo
                case 3:
                    if (!backStack.isEmpty()) {

                        String lastMove = backStack.pop();
                        String[] parts = lastMove.split(" ");
                        String direction = parts[0];
                        int steps = Integer.parseInt(parts[1]);

                        if (direction.equals("FORWARD")) {
                            position -= steps; // reverse
                        } else {
                            position += steps;
                        }

                        forwardStack.push(lastMove);
                        System.out.println("Undo performed.");

                    } else {
                        System.out.println("No move to undo.");
                    }
                    break;

                // 4️⃣ Redo
                case 4:
                    if (!forwardStack.isEmpty()) {

                        String redoMove = forwardStack.pop();
                        String[] parts = redoMove.split(" ");
                        String direction = parts[0];
                        int steps = Integer.parseInt(parts[1]);

                        if (direction.equals("FORWARD")) {
                            position += steps;
                        } else {
                            position -= steps;
                        }

                        backStack.push(redoMove);
                        System.out.println("Redo performed.");

                    } else {
                        System.out.println("No move to redo.");
                    }
                    break;

                // 5️⃣ Show Position
                case 5:
                    System.out.println("Current Position: " + position);
                    break;

                // 6️⃣ Exit
                case 6:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}
