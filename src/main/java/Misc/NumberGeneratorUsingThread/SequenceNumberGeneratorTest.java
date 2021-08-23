package Misc.NumberGeneratorUsingThread;
//* Each thread call method printNumbers to generate numbers in sequence
// * Java program to Print numbers in sequence using 3 Threads

public class SequenceNumberGeneratorTest {
    private static final int NUMBER_OF_THREAD=3;
    private static final int TOTAL_NUMBER_IN_SEQUENCE=20;
    public static void main(String[] args) {
        NumbersGenerator numbersGenerator=new NumbersGenerator(NUMBER_OF_THREAD,TOTAL_NUMBER_IN_SEQUENCE);
        Thread t1=new Thread(new SequenceGeneratorTask(numbersGenerator,1),"THREAD-1");
        Thread t2=new Thread(new SequenceGeneratorTask(numbersGenerator,2),"THREAD-2");
        Thread t3=new Thread(new SequenceGeneratorTask(numbersGenerator,0),"THREAD-3");
        t1.start();
        t2.start();
        t3.start();
    }
}
