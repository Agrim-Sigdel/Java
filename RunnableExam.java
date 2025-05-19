public class RunnableExam implements Runnable {

    // Implementing runnable interface
    @Override
    public void run() {

        System.out.println("this is a runnable thread");

    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableExam());
        t1.start();

    }
}
