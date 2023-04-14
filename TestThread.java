public class TestThread extends Thread {
    public static void main(String[] args) {
        TestThread t1 = new TestThread();
        // t1.setName("First Thread");
        TestThread t2 = new TestThread();
        // t2.setName(" second Thread");
        new TestThread().start();
        t1.start();
        t2.start();
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
