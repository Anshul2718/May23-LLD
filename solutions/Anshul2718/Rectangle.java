package solutions.Anshul2718;

public class Rectangle extends Shape{
    Rectangle(double height, double width){
        super(height,width);
    }
    double compute_area(){
        return this.height*this.width;
    }
}