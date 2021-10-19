package testng.annotations;

import org.testng.annotations.Test;

public class TestNgTest {
    public static void main(String[] args){
        System.out.println("Hello world");
    }

    @Test
    public void print(){
        System.out.println("Hello print");
    }
}
