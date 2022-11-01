package geometric.shapes;

import java.util.Scanner;

public class Circle extends ShapeImp {

    public static final String NAME = "Circle";
    private double radius;
    private double diameter;

    public Circle(double radius) {
        this.radius = radius;
        diameter = calculateDiameter();
        setArea(calculateArea());
        setPerimeter(calculatePerimeter());
    }

    public Circle() {
        this.radius = getRadiusFromUser();
        diameter = calculateDiameter();
        setArea(calculateArea());
        setPerimeter(calculatePerimeter());
    }

    private double getRadiusFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        return scanner.nextDouble();
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return diameter;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return diameter * Math.PI;
    }

    private double calculateDiameter() {
        return 2 * radius;
    }

    @Override
    public String toString() {
        return NAME;
    }

    @Override
    public void printInfo() {
        System.out.println("Shape type: " + NAME);
        System.out.println("Area of " + NAME + ":" + this.getArea());
        System.out.println("Perimeter of " + NAME + ":" + this.getPerimeter());
    }
}
