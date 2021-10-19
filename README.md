#  Test Automation

##  TestNG

src -> test -> java -> testng -> annotations

### Class TestNgTest
Simple test case to print a statement.

### Class TestNgTest01
Basic annotations

* @Test - Identify a test method
* @BeforeMethod - A method which executes before each test case.
* @AfterMethod - A method which executes after each test case.

### Class TestNGBeforeAfterClasses
Introducing @BeforeClass annotation and the @AfterClass annotation.

### Class TestNgMultipleTest

Create multiple test cases in a same class. See behaviour of before method and after method.

### Class TestNGTestLoginScenario
Write 5 test cases to test Login,Create,Edit,Delete and Logout sequentially.
But, execution of test cases happen in different way. It executes in ascending order. 

### Class TestNGTestLoginScenario2
As a solution for the above problem introducing new attribute call "priority" with @Test annotation. 
* priority = 0 has the highest priority
* 0,1,2,3... the priority order
* priority = 0 and the @Test without priority attribute has the same priority.
* if two test cases has the same priority then them executes in ascending order.

### Class DependencyTest
If the testing process is a more critical one, using priority attribute will not be a good practice.Since, we can introduce another attribute call "dependsOnMethods"
with the @Test annotation. We can mention all the prerequisite methods which needs to run before a method with that attribute.This will be a good solution in maintainability point.

If fail execution of previous method, will stop executing rest of the methods.

####  Execute Multiple Test Classes Together

We can select all test classes which need to execute, right click and run.
OR
Create "TestSuit.xml" for that task.

##  Test Grouping
Usually grouping test cases based on,

* Features
* Criticality
* Usage

Example included on "src-> test->java-> groups"
GroupTest1, GroupTest2, GroupTest3 has 12 test cases belongs to Smoke testing, Regression testing or without a test group.

To execute those groups use "TestSuiteGrouping.xml". Tester can change groups and classes as they wish and according to the scenario.

## Basic Assertion Types on TestNG
 Used 04 assertions.
 * AssertEquals(actualValue,expectedValue,message)
 * AssertNotEquals(actualValue,expectedValue,message)
 * AssertTrue(actualValue,message)
 * AssertFalse(actualValue,message)
 
