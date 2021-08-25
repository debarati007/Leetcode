package Misc.ProducerAndConsumer;

public class Storage {
    private int contents;
    private boolean available;

    public synchronized void put(int thread, int value) {
        while (available == true) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        contents = value;
        available = true;
        System.out.println("Producer :" + thread + " generated " + value);
        notifyAll();
    }

    public synchronized int get(int thread) {
        while (available == false) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        available = false;
        System.out.println("Consumer " + thread + " gets " + contents);
        notifyAll();
        return contents;
    }

}
