import java.util.Scanner;

class Student_Detail {
    String Enrollment_No;
    String Name;
    int Semester;
    double CPI;

    Student_Detail(String Enrollment_No, String Name, int Semester, double CPI) {
        this.Enrollment_No = Enrollment_No;
        this.Name = Name;
        this.Semester = Semester;
        this.CPI = CPI;
    }

    void display() {
        System.out.println("Enrollment No: " + Enrollment_No);
        System.out.println("Name: " + Name);
        System.out.println("Semester: " + Semester);
        System.out.println("CPI: " + CPI);
        System.out.println();
    }
}

public class StudentsDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student_Detail[] students = new Student_Detail[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");

            System.out.print("Enrollment No: ");
            String Enrollment_No = scanner.nextLine();

            System.out.print("Name: ");
            String Name = scanner.nextLine();

            System.out.print("Semester: ");
            int Semester = scanner.nextInt();

            System.out.print("CPI: ");
            double CPI = scanner.nextDouble();
            scanner.nextLine();
            students[i] = new Student_Detail(Enrollment_No, Name, Semester, CPI);
        }
        System.out.println("\nStudent Details:");
        for (Student_Detail student : students) {
            student.display();
        }

    }
}
