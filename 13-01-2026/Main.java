package Threads;

class DeadlockResolved {

    private static final Object PEN = new Object();
    private static final Object PAPER = new Object();

    static class TaskMartin extends Thread {
        public void run() {
            synchronized (PEN) {
                System.out.println("Martin picked Pen");
                try { Thread.sleep(100); } catch (InterruptedException e) {}
                synchronized (PAPER) {
                    System.out.println("Martin picked Paper");
                }
            }
        }
    }

    static class TaskDavid extends Thread {
        public void run() {
            synchronized (PEN) {   // SAME ORDER AS MARTIN
                System.out.println("David picked Pen");
                try { Thread.sleep(100); } catch (InterruptedException e) {}
                synchronized (PAPER) {
                    System.out.println("David picked Paper");
                }
            }
        }
    }

    public static void main(String[] args) {

        TaskMartin martin = new TaskMartin();
        TaskDavid david = new TaskDavid();

        martin.start();
        david.start();
    }
}
