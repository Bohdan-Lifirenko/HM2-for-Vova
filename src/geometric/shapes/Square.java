package hm;

import java.util.Scanner;

public class Square extends ShapeImp {
    public static final double NUMBER_OF_SIDE = 4;
    private double side;

    public Square(double side) {
        this.side = side;
        setArea(calculateArea());
        setPerimeter(calculatePerimeter());
    }

    public Square() {
        this.side = side;
        setArea(calculateArea());
        setPerimeter(calculatePerimeter());
    }

    private double getSideFormUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side of the square: ");
        return scanner.nextDouble();
    }

    public double getSide() {
        return side;
    }

    @Override
    double calculateArea() {
        return Math.pow(side, 2);
    }

    @Override
    double calculatePerimeter() {
        return NUMBER_OF_SIDE * side;
    }
}
