package Exercicios7;

public class Rectangle {

    public double Width = 0.0;
    public double Height = 0.0;

    public double area() {

        return Width * Height;
    }

    public double Perimeter() {

        return (Width * 2) + (Height * 2);
    }

    public double Diagonal() {
        double hip = Math.sqrt(Math.pow(Width, 2) + Math.pow(Height, 2));
        return hip;
    }
}
