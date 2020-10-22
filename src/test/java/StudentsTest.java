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

}
