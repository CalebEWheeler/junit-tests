import org.junit.*;
import static org.junit.Assert.*;

public class StudentsTest {

    @Test
    public void testIfStudentClassExists() throws ClassNotFoundException {
        Class.forName("Student");
    }

    @Test
    public void testCreateStudentInstance() {
        Student caleb = new Student(1l, "Caleb");
        Student norbert = null;
        assertNotNull(caleb);
        assertNull(norbert);
    }

    @Test
    public void testStudentFields() {
        Student caleb = new Student(1l, "Caleb");
        assertEquals("Caleb", caleb.getName());
        assertEquals(1l, caleb.getId());
        assertNotEquals(2l, caleb.getId());
    }

    @Test
    public void testAddGrade() {
        Student caleb = new Student(1l, "Caleb");
        caleb.addGrade(86);
        assertEquals(86, (int) caleb.getGrades().get(0));
    }

}
