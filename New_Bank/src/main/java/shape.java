import java.util.Scanner;
public class shape {
    int rectangale;
    int triangle;
    int circle;
    int length;
    int width;
    int radius;
    int a;
    int b;
    int c;
    public shape(int r) {
        radius = r;
    }
    public shape(int l, int w) {
        length = l;
        width = w;
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
        return 2 * ((double) l + w);
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
        logger.log(s);
        return (Math.sqrt(s * (s - a) * (s - c) * (s - b)));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        logger.log("Enter the Shape:");
        String name = sc.nextLine();
        switch (name) {
            case "circle":
                logger.log("Enter the radius :");
                int radius = sc.nextInt();
                shape circle = new shape(radius);
                logger.log("Perimeter of Circle :" + circle.perimeter(radius));
                logger.log("Area of Circle :" + circle.area(radius));
                break;
            case "rectangle":
                logger.log("Enter the length and width :");
                int length = sc.nextInt();
                int width = sc.nextInt();
                shape rectangle = new shape(length, width);
                logger.log("Perimeter of rectangle :" + rectangle.perimeter(length, width));
                logger.log("Area of rectangle :" + rectangle.area(length, width));
                break;
            case "triangle":
                System.out.println("Enter the three sides of the traiangle:");
                int s1 = sc.nextInt();
                int s2 = sc.nextInt();
                int base = sc.nextInt();
                shape triangle = new shape(s1, s2, base);
                logger.log("Perimeter of Triangle :" + triangle.perimeter(s1, s2, base));
                logger.log("Area of Triangle :" + triangle.area(s1, s2, base));
                break;
            default:
                logger.log("Enter the valid shape :");
        }
    }
}


