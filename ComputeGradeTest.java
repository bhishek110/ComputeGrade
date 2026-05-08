import org.Junit.Test;
import static org.JUnit.Assert.*;

public class ComputeGradeTest {

    public int marks(int mark){
        if(mark >= 90){
            assertEquals("A");
        }elseif(mark>=75 && mark<=89){
            assertEquals("B");
        }elseif(mark >=50 && mark <=74){
            assertEquals("C");
        }else{
            assertEquals("Fail");
        }
    }
}