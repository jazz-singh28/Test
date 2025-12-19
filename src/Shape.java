/**
 * Shape.java
 *
 * Name: Jaskirat Singh
 * Period: 2
 * Last Revision Date: 12/17/25
 * Description: Interface for shapes that can be compared by area
 */

public interface Shape extends Comparable<Shape> {

    public double getArea();

    public double getPerimeter();

}
