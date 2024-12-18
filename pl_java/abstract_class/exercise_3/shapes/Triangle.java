package pl_java.abstract_class.exercise_3.shapes;

public class Triangle extends Shape{

    private double height;
    private double base;

    public Triangle(double height, double base){
        this.height = height;
        this.base = base;
    }
    @Override
    public double calculateArea(){
        return 0.5*base*height;

    }
    @Override
    public double calculateCircumference(){
        double c = Math.sqrt(height*height+base*base);
        return base+height+c;
    }

    double getHeight(){
        return this.height;
    }

    double getBase(){
        return this.base;
    }

    void setheight(double height){
        this.height = height;
    }
    void setBase(double base){
        this.base = base;
    }
    
}
