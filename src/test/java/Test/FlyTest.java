package Test;

import Pages.Flays.FlyList;
import Pages.Flays.HotelList;
import Pages.Landing;
import Utils.Base;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriverException;

import java.util.ArrayList;
import java.util.Set;

public class FlyTest {
    private WebDriver driver;
    private WebDriverWait wait;
    private ArrayList<String> data;

    //pages
    private Landing landing;
    private FlyList flyList;
    private HotelList hotelList;

    @BeforeEach
    public void setup() {
        String browser="chrome";
        driver = Base.setupDriver(browser);
        landing = new Landing(driver);
        landing.loadPage("https://www.rumbo.es/");
        flyList = new FlyList(driver);
        hotelList = new HotelList(driver);
        hotelList.loadPage("https://www.rumbo.es/s/hdp/search?origin=MAD&destination=A&datefrom=A&dateto=T,4,6&adults=2&sort=recommended&search_mode=DP&int_type=CMS_DP&int_campaign=RR&int_detail=MHP_RMB_third_inspire_couple&search_id=x1733601150480598b");

    }

    @Test
    public void TC001(){
        landing.closeCookies();
        landing.completeTheForm();
        flyList.btnMasBaratos();
        flyList.elegirVuelo();
    }

    @Test
    public void TC002(){
        landing.closeCookies();
        landing.banEnPareja();
        Set<String> windowHandles = driver.getWindowHandles(); //Obten la ventanas  abiertas ahora
        String originalWindow = driver.getWindowHandle();
        for (String handle : windowHandles) { //Cambia de ventanas
            if (!handle.equals(originalWindow)) {
                driver.switchTo().window(handle);
                break;
            }
        }
        hotelList.closeCookies();
        hotelList.elegirHotel();
    }


    //@AfterEach
    public void postConditions(){
        landing.closeBrowser();
    }


}
