package Pages.Trains;

import Utils.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingTrains extends Base {


    public LandingTrains(WebDriver driver) {
        super(driver);
    }

    public void btn_soloIda() {

        click(By.xpath("//button[@class=\"d-16g44dp\"]]"));
    }
    public void seleccionarOrigen(){
       sendText(By.xpath("//input[@id=\":R5kd9dalamt2mm:\"]] "), "Madrid");
    }

    public void seleccionarDestino(){
        sendText(By.xpath("//input[@id=\":R6kd9dalamt2mm:\"] "),"Barcelona");
    }

    public void cuando(){
        click(By.xpath("//span[@class=\"d-aziqil\"]"));
        //revisar que seleccione la fecha automaticamente desde la pagina

    }
    public void btn_Buscar(){

        click(By.xpath("//button[@aria-label=\"Buscar\"]"));
    }

    public void cantidadPersonas(){
        click(By.xpath("//span[@class=\"d-glv9jj\"]"));

        click(By.xpath("//button[@aria-label=\"Aumentar el número de adultos\"]"));

    }



}
