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

    public void closeCookies() {
        waitXMills(1000);
        clickRejectAll();
    }

    public void compFormTren() {
        waitXMills(3000);
        //closeCookies();
        click(explicitWait(By.xpath("//button[@class=\"d-16g44dp\"]"), 20));
        System.out.println("Se hizo click");
        sendText(By.xpath("//input[@id=\":R5kd9dalamt2mm:\"] "), "Madrid");

        sendText(By.xpath("//input[@id=\":R6kd9dalamt2mm:\"] "), "Barcelona");
        waitXMills(1000);
        click(By.xpath("//input[@id=\":R6kd9dalamt2mm:\"]"));

        click(By.xpath("//button[@aria-label=\"Buscar\"]"));

    }
    //------------------------------------------caso2--------------------------------------
    public void reservaSugePage() {
        waitXMills(3000);
        closeCookies();

        click(explicitWait(By.xpath("//button[@class=\"d-16g44dp\"]"), 20));
        System.out.println("Se hizo click");

        sendText(By.xpath("//input[@id=\":R5kd9dalamt2mm:\"]"), "Madrid");
        waitXMills(1000);
        sendText(By.xpath("//input[@id=\":R6kd9dalamt2mm:\"]"), "Barcelona");
        waitXMills(1000);

    }

//-----------------------------------------caso3......................
    public void resViajeSS(){
        waitXMills(3000);
        closeCookies();

        sendText(By.xpath("//input[@id=\":R5kd9dalamt2mm:\"] "), "Madrid");
        waitXMills(1000);
        sendText(By.xpath("//input[@id=\":R6kd9dalamt2mm:\"] "), "Barcelona");
        waitXMills(1000);

        click(By.xpath("//button[@aria-label=\"Buscar\"]"));

        //EL MEJOR
        //click(By.xpath("//FullTransportSummary__SummaryColumn-sc-aaxr6w-0 gibWPP]"));
        click(By.xpath("//button[@class=\"FullTransportPrices__SelectedPriceContainer-sc-1qck0l5-1 gMEljz\"]"));
        waitXMills(3000);
        //Hace clic en Seleccionar Detalles del viaje ....
        click(By.xpath("//button[@class=\"Button__LmnDsButton-sc-1bbve8d-0 bsmtZs\"]"));
        waitXMills(3000);

        //sendText(By.xpath("//input[@data-testid=\"input-input\"]"), "Bruno");
        sendText(By.xpath("//div[@data-testid='name']//span[contains(text(),'Nombre')]"),"Bruno");
        waitXMills(3000);
        sendText(By.xpath("//div[@data-testid='surname']//span[contains(text(),'Apellido')]"),"Diaz");

    }







}
    //------------------------------------------------------------------------------------------------------
  //  public void cuando(){
        //click(By.xpath("//span[@class=\"d-aziqil\"]"));
        //revisar que seleccione la fecha automaticamente desde la pagina

   // }
    //public void cantidadPersonas(){
        //click(By.xpath("//span[@class=\"d-glv9jj\"]"));

        //click(By.xpath("//button[@aria-label=\"Aumentar el número de adultos\"]"));

    //}

    //public void elegirViaje(){

        //click(explicitWait(By.xpath("//div[@data-testid=\"v01-51567359\"//div[@data-testid=\"transportcard-way-0\"]]"), 10));
    //}

    //public void detallesdelViaje(){
        //Boton Seleccionar el paquete de viaje en resumen
       // click(By.xpath("//Button[contains(@class,'PriceBreakdownDetailsFooter__ButtonWrapper-cncr__sc-7yob6i-5')]"));

    //}

//}
