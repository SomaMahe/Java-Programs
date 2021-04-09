//Program to add and subtract complex numbers

public class ComplexNumber {
    //instance variables
    double real;
    double imaginary;

    // constructor
    public ComplexNumber(double real, double imaginary)
    {
        this .real = real;
        this. imaginary =imaginary;

    }
    // Instance methods - getReal(), getImaginary() to fetch values

    public double getReal(){
        return real;
    }

    public  double getImaginary(){
        return imaginary;
    }
   // Instance methods to add complex numbers

    public void add(double real, double imaginary){

        this.real += real;
        this.imaginary += imaginary;
    }

    public void add(ComplexNumber complexNumber){
        this.real+= complexNumber.real;
        this.imaginary += complexNumber.imaginary;

    }

    // Instance methods to subtract complex numbers
    public void Subtract(double real, double imaginary){
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void Subtract(ComplexNumber complexNumber){
        this.real-= complexNumber.real;
        this.imaginary -= complexNumber.imaginary;


    }

}

