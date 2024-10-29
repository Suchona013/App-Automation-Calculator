import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorScreen {

    public CalculatorScreen(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    //locators
    String btn1_id= "com.bng.calculator:id/btn_1";
    String btn2_id="com.bng.calculator:id/btn_2";
    String btn3_id="com.bng.calculator:id/btn_3";
    String btn4_id="com.bng.calculator:id/btn_4";
    String btn5_id="com.bng.calculator:id/btn_5";
    String btn6_id="com.bng.calculator:id/btn_6";
    String btn7_id="com.bng.calculator:id/btn_7";
    String btn8_id="com.bng.calculator:id/btn_8";
    String btn9_id="com.bng.calculator:id/btn_9";
    String btn0_id="com.bng.calculator:id/_0p_1";
    String btnPlus_id="com.bng.calculator:id/plus";
    String btnMinus_id="com.bng.calculator:id/minus";
    String btnMultiply_id="com.bng.calculator:id/multi";
    String btnDivide_id="com.bng.calculator:id/divi";
    String btnEqual_id="com.bng.calculator:id/equal";
    String btnClear_id="com.bng.calculator:id/btn_clear";
    String btnResult_id="com.bng.calculator:id/formula";


    public void btnClearClick(AndroidDriver driver) {
        driver.findElement(By.id(btnClear_id)).click();
    }
    public String doAddition(AndroidDriver driver){
        driver.findElement(By.id(btn1_id)).click();
        driver.findElement(By.id(btn2_id)).click();
        driver.findElement(By.id(btnPlus_id)).click();
        driver.findElement(By.id(btn3_id)).click();
        driver.findElement(By.id(btnEqual_id)).click();
        return driver.findElement(By.id(btnResult_id)).getText();

    }
    public String doSubtraction(AndroidDriver driver){
        driver.findElement(By.id(btn4_id)).click();
        driver.findElement(By.id(btn5_id)).click();
        driver.findElement(By.id(btnMinus_id)).click();
        driver.findElement(By.id(btn3_id)).click();
        driver.findElement(By.id(btn0_id)).click();
        driver.findElement(By.id(btnEqual_id)).click();
        return driver.findElement(By.id(btnResult_id)).getText();
    }
    public String doMultiplication(AndroidDriver driver){
        driver.findElement(By.id(btn7_id)).click();
        driver.findElement(By.id(btn1_id)).click();
        driver.findElement(By.id(btnMultiply_id)).click();
        driver.findElement(By.id(btn2_id)).click();
        driver.findElement(By.id(btnEqual_id)).click();
        return driver.findElement(By.id(btnResult_id)).getText();
    }
    public String doDivision(AndroidDriver driver){
        driver.findElement(By.id(btn8_id)).click();
        driver.findElement(By.id(btn0_id)).click();
        driver.findElement(By.id(btnDivide_id)).click();
        driver.findElement(By.id(btn1_id)).click();
        driver.findElement(By.id(btn0_id)).click();
        driver.findElement(By.id(btnEqual_id)).click();
        return driver.findElement(By.id(btnResult_id)).getText();
    }
}
