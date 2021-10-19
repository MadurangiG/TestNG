package groups;

import org.testng.annotations.Test;

public class GroupTest1 {
    @Test(groups = {"smoke","reg"})
    public void testNG1_1() {
        System.out.println("GT_1_1");
    }

    @Test(groups = {"reg"})
    public void testNG1_2() {
        System.out.println("GT_1_2");
    }

    @Test
    public void testNG1_3() {
        System.out.println("GT_1_3");
    }

    @Test(groups = {"smoke"})
    public void testNG1_4() {
        System.out.println("GT_1_4");
    }

}
