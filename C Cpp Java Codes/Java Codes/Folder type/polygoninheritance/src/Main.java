import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        inhpol ip = new inhpol();
        inhvtd iv = new inhvtd();
        int choice = 0;

        System.out.println("\t\t\t (1) POLYGONS");
        System.out.println("\t\t\t (2) VELOCITY");
        System.out.println("\t\t\t (3) TIME");
        System.out.println("\t\t\t (4) DISTANCE");
        System.out.print("Enter your choice: ");
        choice = (sc.nextInt());
        /////POLYGONS
        if (choice == 1) {
            System.out.println("Enter Number of Sides: ");
            ip.setIn1(sc.nextDouble());
            System.out.println("Enter Number of Sides: ");
            ip.setIn2(sc.nextDouble());
            ip.computendisplay();
        }
        /////VELOCITY
        else if (choice == 2) {
            System.out.print("Enter Distance: ");
            iv.setIn1(sc.nextDouble());
            System.out.print("Enter Time: ");
            iv.setIn2(sc.nextDouble());
            iv.compute_vel();
            iv.display_vel();
        }
        /////TIME
        else if (choice == 3) {
            System.out.print("Enter Distance: ");
            iv.setIn1(sc.nextDouble());
            System.out.print("Enter Velocity: ");
            iv.setIn2(sc.nextDouble());
            iv.compute_time();
            iv.display_time();
        } else if (choice == 4) {
            System.out.print("Enter Velocity: ");
            iv.setIn1(sc.nextDouble());
            System.out.print("Enter Time: ");
            iv.setIn2(sc.nextDouble());
            iv.compute_dis();
            iv.display_dis();
        } else {
            System.out.print("INVALID CHOICE OF NUMBER! PLEASE ENTER YOUR CHOICE.");
        }
    }
}