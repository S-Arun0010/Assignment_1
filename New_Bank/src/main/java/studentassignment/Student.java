package studentassignment;
import java.util.Scanner;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Student {
	
    String name;
    char gradelevel;
    double gpa;   
    static PrintStream print = new PrintStream (new FileOutputStream(FileDescriptor.out));
    
    Student(String name, char grade, double gpa) {
        this.name = name;
        this.gradelevel = grade;
        this.gpa = gpa;
    }
    
    public void updategpa(double newgpa) {
       gpa = newgpa;
    	
    }
    
    public String details() {
        return (name + " has a " + gpa + " GPA");
    }
    
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);        
        print.println("Enter the Student Name:");
        String name = sc.nextLine();
        print.println("Enter the Student Grade:");
        char grade = sc.next().charAt(0);
        print.println("Enter the Student GPA:");
        double gpa = sc.nextDouble(); 
        
        Student student = new Student(name, grade, gpa);
        
        print.println("Enter the new GPA :");
        double newgpa = sc.nextDouble();
        student.updategpa(newgpa);
        String s = student.details();
        print.println(s);  
        
        }
    }

