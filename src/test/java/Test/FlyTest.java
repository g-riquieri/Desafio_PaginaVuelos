package Test;

import Pages.Flays.ChooseHotel;
import Pages.Flays.FlyList;
import Pages.Flays.HotelList;
import Pages.Landing;
import Utils.Base;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

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
    private ChooseHotel chooseHotel;

    @BeforeEach
    public void setup() {
        String browser="chrome";
        driver = Base.setupDriver(browser);
        landing = new Landing(driver);
        landing.loadPage("https://www.rumbo.es/");
        flyList = new FlyList(driver);
        hotelList = new HotelList(driver);
        chooseHotel = new ChooseHotel(driver);

    }

    @Test
    public void TC001(){
        landing.closeCookies();
        landing.btnBuscar();
        flyList.btnMasBaratos();
        flyList.elegirVuelo();
    }

    @Test
    public void TC002(){
        landing.closeCookies();
        landing.banEnPareja();
        String originalWindow = driver.getWindowHandle(); // Guarda la ventana original
        Set<String> windowHandles = driver.getWindowHandles(); // Obtén todos los handles de las ventanas
        String firstWindow = null;  // Cambia al handle de la primera ventana emergente (if incluido)
        for (String handle : windowHandles) {
            if (!handle.equals(originalWindow)) {
                firstWindow = handle;
                break;
            }
        }
        assert firstWindow != null;
        driver.switchTo().window(firstWindow); // Cambia a la primera ventana emergente
        hotelList.closeCookies();
        hotelList.elegirHotel();
        Set<String> updatedWindowHandles = driver.getWindowHandles(); // Obtén nuevamente los handles de ventanas
        String secondWindow = null;
        for (String handle : updatedWindowHandles) {
            if (!handle.equals(originalWindow) && !handle.equals(firstWindow)) {
                secondWindow = handle;
                break;
            }
        }
        assert secondWindow != null;
        driver.switchTo().window(secondWindow); // Cambia a la segunda ventana emergente
        chooseHotel.elegirOpcHotel();
    }

    @Test
    public void TC003() {
        landing.closeCookies();
        landing.completeTheForm();
        flyList.btnMasBaratos();
        flyList.elegirVuelo();
    }


    //@AfterEach
    public void postConditions(){
        landing.closeBrowser();
    }


}
