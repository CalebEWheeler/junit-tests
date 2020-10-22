import org.junit.*;
import static org.junit.Assert.*;

public class StudentsTest {

    @Test
    public void testIfStudentIsInitialized() throws ClassNotFoundException {
        Class.forName("Student");
    }
}
