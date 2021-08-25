package Misc.ProducerAndConsumer;

public class Consumer extends Thread {
    private Storage storage;
    private int number;

    public Consumer(Storage storage, int number) {
        this.storage = storage;
        this.number = number;
    }

    public void run() {
        int value = 0;
        for (int i = 0; i < 10; i++) {
            value = storage.get(number);
        }
    }
}
