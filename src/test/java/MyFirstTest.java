import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstTest {
    @Test
    public void test(){
        boolean someCondition = true;
        Assert.assertTrue( someCondition );
    }
}
