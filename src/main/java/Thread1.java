public class Thread1{
    public static void main(String[] args) {

        Runnable task = () ->{
            try {
                int secToWeight = 1000*60;
                Thread.currentThread().sleep(secToWeight);
                System.out.println("Я проснулся");

            }catch (InterruptedException ex){ex.getMessage();

            }
        };
        Thread thread = new Thread(task);
        thread.start();

    }
//        Thread thread1 = new Thread("Thread1");
//        Thread thread2 = new Thread("Thread2");
//        thread1.start();
//        thread2.start();
//        System.out.println("Names of thread");
//        System.out.println(thread1.getName());
//        System.out.println(thread2.getName());
//
//
//    }
//
//    @Override
//    public void run() {
//
//    }
}
