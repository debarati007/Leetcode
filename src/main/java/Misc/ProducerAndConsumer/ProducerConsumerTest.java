package Misc.ProducerAndConsumer;

public class ProducerConsumerTest {
    public static void main(String[] args) {
        Storage storage = new Storage();
        Producer producer = new Producer(storage, 1);
        Consumer consumer = new Consumer(storage, 1);
        producer.start();
        consumer.start();
    }
}
