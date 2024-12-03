package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Base {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public Base(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    }

    //Functions

    public static WebDriver setupDriver(String browser){
        WebDriver driver;
        switch (browser.toLowerCase()){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                throw new IllegalArgumentException("Navegador no soportado: " + browser);
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        return driver;
    }

    public void loadPage(String url){
        this.driver.get(url);
    }

    public By explicitWait(By locator, int seg){
        wait = new WebDriverWait(this.driver,Duration.ofSeconds(seg));
        return (By) wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public void waitXMills(int mills) {
        try {
            Thread.sleep(mills);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void clickRejectAll() {
        try {
            // Localizar el botón "Rechazar" usando su clase
            By rejectButtonSelector = By.cssSelector(".iubenda-cs-reject-btn");

            // Esperar a que el botón sea visible y clickeable
            WebElement rejectButton = wait.until(ExpectedConditions.elementToBeClickable(rejectButtonSelector));

            // Hacer clic en el botón
            rejectButton.click();

            System.out.println("Se hizo clic en el botón 'Rechazar todo' correctamente.");
        } catch (Exception e) {
            System.err.println("Error al hacer clic en el botón 'Rechazar todo': " + e.getMessage());
        }
    }

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

    public void  sendText(By locator, String texto){
        this.driver.findElement(locator).sendKeys(texto);
    }
    public void setAriaActiveDescendant(By elementLocator, String newValue) {
        try {
            WebElement element = driver.findElement(elementLocator);

            // Usar JavaScript para modificar el atributo 'aria-activedescendant'
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript(
                    "arguments[0].setAttribute('aria-activedescendant', arguments[1]);",
                    element,
                    newValue
            );

            System.out.println("Atributo 'aria-activedescendant' modificado correctamente.");
        } catch (Exception e) {
            System.err.println("Error al modificar 'aria-activedescendant': " + e.getMessage());
        }
    }

    public void closeDriver(){
        if (driver != null){
            driver.quit();
        }
    }
}
