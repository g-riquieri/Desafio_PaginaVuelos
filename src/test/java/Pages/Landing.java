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

    public void completeTheForm() {
        sendText(By.xpath("//input[@aria-label='Origen']"),"Buenos Aires (BUE)");
        setAriaActiveDescendant(explicitWait(By.xpath("//input[@aria-label='Origen']"),10), "listbox-option-0");
        sendText(By.xpath("//input[@aria-label='Destino']"),"Madrid (MAD)");
        setAriaActiveDescendant(explicitWait(By.xpath("//input[@aria-label='Destino']"),10), "listbox-option-0");
        lookForElement(By.xpath("//div[@class='d-zbtid6']")).submit();

    }


}
