package testng.annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgTest01 {

    @Test
    public void test1(){
        System.out.println("Test 01");
    }

    @BeforeMethod //run before each test method
    public void beforMethod(){
        System.out.println("Before method");
    }

    @AfterMethod //run after each test method
    public void afterMethod(){
        System.out.println("After method");
    }
}
