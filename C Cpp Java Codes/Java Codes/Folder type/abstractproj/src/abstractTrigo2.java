

public class abstractTrigo2 extends abstractTrigo {

    @Override
    public void compute() {
        super.setSine(super.getOpp() / super.getHyp());
        super.setCos(super.getAdj() / super.getHyp());
        super.setTan(super.getOpp() / super.getAdj());
    }
    @Override
    public void display(){
        System.out.print("\nSINE:" +super.getSine());
        System.out.print("\nCOSINE:" +super.getCos());
        System.out.print("\nTANGENT:" +super.getTan());

    }
}
