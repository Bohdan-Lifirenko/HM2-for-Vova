package hm;

import java.util.Scanner;

public class Circle extends ShapeImp {
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
    double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    double calculatePerimeter() {
        return diameter * Math.PI;
    }

    private double calculateDiameter() {
        return 2 * radius;
    }

}
