public class Carpet {

        //instance variable
        double cost;

        //constructor
        public Carpet(double cost){
            if (cost < 0)
                this.cost = 0;
            else
                this.cost = cost;
        }
        //instance method
        public double getCost(){
            return cost;
        }

    }


