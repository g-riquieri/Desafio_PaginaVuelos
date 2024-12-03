package Pages;

import Utils.Base;
import org.openqa.selenium.WebDriver;

public class Landing extends Base {

    public Landing(WebDriver driver) {
        super(driver);
    }

    //functions

    public void closeCookies(){
        waitXMills(1000);
        clickRejectAll();
    }
}
