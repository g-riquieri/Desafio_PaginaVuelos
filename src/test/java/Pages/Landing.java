package Pages;

import Utils.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Landing extends Base {

    public Landing(WebDriver driver) {
        super(driver);
    }

    //functions

    public void closeCookies(){
        waitXMills(1000);
        clickRejectAll();
    }

    public void choseOrigin(){}

    public void choseeDestination(){    }

    public WebElement lookForElement (By locator){
        return this.driver.findElement(locator);
    }
    public void click (By locator){
        this.driver.findElement(locator).click();
    }//Hace click en un elemento

    public void click (WebElement element){
        element.click();
    }//Hace click en un elemento

    public void watXMills(int mills) {
        try {
            Thread.sleep(mills);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public WebElement explWait (By locator, int seconds){
        wait = new WebDriverWait(this.driver, Duration.ofSeconds(seconds));
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }



}
