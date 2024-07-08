package Practice;

public class ShapeArea {

//    Write a Java program and create a class called ShapeArea with methods to calculate the area of different shapes such as rectangle,
//    circle, and triangle. Implement method overloading for calculating the area of a rectangle with different
//    parameters (length and width, or just length) and for calculating the area of a circle with different
//    parameters (radius or diameter).

    public double rectangleArea(double length, double width) {
        return length * width;
    }

    public double rectangleArea(double side) {
        return side * side;
    }

    public double circleArea(double radius, boolean isRadius) {
        if (isRadius) {
            return Math.PI * radius * radius;
        } else {
            return circleArea(radius / 2, true);
        }
    }

    public double circleArea(double diameter) {
        return Math.PI * (diameter / 2) * (diameter / 2);
    }

    public double triangleArea(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * height;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        ShapeArea shapeArea = new ShapeArea();

        System.out.println("Area of rectangle (length=5, width=3): " + shapeArea.rectangleArea(5, 3));

        System.out.println("Area of square (side=4): " + shapeArea.rectangleArea(4));

        System.out.println("Area of circle (radius=3): " + shapeArea.circleArea(3, true));

        System.out.println("Area of circle (diameter=6): " + shapeArea.circleArea(6));

        System.out.println("Area of triangle (base=5, height=4): " + shapeArea.triangleArea(5, 4, true));
    }


}
