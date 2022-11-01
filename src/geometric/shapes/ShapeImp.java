package hm;

public abstract class ShapeImp {
    private double area;
    private double perimeter;


    public double getArea() {
        return area;
    }

    double getPerimeter() {
        return perimeter;
    }

    protected void setArea(double area) {
        this.area = area;
    }

    protected void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();
}
