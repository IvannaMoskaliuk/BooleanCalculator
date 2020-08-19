/**
 * @author Ivanna Moskaliuk KNUTE
 * @version 09.08.2020
 * Boolean Calculator
 * class Main
 **/
package ght.edu;

public class Main {
    public static void main(String[] args) {
        BooleanOperation booleanOperation = new BooleanOperation(null, null);
        System.out.println(booleanOperation.conjunction());
        System.out.println(booleanOperation.disjunction());
    }
}
