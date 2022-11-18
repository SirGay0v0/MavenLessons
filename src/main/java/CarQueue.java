import static java.lang.Thread.sleep;

public class CarQueue extends Thread {
    private String[] name;

    public CarQueue(String... name1) {this.name = name1;}

        public void run () {
            for (int i = 0; i < name.length; i++) {
                System.out.println("Машина марки: " + name[i]);
                try {
                    sleep(500);
                } catch (Exception e) {
                }
            }
        }

    }

