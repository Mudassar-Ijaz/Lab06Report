package lab06;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Abstraction {
    public static void main(String[] args) {
        List<String> students;

        students = new ArrayList<>();
        students.add("Ali");
        System.out.println("ArrayList implementation: " + students);

        students = new LinkedList<>();
        students.add("Sara");
        System.out.println("LinkedList implementation: " + students);
    }
}