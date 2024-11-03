import geometry.Circle;
import geometry.Point;

//Hello toi
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(20, new Point(10, 20));
        Circle circleCopiedSuperficially = shallowCopy.DoCopy.execute(circle);
        Circle circleCopiedDeeply = deepCopy.DoCopy.execute(circle);

        System.out.print("** Original     => "); System.out.println(circle.convertToString());
        System.out.print("** Shallow copy => "); System.out.println(circleCopiedSuperficially.convertToString());
        System.out.print("** Deep copy    => "); System.out.println(circleCopiedDeeply.convertToString());
    }
}