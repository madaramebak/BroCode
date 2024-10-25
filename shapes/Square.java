package shapes;

public class Square implements Shape{
    private  double side;

    public Square(double side){
        this.side = side;
    }

    public double perimeter(){
        return side + side + side + side;
    }

    public double area(){
        return side * side;
    }

}
