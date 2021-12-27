package Misc.Java8;


@FunctionalInterface
public interface NewInterface {
    //java 8 introduces @FunctionalInterface annotation to mark an interface as functional interface.

    //it allowes one abstract method
    public void getSum(int x,int y);

    //it allowes concrete methods known as default method
    public default boolean isColor(String color){
        return color.equals("red")||color.equals("grreen");
    }


}
