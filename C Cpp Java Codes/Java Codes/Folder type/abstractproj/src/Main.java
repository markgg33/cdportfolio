import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        abstractTrigo2 at2 = new abstractTrigo2();

        System.out.print("\n Enter Hypotenuse: ");
        at2.setHyp(sc.nextDouble());

        System.out.print("\n Enter Adjacent: ");
        at2.setAdj(sc.nextDouble());

        System.out.print("\n Enter Opposite: ");
        at2.setOpp(sc.nextDouble());

        at2.compute();
        at2.display();
    }
}