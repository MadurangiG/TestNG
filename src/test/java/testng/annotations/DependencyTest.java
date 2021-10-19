package testng.annotations;

import org.testng.annotations.Test;

public class DependencyTest {

    @Test
    public void testLogin() {
        System.out.println("Login");
    }

    @Test(dependsOnMethods = {"testLogin"})
    public void testCreate() {
        System.out.println("Create");
    }

    @Test(dependsOnMethods = {"testLogin","testCreate"})
    public void testEdit() {
        System.out.println("Edit");
    }

    @Test(dependsOnMethods = {"testLogin","testEdit"})
    public void testDelete() {
        System.out.println("Delete");
    }

    @Test(dependsOnMethods = {"testDelete"})
    public void testLogout() {
        System.out.println("Logout");
    }

}
