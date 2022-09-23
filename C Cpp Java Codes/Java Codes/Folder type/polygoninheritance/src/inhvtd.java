public class inhvtd extends inhpol {

    private double velocity, distance, time;
    public void compute_vel(){
        velocity = super.getIn1() / super.getIn2();
    }
    public void compute_time(){
        time = super.getIn1() / super.getIn2();
    }
    public void compute_dis(){
        velocity = super.getIn1() * super.getIn2();
    }
    public void display_vel(){
        System.out.println("\n VELOCITY: " +velocity);
    }
    public void display_time(){
        System.out.println("\n TIME: " +time);
    }
    public void display_dis(){
        System.out.println("\n DISTANCE: " +distance);
    }
}
