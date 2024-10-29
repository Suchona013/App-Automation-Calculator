import org.testng.annotations.Test;

public class CalculatorTest extends Setup{
    CalculatorScreen screen;

    @Test(priority = 1, description = "Do sum for 12 and 3")
    public void addition(){
        test = extent.createTest("Addition Test", "Verify addition");
        screen= new CalculatorScreen(driver);
        screen.btnClearClick(driver);
        String res= screen.doAddition(driver);
        try {
            assert res.contains("15");
            test.pass("Addition test passed with result: " + res);
        } catch (Exception e) {
            test.fail("Addition test failed: ");
            throw e;
        }

    }

    @Test(priority = 2, description = "Do subtraction from 45 to 30")
    public void subtraction(){
        test = extent.createTest("Subtraction Test", "Verify subtraction");
        screen= new CalculatorScreen(driver);
        screen.btnClearClick(driver);
        String res= screen.doSubtraction(driver);
        try {
            assert res.contains("15");
            test.pass("Subtraction test passed with result: " + res);
        } catch (Exception e) {
            test.fail("Subtraction test failed: ");
            throw e;
        }


    }

    @Test(priority = 3, description = "Do multiply 71 with 2")
    public void multiplication(){
        test = extent.createTest("Multiplication Test", "Verify multiplication");
        screen= new CalculatorScreen(driver);
        screen.btnClearClick(driver);
        String res=screen.doMultiplication(driver);
        try {
            assert res.contains("142");
            test.pass("Multiplication test passed with result: " + res);
        } catch (AssertionError e) {
            test.fail("Multiplication test failed: ");
            throw e;
        }

    }

    @Test(priority = 4, description = "Do division for 80/10")
    public void division() {
        test = extent.createTest("Division Test", "Verify division");
        screen = new CalculatorScreen(driver);
        screen.btnClearClick(driver);
        String res = screen.doDivision(driver);
        try {
            assert res.contains("8");
            test.pass("Division test passed with result: " + res);
        } catch (AssertionError e) {
            test.fail("Division test failed: ");
            throw e;

        }
    }

}
