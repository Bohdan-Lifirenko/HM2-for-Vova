package geometric.shapes;

import hm.ShapeEnum;

import java.util.Scanner;

public class Square extends ShapeImp {

    public static final String NAME = "Square";
    public static final double NUMBER_OF_SIDE = 4;
    private double side;

    public Square(double side) {
        this.side = side;
        setArea(calculateArea());
        setPerimeter(calculatePerimeter());
    }

    public Square() {
        this.side = getSideFormUser();
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
    public double calculateArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double calculatePerimeter() {
        return NUMBER_OF_SIDE * side;
    }

    public String toString() {
        return NAME;
    }

    @Override
    public void printInfo() {
        System.out.println("Shape type: " + NAME);
        System.out.println("Side length: " + side);
        System.out.println("Area of " + NAME + ":" + this.getArea());
        System.out.println("Perimeter of " + NAME + ":" + this.getPerimeter());
    }
}
