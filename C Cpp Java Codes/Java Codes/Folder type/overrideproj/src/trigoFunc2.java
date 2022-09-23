

public class trigoFunc2 extends trigoFunc {

    private double cot, sec, cosec;


    @Override
    public void compute(){
        cot = (super.getAdj() / super.getOpp());
        sec = (super.getHyp() / super.getAdj());
        cosec = (super.getHyp() / super.getOpp());
    }

    @Override
    public void display(){
        System.out.print("\nCOTANGENT: " +cot);
        System.out.print("\nSECANT: " +sec);
        System.out.print("\nCOSECANT: " +cosec);

    }


}
