package Pages.Trains;

import Utils.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LandingTrains extends Base {

    public LandingTrains(WebDriver driver) {
        super(driver);
    }

    public void closeCookies(){
        waitXMills(1000);
        clickRejectAll();
    }

    public void compFormTren() {
        waitXMills(3000);
        //closeCookies();
        click(explicitWait(By.xpath("//button[@class=\"d-16g44dp\"]"),20));
        System.out.println("Se hizo click");
        sendText(By.xpath("//input[@id=\":R5kd9dalamt2mm:\"] "), "Madrid");

        sendText(By.xpath("//input[@id=\":R6kd9dalamt2mm:\"] "),"Barcelona");
        waitXMills(1000);
        click(By.xpath("//input[@id=\":R6kd9dalamt2mm:\"]"));

        click(By.xpath("//button[@aria-label=\"Buscar\"]"));

    }
    //------------------------------------------caso2--------------------------------------
    public void reservaSugePage(){
        waitXMills(3000);
        //closeCookies();

        click(explicitWait(By.xpath("//button[@class=\"d-16g44dp\"]"),20));
        System.out.println("Se hizo click");
        waitXMills(1000);
        sendText(By.xpath("//input[@id=:R5kd9dalamt2mm:]"), "Madrid");
        waitXMills(1000);
        sendText(By.xpath("//input[@id=:R6kd9dalamt2mm]"),"Barcelona");
        waitXMills(1000);




    }







//------------------------------------------------------------------------------------------------------
    public void cuando(){
        click(By.xpath("//span[@class=\"d-aziqil\"]"));
        //revisar que seleccione la fecha automaticamente desde la pagina

    }
    public void cantidadPersonas(){
        click(By.xpath("//span[@class=\"d-glv9jj\"]"));

        click(By.xpath("//button[@aria-label=\"Aumentar el número de adultos\"]"));

    }

    public void elegirViaje(){

        click(explicitWait(By.xpath("//div[@data-testid=\"v01-51567359\"//div[@data-testid=\"transportcard-way-0\"]]"), 10));
    }

    public void detallesdelViaje(){
        //Boton Seleccionar el paquete de viaje en resumen
        click(By.xpath("//Button[contains(@class,'PriceBreakdownDetailsFooter__ButtonWrapper-cncr__sc-7yob6i-5')]"));

    }

}
