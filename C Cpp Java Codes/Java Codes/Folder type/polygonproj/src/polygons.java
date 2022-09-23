public class polygons {
    private double in1, in2, output;

    public double getIn1() {
        return in1;
    }

    public void setIn1(double in1) {
        this.in1 = in1;
    }

    public double getIn2() {
        return in2;
    }

    public void setIn2(double in2) {
        this.in2 = in2;
    }

    public double getOutput() {
        return output;
    }

    public void setOutput(double output) {
        this.output = output;
    }
    // FOR POLYGON COMPUTATION
    public void computendisplay(){
        output = in1 + in2;
        if(output == 3){
            System.out.print("The Result is Triangle");
        }
        else if(output == 4){
            System.out.print("The Result is Quadrilateral");
        }
        else if (output == 5){
            System.out.print("The Result is Pentagon");
        }
        else if (output == 6) {
            System.out.print("The Result is Hexagon");
        }
        else if (output == 7) {
            System.out.print("The Result is Heptagon");
        }
        else if (output == 8) {
            System.out.print("The Result is Octagon");
        }
        else if (output == 9) {
            System.out.print("The Result is Nonagon");
        }
        else if (output == 10) {
            System.out.print("The Result is Decagon");
        }
        else if (output == 11) {
            System.out.print("The Result is Hendecagon");
        }
        else if (output == 12) {
            System.out.print("The Result is Dodecagon");
        }
        else if (output == 13) {
            System.out.print("The Result is Tridecagon");
        }
        else if (output == 14) {
            System.out.print("The Result is Tetradeagon");
        }
        else if (output == 15) {
            System.out.print("The Result is Pentadecagon");
        }
        else if (output == 16) {
            System.out.print("The Result is Hexdecagon");
        }
        else if (output == 17) {
            System.out.print("The Result is Heptagon");
        }
        else if (output == 18) {
            System.out.print("The Result is Octdecagon");
        }
        else if (output == 19) {
            System.out.print("The Result is Enneadecagon");
        }
        else if (output == 20) {
            System.out.print("The Result is Icosagon");
        }
        else{
            System.out.print("The Result is Invalid");
        }
    }
}
