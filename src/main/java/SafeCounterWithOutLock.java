import java.util.concurrent.atomic.AtomicInteger;

public class SafeCounterWithOutLock {
    private AtomicInteger counter = new AtomicInteger(0);

    public int getValue() {
        return counter.get();
    }

    public void increment() {
        for (int i = 0; i <100; i++) {
            while (true) {
                int existValue = getValue();
                int newValue = existValue + 1;
                if (counter.compareAndSet(existValue, newValue)) {
                    System.out.println(newValue);
                    return;
                }
            }
        }
    }
}

