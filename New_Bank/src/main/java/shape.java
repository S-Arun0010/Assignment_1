import java.util.Scanner;
import java.lang.Math;
public class shape {
    int rectangale;
    int triangle;
    int circle;
    int length;
    int width;
    int radius;
    int a, b, c;
    public shape(int r) {
        radius = r;
    }
    public shape(int l, int W) {
        length = l;
        width = W;
    }
    public shape(int s1, int s2, int s3) {
        a = s1;
        b = s2;
        c = s3;
    }
    double perimeter(int r) {
        return (2 * 3.14 * r);
    }
    double perimeter(int l, int w) {
        return 2 * (l + w);
    }
    double perimeter(int a, int b, int c) {
        return (a + b + c);
    }
    double area(int r) {
        return (3.14 * r * r);
    }
    double area(int l, int w) {
        return (double) l * b;
    }
    double area(int a, int b, int c) {
        double s = (double) (a + b + c) / 2;
        System.out.println(s);
        return (Math.sqrt(s * (s - a) * (s - c) * (s - b)));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Shape:");
        String Name = sc.nextLine();
        switch (Name) {
            case "circle":
                System.out.println("Enter the radius :");
                int radius = sc.nextInt();
                shape Circle = new shape(radius);
                System.out.println("Perimeter of Circle :" + Circle.perimeter(radius));
                System.out.println("Area of Circle :" + Circle.area(radius));
                break;
            case "rectangle":
                System.out.println("Enter the length and width :");
                int length = sc.nextInt();
                int width = sc.nextInt();
                shape rectangle = new shape(length, width);
                System.out.println("Perimeter of rectangle :" + rectangle.perimeter(length, width));
                System.out.println("Area of rectangle :" + rectangle.area(length, width));
                break;
            case "triangle":
                System.out.println("Enter the three sides of the traiangle:");
                int s1 = sc.nextInt();
                int s2 = sc.nextInt();
                int base = sc.nextInt();
                shape triangle = new shape(s1, s2, base);
                System.out.println("Perimeter of Triangle :" + triangle.perimeter(s1, s2, base));
                System.out.println("Area of Triangle :" + triangle.area(s1, s2, base));
                break;
            default:
                System.out.println("Enter the valid shape :");
        }
    }
}
