import java.util.Scanner;



public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        trigoFunc tf = new trigoFunc();
        trigoFunc2 tf2 = new trigoFunc2();

        int choice = 0;

        System.out.print("[1] Compute for Sine, Cosine, Tangent \n[2] Compute for Cotangent, Secant, Cosecant");
        System.out.print("\n Enter your Choice: ");
        choice = sc.nextInt();

        if(choice == 1 ){

            System.out.print("\n Enter Hypotenuse: ");
            tf.setHyp(sc.nextDouble());

            System.out.print("\n Enter Adjacent: ");
            tf.setAdj(sc.nextDouble());

            System.out.print("\n Enter Opposite: ");
            tf.setOpp(sc.nextDouble());

            tf.compute();
            tf.display();
            }

        else if(choice == 2){
            System.out.print("\n Enter Hypotenuse: ");
            tf2.setHyp(sc.nextDouble());

            System.out.print("\n Enter Adjacent: ");
            tf2.setAdj(sc.nextDouble());

            System.out.print("\n Enter Opposite: ");
            tf2.setOpp(sc.nextDouble());

            tf2.compute();
            tf2.display();
        }
        else{
            System.out.print("INVALID CHOICE!");
        }
        }

    }
