package week2_homework_tasks2;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber() {
        this.real = 0.0;
        this.imaginary = 0.0;
    }

    public double getMagnitude(){
        return Math.sqrt(Math.pow(real, 2) + Math.pow(imaginary, 2));
    }

    public ComplexNumber add(ComplexNumber other){
        return new ComplexNumber(real + other.real, imaginary + other.imaginary);
    }

    public ComplexNumber subtract(ComplexNumber other){
        return new ComplexNumber(real - other.real, imaginary - other.imaginary);
    }

   public static ComplexNumber add(ComplexNumber a, ComplexNumber b){
        return  new ComplexNumber(a.real + b.real, a.imaginary + b.imaginary);
    }

    public static ComplexNumber subtract(ComplexNumber a, ComplexNumber b){
        return  new ComplexNumber(a.real - b.real, a.imaginary - b.imaginary);
    }

    @Override
    public String toString() {
        return String.format("%f + %f", real, imaginary);
    }
}
