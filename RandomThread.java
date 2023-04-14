public class RandomThread extends Thread {
    public static void main(String[] args) {
        TestThread kit = new TestThread();
        kit.setName("Frist Thread");
        TestThread kip = new TestThread();
        kip.setName("Second Thread");
        kit.start();
        kip.start();
    }

    public void run() {
        if (Thread.currentThread().getName().equals("Second Thread")) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i * 2);
            }
        } else {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Hello");
            }
        }
    }
}
