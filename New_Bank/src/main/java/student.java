import java.util.Scanner;
public class student {
	String Name;
    char grade_level;
    double GPA;
    student(String N, char g, double gpa) {
        Name = N;
        grade_level = g;
        GPA = gpa;
    }
    public void updategpa(double gpa) {
        GPA = gpa;
    }
    public String details() {
        return (Name + " has a " + Double.toString(GPA) + " GPA");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student Student = new student("Arun", 'A', 8.73);
        System.out.println("Enter the GPA :");
        double gpa = sc.nextDouble();
        Student.updategpa(gpa);
        String S = Student.details();
        System.out.println(S);
    }
}


