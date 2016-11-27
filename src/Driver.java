import Shapes.Rectangle;
import Shapes.Square;
import utils.Math;
public class Driver {
    public static void main(String[] args) {

        System.out.println("****** Shapes Problem ******\n");
        Square firstSquare = new Square(100);
        Rectangle firstRect = new Rectangle(50,80);

        System.out.println("The are of firstSquare is: " + firstSquare.getArea());
        System.out.println("The are of firstRect is: " + firstRect.getArea());
        System.out.println("\n****************************** \n\n");

        System.out.println("****** Factorial Problem ******\n");

        double number = 15.6;
        int n = (int) number;

        System.out.println("The result of "+n+" factorial is: " + Math.factorial(n));
        System.out.println("The result of "+n+" factorialLoop is: " + Math.factorialLoop(n));
        System.out.println("\n****************************** \n\n");
    }
}
