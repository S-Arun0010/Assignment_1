import java.util.Scanner;
public class Student {
    String name;
    char gradelevel;
    double gpa;
    student(String n, char g, double gpa) {
        name = n;
        gradelevel = g;
        gpa = gpa;
    }
    public void updategpa(double gpa) {
        gpa = gpa;
    }
    public String details() {
        return (name + " has a " + Double.toString(gpa) + " GPA");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student Student = new student("Arun", 'A', 8.73);
        System.out.println("Enter the GPA :");
        double gpa = sc.nextDouble();
        Student.updategpa(gpa);
        String s = Student.details();
        System.out.println(s);
    }
}


