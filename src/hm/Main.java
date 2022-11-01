package hm;

import geometric.shapes.Circle;
import geometric.shapes.Rectangle;
import geometric.shapes.Square;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Keep a type of figure:");
        ShapeEnum[] shapes = ShapeEnum.values();
        for (ShapeEnum shape:
             shapes) {
            System.out.println(shape.ordinal() + "." + shape);
        }

        Scanner scanner = new Scanner(System.in);
        int figureType = scanner.nextInt();
        switch (ShapeEnum.values()[figureType]) {
            case CIRCLE -> new Circle().printInfo();
            case SQUARE -> new Square().printInfo();
            case RECTANGLE -> new Rectangle().printInfo();
            default -> System.exit(0);
        }
    }
}
