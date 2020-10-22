import org.junit.*;
import static org.junit.Assert.*;

public class StudentsTest {

    private Student caleb;
    //creates an object to be able to run tests against without
    // having to create this object in every test!
    @Before
    public void setUp(){
        caleb = new Student(1l, "Caleb");
    }

    @Test
    public void testIfStudentClassExists() throws ClassNotFoundException {
        Class.forName("Student");
    }

    @Test
    public void testCreateStudentInstance() {
        Student norbert = null;
        assertNotNull(caleb);
        assertNull(norbert);
    }

    @Test
    public void testStudentFields() {
        assertEquals("Caleb", caleb.getName());
        assertEquals(1l, caleb.getId());
        assertNotEquals(2l, caleb.getId());
    }

    @Test
    public void testAddGrade() {
        caleb.addGrade(86);
        assertEquals(86, (int) caleb.getGrades().get(0));
    }

    @Test
    public void testGetGradeAverage() {
        caleb.addGrade(86);
        caleb.addGrade(89);
        assertEquals(87.5, caleb.getGradeAverage(),0);
        assertNotEquals(89, caleb.getGradeAverage(), 0);
    }
}
