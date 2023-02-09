package homework_13;

public class Shape {
    /*
    1. Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
     In circle class create a method to calculate the area of circle. Test your code
     */

    int radius;

    Shape(int radius){
        this.radius=radius;
    }

}
class circle extends Shape{

    double total=0;

    circle(int radius){
        super(radius);
        total=(radius*radius)*3.14;

    }
void printRadius(){
    System.out.println("The area of circle with radius "+radius+" is "+total+" square centimeter");
}




}