package shapes;

public class Triangle implements Shape{
    private double base;
    private double height; 
    private double side1;
    private double side2;

    public Triangle(double base, double height, double side1, double side2){
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    public double area (){
        return (0.5)*(base)*(height);
    }

    public double perimeter (){
        return base + side1 + side2;
    }
}