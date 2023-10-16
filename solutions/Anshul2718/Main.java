package solutions.Anshul2718;

import java.util.*;

public class Main {

    static void printArea(Shape shape){
        System.out.println(shape.compute_area());
    }
    
    public static void main(String[] args) {
        System.out.println("Enter the shape - Rectangle or Triangle");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println("Enter the height of "+input);
        double h = sc.nextDouble();

        System.out.println("Enter the width of "+input);
        double w = sc.nextDouble();

        Shape shape;
        if(input == "Triangle"){
            shape = new Triangle(h,w);
        }else {
            shape = new Rectangle(h,w);
        }
        printArea(shape);

    }
}
