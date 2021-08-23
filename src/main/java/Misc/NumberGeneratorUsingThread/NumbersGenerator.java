package Misc.NumberGeneratorUsingThread;

public class NumbersGenerator {
    private int number=1;
    private int numberOfThreads;
    private int totalNumberInSequence;

    public NumbersGenerator(int numberOfThreads, int totalNumberInSequence) {
        this.numberOfThreads = numberOfThreads;
        this.totalNumberInSequence = totalNumberInSequence;
    }

    public void printNumbers(int result){
        synchronized (this){
            while (number<totalNumberInSequence-1){
                while(number%numberOfThreads!=result){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+" Printed :"+number++);
                notifyAll();
            }
        }
    }
}
