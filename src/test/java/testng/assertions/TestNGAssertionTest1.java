package testng.assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertionTest1 {
    @Test
    public void testAssertEquals() {
        String actualValue = "University of Moratuwa";
        Assert.assertEquals(actualValue,"University of Moratuwa","Faild: Actual not equals to the Expected");
    }
    //If match both actual and expected test will pass

    @Test
    public void testAssertNotEquals() {
        String actualValue = "University of Maaoratuwa";
        Assert.assertNotEquals(actualValue,"University of Moratuwa","Faild: Actual not equals to the Expected");
    }
    //If not match actual and expected test will pass


    @Test
    public void testAssertTrue() {
        boolean actualResult = true;
        Assert.assertTrue(actualResult,"failed: Boolean mismatch");
    }

    @Test
    public void testAssertFalse() {
        boolean actualResult = false;
        Assert.assertFalse(actualResult,"Failed: boolean mismatch");
    }
}
