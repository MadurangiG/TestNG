package testng.annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgMultipleTest {
    @Test
    public void test1(){
        System.out.println("Test 01");
    }

    @Test
    public void test2(){
        System.out.println("Test 02");
    }

    @BeforeMethod
    public void beforMethod(){
        System.out.println("Before method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After method");
    }

    //output, before method > test01> after method >before method> test 02> after method
}
