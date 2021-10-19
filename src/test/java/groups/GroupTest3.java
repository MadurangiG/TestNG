package groups;

import org.testng.annotations.Test;

public class GroupTest3 {
    @Test(groups = {"smoke","reg"})
    public void testNG3_1() {
        System.out.println("GT_3_1");
    }

    @Test
    public void testNG3_2() {
        System.out.println("GT_3_2");
    }

    @Test(groups = {"reg"})
    public void testNG3_3() {
        System.out.println("GT_3_3");
    }

    @Test(groups = {"reg"})
    public void testNG3_4() {
        System.out.println("GT_3_4");
    }

    @Test(groups = {"smoke"})
    public void testNG3_5() {
        System.out.println("GT_3_5");
    }
}
