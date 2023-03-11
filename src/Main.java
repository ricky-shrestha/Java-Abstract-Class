import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Area area = new Area();

        //Rectangle
        System.out.println("Enter the length of the Rectangle:");
        double length = scanner.nextDouble();
        System.out.println("Enter the breadth of the Rectangle:");
        double breadth = scanner.nextDouble();

        double rectangleArea = area.RectangleArea(length, breadth);
        System.out.println("The area of Rectangle with length of " + length + " and breadth of " + breadth + " is " + rectangleArea);

        //Square
        System.out.println("Enter the side of the Square:");
        double side = scanner.nextDouble();

        double squareArea = area.SquareArea(side);
        System.out.println("The area of the square with side of " + side + " is " + squareArea);

        //Circle
        System.out.println("Enter the radius of the Circle:");
        double radius = scanner.nextDouble();

        double circleArea = area.CircleArea(radius);
        System.out.println("The area of the circle whose radius is " + radius + " is " + circleArea);

        scanner.close();
    }
}