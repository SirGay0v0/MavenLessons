public class DemoThread {
    public static void main(String[] args) {
new MyThread().start();
    }


    private static class MyThread extends Thread {
        public static int index;
        Object obj = new Object();
        @Override
        public void run() {
            synchronized (obj) {
                for (int i = 0; i < 100; i++) {
                    index++;
                    System.out.println("Поток: " + index);
                }
            }
        }
    }
}
