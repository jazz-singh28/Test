/**
 * Rectangle.java
 *
 * Name: Jaskirat Singh
 * Period: 2
 * Last Revision Date: 12/17/25
 * Description: Rectangle class implementing Shape interface
 */

public class Rectangle implements Shape {

    private double height;
    private double width;

    public Rectangle(double tall, double wide) {
        width = wide;
        height = tall;
    }

    @Override
    public int compareTo(Shape o) {
        // TODO Auto-generated method stub
        if(o.getArea() > this.getArea()) {
            return -1;
        }
        else if (o.getArea() == this.getArea()) {
            return 0;
        }
        return 1;
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return width * height;
    }

    @Override
    public double getPerimeter() {
        // TODO Auto-generated method stub
        return (2*height) + (2*width);
    }

    public String toString() {
        String roundheight = String.format("%.2f", height);
        String roundWidth = String.format("%.2f", width);

        String output = "Rectangle - Height: " + roundheight + ", Width: " + roundWidth;
        return output;
    }
}
