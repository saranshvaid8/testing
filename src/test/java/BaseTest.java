import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

@Test
public class BaseTest {


    //<editor-fold desc="Members">
    SoftAssert softAssert = new SoftAssert();
    //</editor-fold>

    //<editor-fold desc="Test Pre and Post Condition">

    @BeforeSuite
    private void setup(){
        System.out.println("I am the beforeSuit annotation");
    }

    @BeforeTest
    private void beforeTest(){
        System.out.println("I am the beforeTest annotation");
    }

    @AfterSuite
    private void tearDown(){
        System.out.println("I am the afterSuite annotation");
    }

    @AfterTest
    private void afterTest(){
        System.out.println("I am the afterTest annotation");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I am beforeMethod annotation");
    }
    @AfterMethod
    private void afterMethod(){
        System.out.println("I am afterMethod annotation");

    }
    //</editor-fold>


    public void printName(){
        System.out.println("Hi I am test1");
        softAssert.assertAll();
        softAssert.assertTrue(true,"Expected to be true");
        softAssert.assertFalse(false,"Expected to be false");
        softAssert.assertAll();
    }


    public void printName2(){
        System.out.println("Hi I am test2");
        assertTrue(true);
    }
}
