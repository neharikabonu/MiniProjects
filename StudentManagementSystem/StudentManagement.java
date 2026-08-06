
import java.util.ArrayList;

public class StudentManagement {

    private ArrayList<Student> students = new ArrayList<>();

    //create student
    public void addStudent(Student student) {
        Student existingStudent = searchStudent(student.getId());

        if (existingStudent != null) {
            System.out.println("Student already exists.");
            return;
        }

        students.add(student);
        System.out.println("Student added successfully");
    }

    //read student
    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    //search student
    public Student searchStudent(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }

        }
        return null;
    }

    //update student
    public void updateStudent(int id, String name, int age, String course, double marks) {

        Student student = searchStudent(id);

        if (student == null) {
            System.out.println("Student not found.");
            return;
        }

        student.setName(name);
        student.setAge(age);
        student.setCourse(course);
        student.setMarks(marks);

        System.out.println("Student updated successfully.");
    }

    //delete student
    public void deleteStudent(int id) {
        Student student = searchStudent(id);

        if (student == null) {
            System.out.println("Student not found");
            return;
        }

        students.remove(student);
        System.out.println("Student deleted successfully");
    }
}
