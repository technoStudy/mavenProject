import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTestNgTest {
    @Test
    public void test(){
        boolean someCondition = true;
        Assert.assertTrue( someCondition );

    }
}
