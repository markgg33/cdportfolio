public class trigoFunc {

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

            hyp = value;
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
        public void compute(){
            sine = opp / hyp;
            cos = adj / hyp;
            tan = opp / adj;
        }
        public void display(){
            System.out.print("\nSINE: " +sine);
            System.out.print("\nCOSINE: " +cos);
            System.out.print("\nTANGENT: " +tan);

        }
    }

