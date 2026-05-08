import org.junit.Test;
import static org.junit.Assert.*;

public class ComputeGradeTest {

    ComputeGrade cg = new ComputeGrade();

    @Test
    public void testGradeA() {
        assertEquals("A", cg.marks(95));
    }

    @Test
    public void testGradeB() {
        assertEquals("B", cg.marks(80));
    }

    @Test
    public void testGradeC() {
        assertEquals("C", cg.marks(60));
    }

    @Test
    public void testFail() {
        assertEquals("Fail", cg.marks(30));
    }
}