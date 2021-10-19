package simple.calculator;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ArithmaticOperatorTest {

    ArithmaticOperator calc;

    @BeforeMethod
    public void setUp() {
        calc = new ArithmaticOperator();
    }

//    @Test
//    public void testSum() {
//        Assert.assertEquals(calc.sum(10,25),35,"Fail to calculate sum");
//        Assert.assertEquals(calc.sum(-100,-200),-300,"Failed to calculate");
//        Assert.assertEquals(calc.sum(-1,1),0);
//        Assert.assertEquals(calc.sum(0,-1),-1,"Failed to calculate");
//    }
//}

//if want to give multiple inputs, can create multiple lines with hardcoded values
// OR can use @DataProvider annotation(data driven testing)
// Create random dataset


    @Test(dataProvider = "getData")
   public void testSum(int input1,int input2, int expected, String message) {
        Assert.assertEquals(calc.sum(input1, input2), expected, message);
    }

    @DataProvider
    public Object[] getData(){
        return new Object[][]{
                {100,200,300,"Calculation Error"},
                {-100,-200,-300,"Calculation Error"},
                {-1,1,0,"Calculation Error"},
                {0,-1,-1,"Calculation Error"}
        };
    }
}