import java.util.Scanner;

public class Student {
    String name;
    char gradelevel;
    double gp;

    student(String n, char g, double gpa) {
        name = n;
        gradelevel = g;
        gp = gpa;
    }

    public void updategpa(double gpa) {
        gp = gpa;
    }

    public String details() {
        return (name + " has a " + Double.toString(gp) + " GPA");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student("Arun", 'A', 8.73);
        logger.log("Enter the GPA :");
        double gpa = sc.nextDouble();
        student.updategpa(gpa);
        String s = student.details();
        logger.log(s);
    }
}


