public class Printer {
    public synchronized void printDocument(String userName) { // Synchronized method to ensure only one thread can print at a time
        for (int i = 0; i < 5; i++) {
            System.out.println("Printing document for user: " + userName);
            try {
                Thread.sleep(500); // Simulate time taken to print
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
