import static java.lang.Thread.sleep;

public class PeopleQueue extends Thread {
    private String[] name;

    public PeopleQueue(String... name1) {
        this.name = name1;
    }

    public void run() {
        for (int i = 0; i < name.length; i++) {
            System.out.println("Человек с именем: " + name[i]);
            try {sleep(500);}
            catch (Exception e) {}
        }
    }
}
