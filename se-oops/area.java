import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Square
        System.out.print("Enter the side of the square: ");
        double side = scanner.nextDouble();
        double squareArea = side * side;
        System.out.println("Area of the square: " + squareArea);

        // Circle
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double circleArea = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + circleArea);

        // Triangle
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        double triangleArea = 0.5 * base * height;
        System.out.println("Area of the triangle: " + triangleArea);

        // Rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        double rectangleArea = length * width;
        System.out.println("Area of the rectangle: " + rectangleArea);

        scanner.close();
    }
}
