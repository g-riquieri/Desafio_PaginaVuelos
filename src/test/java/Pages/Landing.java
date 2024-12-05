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
        waitXMills(1000);
        click(By.xpath("//input[@aria-label='Origen']"));
        sendText(By.xpath("//input[@aria-label='Destino']"),"Madrid (MAD)");
        waitXMills(1000);
        click(By.xpath("//input[@aria-label='Destino']"));
        click(By.xpath("//div[@class='d-zbtid6']"));

    }
    public void goToTrains(){
        click(By.xpath("//p[text()='Ver más']"));
        click(By.xpath("//div[text()='Trenes']"));
    }

    public void goToCruises(){
        click(By.xpath("//p[text()='Ver más']"));
        click(By.xpath("//div[text()='Cruceros']"));
    }

}
