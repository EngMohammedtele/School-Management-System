package services;
import entities.Student;
import interfaces.Manageable;
import interfaces.Searchable;
import utils.HelperUtils;
import java.util.ArrayList;
import java.util.List;

public class StudentService implements Manageable<Student>, Searchable<Student> {
    private List<Student> students = new ArrayList<>();
    public Student addStudent(
            String firstName,
            String lastName,
            String phone) {



        String id = HelperUtils.generateId("STU");
    }
}