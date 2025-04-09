package Bai3_1;

public class MyComplex {
    private double real = 0.0;
    private  double imag =0.0;
    public MyComplex(double real, double imag){
        this.imag = imag;
        this.real = real;

    }
    public double getReal(){
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }
    public void setValue(double real,double imag){
        this.setReal(real);
        this.setImag(imag);

    }
    public String toString(){
        return "real + imagi="+real+"+"+imag+"i";
    }
    public boolean isReal(){
        if (this.imag == 0){
            return true;
        }else{
            return false;
        }
    }
    public boolean isImaginary(){
        if (this.real == 0){
            return true;
        }else{
            return false;
        }
    }
    public boolean equals(double real,double imag){
        if (this.real == real && this.imag == imag){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean equals(MyComplex another){
        if (this.real == another.getReal() && this.imag == another.getImag()){
            return true;
        }else{
            return false;
        }

    }
    public double magniture(){
        double x =this.real;
        double y =this.imag;
        return Math.sqrt(x*x + y*y);
    }
    public MyComplex add(MyComplex right){
        this.real += right.getReal();
        this.imag += right.getImag();
        return this;

    }
    public MyComplex addNew(MyComplex right){
        return new MyComplex(this.real+right.getReal(),this.imag+right.getImag());
    }
    public double argument(){
        return Math.atan2(this.imag,this.real);
    }
    public MyComplex subtract(MyComplex right){
        this.real -= right.getReal();
        this.imag -= right.getImag();
        return this;
    }
    public MyComplex subtractNew(MyComplex right){
        return new MyComplex(this.real - right.getReal(),this.imag-right.getImag());
    }
    public MyComplex multiply(MyComplex right){
        double a =this.real;
        double b =this.imag;
        double c =right.getReal();
        double d = right.getImag();
        this.real = a*c-b*d;
        this.imag = a*d+b*c;
        return this;

    }
    public MyComplex divide(MyComplex right){
        double a =this.real;
        double b =this.imag;
        double c =right.getReal();
        double d =right.getImag();
        this.real = (a*c +b*d)/(c*c+d*d);
        this.imag = (b*c-a*d)/(c*c+d*d);
        return this;
    }
    public MyComplex conjugate(){
        this.imag *= -1;
        return this;
    }

}
