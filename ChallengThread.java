public class ChallengThread extends Thread {
    public static void main(String[] args) {
        ChallengThread t1 = new ChallengThread();
        ChallengThread t2 = new ChallengThread();
        t1.setName("KIT");
        t2.setName("KIP");
        t1.start();
        t2.start();
    }

    public void run() {
        if (Thread.currentThread().getName().equals("KIP"))
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello");
            }
        else
            for (int i = 1; i <= 10; i++) {
                System.out.println(2 * i);
            }
    }
}