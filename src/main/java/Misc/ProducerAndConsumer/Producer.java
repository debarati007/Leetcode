package Misc.ProducerAndConsumer;

public class Producer extends Thread{
    private Storage storage;
    private int number;

    public Producer(Storage storage, int number) {
        this.storage = storage;
        this.number = number;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            storage.put(number, i);
            try {
                Thread.sleep((int) (Math.random() * 100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
