package shapeassignment;
import java.util.Scanner;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
public class Shape {
	
	static PrintStream print = new PrintStream(new FileOutputStream(FileDescriptor.out));

	String type;
    int length;
    int width;
    int height;
    int radius;
    
    public Shape(String shape,int radius) {
    	type = shape;
        this.radius = radius;
        
    }
    public Shape(String shape,int length, int width) {
    	type = shape;
        this.length = length;
        this.width = width; 
       
    }
    public Shape(String shape,int side, int base, int height) {
    	type = shape;
    	length = side;
    	width = base;
    	this.height = height;
    }

    double perimeter()
    {
    	if(type.equals("circle"))
    	{
    		return (2 * 3.14 * radius);
    	}
    	else if(type.equals("reactangle"))
    	{
    		return 2 * (length + width);
    	}
    	else
    	{
    		return (length + width + height);
    	}
    }
    
    double area()
    {
    	if(type.equals("circle"))
    	{
    		return (3.14 * radius * radius);
    	}
    	else if(type.equals("reactangle"))
    	{
    		 return length * width;
    	}
    	else
    		return (0.5 * width * height);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        print.println("Enter the Shape:");
        String shape = sc.nextLine();
        
        switch (shape) {
        
            case "circle":
            	print.println("Enter the radius :");
                int radius = sc.nextInt();
                Shape circle = new Shape(shape,radius);
                print.println("Perimeter of Circle :" + circle.perimeter());
                print.println("Area of Circle :" + circle.area());
                break;
                
            case "rectangle":
            	print.println("Enter the length and width :");
                int length = sc.nextInt();
                int width = sc.nextInt();
                Shape rectangle = new Shape(shape,length, width);
                print.println("Perimeter of rectangle :" + rectangle.perimeter());
                print.println("Area of rectangle :" + rectangle.area());
                break;
                
            case "triangle":            	
            	print.println("Enter the three sides of the traiangle:");
                 int  side = sc.nextInt();
                 int  base = sc.nextInt();
                 int  height = sc.nextInt();
                Shape triangle = new Shape(shape,side, base, height);
                print.println("Perimeter of Triangle : " +triangle.perimeter());
                print.println("Area of Triangle :" + triangle.area());
                break;
                
            default:            	
            	print.println("Enter the valid shape :");
            	
        }
    }
}
