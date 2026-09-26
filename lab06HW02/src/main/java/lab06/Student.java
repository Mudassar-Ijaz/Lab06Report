package lab06;

public class Student {
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public static void main(String[] args) {
        Student student = new Student(1, "Ali Raza", 3.75);

        System.out.println("ID: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("CGPA: " + student.getCgpa());
    }
}