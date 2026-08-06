
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManagement management = new StudentManagement();

        System.out.println("==========Student-Management==========");

        int choice;

        do {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {

                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    Student existingStudent = management.searchStudent(id);

                    if (existingStudent != null) {
                      System.out.println("Student ID already exists.");
                      break;
                    }

                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter age: ");
                    int age = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter course: ");
                    String course = sc.nextLine();

                    System.out.print("Enter marks: ");
                    double marks = sc.nextDouble();

                    Student student = new Student(id, name, age, course, marks);

                    management.addStudent(student);

                }

                case 2 -> {
                    management.viewStudents();
                }

                case 3 -> {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    Student student = management.searchStudent(id);

                    if (student == null) {
                        System.out.println("Student not found");

                    } else {
                        System.out.println(student);
                    }
                }

                case 4 -> {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    Student student = management.searchStudent(id);

                    if (student == null) {
                        System.out.println("Student not found");
                        break;
                    }
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter age: ");
                    int age = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter course: ");
                    String course = sc.nextLine();

                    System.out.print("Enter marks: ");
                    double marks = sc.nextDouble();

                    management.updateStudent(id, name, age, course, marks);
                }

                case 5 -> {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    management.deleteStudent(id);
                }

                case 6 -> {
                    System.out.println("See you again!");
                }

                default ->
                    System.out.println("Wrong choice");
            }

        } while (choice != 6);

    }
}
