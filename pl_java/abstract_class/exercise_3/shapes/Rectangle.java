package pl_java.abstract_class.exercise_3.shapes;

public class Rectangle extends Shape {

    private double height;
    private double width;

    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea(){
        return height*width;

    }
    @Override
    public double calculateCircumference(){
        return 2*(height+width);
    }

    double getHeight(){
        return this.height;
    }
    double getWidth(){
        return this.width;
    }

    void setheight(double height){
        this.height = height;
    }

    void setWidth(double width){
        this.width = width;
    }
}
