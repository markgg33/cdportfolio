import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        intClass2 ic2= new intClass2();

        System.out.print("\n Enter Length: ");
        ic2.setLength(sc.nextDouble());
        System.out.print("\n Enter Width: ");
        ic2.setWidth(sc.nextDouble());
        System.out.print("\n Enter Height: ");
        ic2.setHeight(sc.nextDouble());
        System.out.print("\n Enter Base: ");
        ic2.setBase(sc.nextDouble());

        ic2.compute();
        ic2.display();
    }
}