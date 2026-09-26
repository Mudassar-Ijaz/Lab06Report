package lab06;

import java.util.ArrayList;
import java.util.List;

public class StdcollectionImp implements StudentCollection {
    private List<Student> students;

    public StdcollectionImp() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(int id) {
        students.removeIf(s -> s.getId() == id);
    }

    public Student findStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    public int getSize() {
        return students.size();
    }

    public boolean isEmpty() {
        return students.isEmpty();
    }
}