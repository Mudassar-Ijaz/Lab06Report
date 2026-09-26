package lab06;

public interface StudentCollection {
    void addStudent(Student student);
    void removeStudent(int id);
    Student findStudent(int id);
    int getSize();
    boolean isEmpty();
}