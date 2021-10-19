package groups;

import org.testng.annotations.Test;

public class GroupTest2 {
    @Test(groups = {"reg"})
    public void testNG2_1() {
        System.out.println("GT_2_1");
    }

    @Test(groups = {"smoke"})
    public void testNG2_2() {
        System.out.println("GT_2_2");
    }

    @Test(groups = {"smoke","reg"})
    public void testNG2_3() {
        System.out.println("GT_2_3");
    }
}
