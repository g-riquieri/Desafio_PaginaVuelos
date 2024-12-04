package Pages.Flays;

import Utils.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FlyList extends Base {

    public FlyList(WebDriver driver) {
        super(driver);
    }

    By masBarato = By.xpath("//button[@data-value='price.asc']");
    By vueloElecto = By.xpath("//div[@data-testid='v01-772951052']//div[contains(@data-testid,'transportcard')]");
    By btnSelec = By.xpath("//button[text()[contains(.,'Seleccionar')]]");
    By opcRecomendada = By.xpath("//div[contains(@class,'recommendedCard')]");
    By nombre = By.xpath("//div[@data-testid='name']");
    By apellido = By.xpath("//div[@data-testid='surname']");
    By correo = By.xpath("//div[@data-testid='email']");
    By caracTel = By.xpath("//div[@data-testid='selected-option-label']");
    By telefono = By.xpath("//div[@data-testid='phone_phoneNumber']");
    //WebElement elMejor = explicitWait(By.xpath("//div[@data-testid='v01-772951052']"),10);

    public void btnMasBaratos() {
        explicitWait(masBarato,10).click();
    }

    public void elegirVuelo() {
        explicitWait(vueloElecto,10).click();
        explicitWait(btnSelec,10).click();
    }

    public void elegirPaquete() {
        explicitWait(opcRecomendada,10).click();
    }

    public void completarDatContac(String name, String surname, String email, String caraTel, String phone ) {
        sendText(nombre,name);
        sendText(apellido,surname);
        sendText(correo,email);
        sendText(caracTel,caraTel);
        sendText(telefono,phone);
    }

}
