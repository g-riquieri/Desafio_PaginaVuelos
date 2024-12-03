package Test;

import Utils.Base;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class FlyTest {
    private WebDriver driver;

    @BeforeEach
    public void setup() {
        String browser="firefox";
        driver = Base.setupDriver(browser);
        driver.get("https://www.rumbo.es/");
    }

    @Test
    public void test(){
        System.out.println("Se ejecutó");
    }


}
