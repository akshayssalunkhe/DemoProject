import org.junit.Assert;
import org.junit.Test;

public class DemoClassTest {
    @Test
    public void givenStatesCensusCSVFile_WhenNumberOfRecordsMatches_ShouldReturnTrue() {
        try {
            int numberOfRecord = DemoClass.add(1, 2);
            Assert.assertEquals(3, numberOfRecord);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}