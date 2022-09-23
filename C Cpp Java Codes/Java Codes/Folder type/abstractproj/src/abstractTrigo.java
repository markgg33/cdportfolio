


public abstract class abstractTrigo {
    private double adj, opp, hyp;
    private double sine, cos, tan;

    public void setAdj(double value){
        adj = value;
    }
    public double getAdj(){

        return adj;
    }
    public void setOpp(double value){

        opp = value;
    }
    public void setHyp(double value) {

        hyp = value;
    }
    public double getHyp(){

        return hyp;
    }
    public double getOpp(){

        return opp;
    }
    public void setSine(double value){

        sine = value;
    }
    public double getSine(){

        return sine;
    }
    public void setCos(double value){

        cos = value;
    }
    public double getCos(){

        return cos;
    }
    public void setTan(double value){

        tan = value;
    }
    public double getTan(){

        return tan;
    }
    public abstract void display();
    public abstract void compute();
}
