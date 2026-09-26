package lab06;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentCollectionTest {

    @Test
    public void testAddStudent() {
        StudentCollection collection = new StdcollectionImp();
        collection.addStudent(new Student(1, "Ali", 3.5));
        assertEquals(1, collection.getSize());
    }

    @Test
    public void testFindStudent() {
        StudentCollection collection = new StdcollectionImp();
        collection.addStudent(new Student(1, "Ali", 3.5));
        Student found = collection.findStudent(1);
        assertNotNull(found);
        assertEquals("Ali", found.getName());
    }

    @Test
    public void testRemoveStudent() {
        StudentCollection collection = new StdcollectionImp();
        collection.addStudent(new Student(1, "Ali", 3.5));
        collection.removeStudent(1);
        assertTrue(collection.isEmpty());
    }

    @Test
    public void testIsEmptyInitially() {
        StudentCollection collection = new StdcollectionImp();
        assertTrue(collection.isEmpty());
    }

    @Test
    public void testGetSize() {
        StudentCollection collection = new StdcollectionImp();
        collection.addStudent(new Student(1, "Ali", 3.5));
        collection.addStudent(new Student(2, "Sara", 3.8));
        assertEquals(2, collection.getSize());
    }
}