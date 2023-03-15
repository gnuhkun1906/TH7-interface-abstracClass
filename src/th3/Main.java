package th3;



import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Circle[] circle = new Circle[3];
        circle[0] = new Circle(3.6);
        circle[1] = new Circle();
        circle[2] = new Circle(3.5, "indigo", false);
        System.out.println("Pre-sorted");
        for (Circle circles : circle) {
            System.out.println(circles);
        }
        CircleComparator circleComparator = new CircleComparator();
        Arrays.sort(circle,circleComparator);
        System.out.println("After-sorted");
        for (Circle circle1 : circle) {
            System.out.println(circle1);
        }
    }
}

