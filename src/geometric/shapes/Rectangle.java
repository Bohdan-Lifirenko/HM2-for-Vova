package hm;

import java.util.Scanner;

public class Rectangle extends ShapeImp {
    private double leftSide;
    private double bottomSide;
    private double rightSide;
    private double upperSide;

    public Rectangle(double leftSide, double bottomSide) {
        this.leftSide = leftSide;
        this.bottomSide = bottomSide;
        rightSide = leftSide;
        upperSide = bottomSide;
        setArea(calculateArea());
        setPerimeter(calculatePerimeter());
    }

    public Rectangle() {
        this.leftSide = getLeftSideFormUser();
        this.bottomSide = bottomSide;
        rightSide = leftSide;
        upperSide = bottomSide;
        setArea(calculateArea());
        setPerimeter(calculatePerimeter());
    }

    private double getLeftSideFormUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter larger side of the rectangle: ");
        return scanner.nextDouble();
    }

    private double getBottomSideFormUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter lesser side of the rectangle: ");
        return scanner.nextDouble();
    }

    @Override
    double calculateArea() {
        return leftSide * bottomSide;
    }

    @Override
    double calculatePerimeter() {
        return bottomSide + bottomSide + rightSide + upperSide;
    }
}
