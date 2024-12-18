package pl_java.abstract_class.exercise_3.shapes;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius){
        this.radius= radius;
    }
    @Override
    public double calculateArea(){
       return Math.PI*radius*radius;

    }
    @Override
    public double calculateCircumference(){
        return 2*Math.PI*radius;

    }

    double getRadius(){
        return this.radius;
    }

    void setRadius(double radius){
        this.radius = radius;
    }
    
}
