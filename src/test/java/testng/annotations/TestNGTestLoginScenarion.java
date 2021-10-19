package testng.annotations;

import org.testng.annotations.Test;

public class TestNGTestLoginScenarion {
    //in here executes multiple test methods.


    @Test
    public void testLogin() {
        System.out.println("Login");
    }

    @Test
    public void testCreate() {
        System.out.println("Create");
    }

    @Test
    public void testEdit() {
        System.out.println("Edit");
    }

    @Test
    public void testDelete() {
        System.out.println("Delete");
    }

    @Test
    public void testLogout() {
        System.out.println("Logout");
    }

    // when execute this from class level the real output was,
    //Create
    //Delete
    //Edit
    //Login
    //Logout(In Ascending order)

    //But if run test methods one by one can get expected output. the mater with the default ordering.Solution is use priority annotation.

}
