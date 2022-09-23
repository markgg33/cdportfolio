import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        polygons p = new polygons();
        System.out.println("Enter Number of Sides: ");
        p.setIn1(sc.nextDouble());
        System.out.println("Enter Number of Sides: ");
        p.setIn2(sc.nextDouble());
        p.computendisplay();
    }
}