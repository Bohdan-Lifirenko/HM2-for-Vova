package geometric.shapes;

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

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public abstract void printInfo();
}
