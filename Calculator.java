public class Calculator {

    //instance variables
    private Floor floor;
    private Carpet carpet;

    //Constructor
    public Calculator(Floor floor,Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;
    }

    //Instance methods
    public double getTotalCost(){
        return floor.getArea() * carpet.getCost();
    }

    }






