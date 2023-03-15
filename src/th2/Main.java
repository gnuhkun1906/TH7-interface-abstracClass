package th2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ComparableCircle circle[]=new ComparableCircle[3];
        circle[0]=new ComparableCircle();
        circle[1]=new ComparableCircle(3.6);
        circle[2]=new ComparableCircle(3.5," indigo ",false);
        System.out.println("Pre-sorted :");
         for (ComparableCircle comparableCircle:circle){
             System.out.println(comparableCircle);
         }
        Arrays.sort(circle);
        System.out.println("After-sorted");
        for (ComparableCircle comparableCircle:circle){
            System.out.println(comparableCircle);
        }
    }
}
