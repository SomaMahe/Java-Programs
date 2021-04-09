public class Floor{

    //instance variables
    double length;
    double width;

    //Constructor
    public Floor(double length,double width){
        if (length < 0 ) this.length =0;
        else this.length = length;
        if (width < 0) this.width =0;
        else this.width = width;
    }

    //instance methods
    double getArea(){

        return this.width * this.length;
    }
}
