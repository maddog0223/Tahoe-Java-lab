package part_12;

/**
 * Created by ryandesmond on 10/12/17.
 */

@FunctionalInterface
public interface TraditionInterface {

    //exactly one and only one abstract method is allowed in class
    //because it's a functional interface that is used for Lambdas
    //functional interface is an abstract of one method

    public int run(int numLoops);

}
