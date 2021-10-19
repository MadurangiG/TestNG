package testng.annotations;

import org.testng.annotations.*;

public class TestNGBeforeAfterClasses {
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

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }
}
