/*Write a class named Rectangle to represent rectangles. The UML diagram for the
class is shown in Figure 4.1 Suppose that all the rectangles are the same colour. Use a
static variable for color
Write a client program to test the class Rectangle. In the client program, create two
Rectangle objects. Assign width 5 and height 50 each of the objects. Assign the color
yellow. Display the properties of both objects and their areas.
 */

public class Rectangle {
    private double width;
    private double height;
    private static String color;

    public void setWidth(double width) {
        this.width = width;
    }
    public double getWidth() {
        return width;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }

    public static void setColor(String newColor) {
        color = newColor;
    }
    public static String getColor() {
        return color;
    }
    public  Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double RectArea (){
        return width* height;
    }
    public double Perimeter (){
        return 2*(width* height);
    }
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle( 5, 50);
        Rectangle r2 = new Rectangle(10, 50);
        Rectangle.setColor("Yellow");

        System.out.println("**********************************************");
        System.out.println("The data of first rectangle is : ");
        System.out.println("Width of a rectangle is : "+ r1.getWidth());
        System.out.println("Height of a rectangle is : "+ r1.getHeight());
        System.out.println("Area of rectangle is : " + r1.RectArea());
        System.out.println("Perimeter of rectangle is : " + r1.Perimeter());
        System.out.println("Rectangle color "+ Rectangle.getColor());

        System.out.println("**********************************************");
        System.out.println("The data of second rectangle is: ");
        System.out.println("Width of a rectangle is : "+ r2.getWidth());
        System.out.println("Height of a rectangle is : "+ r2.getHeight());
        System.out.println("Area of rectangle is : " + r2.RectArea());
        System.out.println("Perimeter of rectangle is : " + r2.Perimeter());
        System.out.println("Rectangle color : "+ Rectangle.getColor());
    }
}
