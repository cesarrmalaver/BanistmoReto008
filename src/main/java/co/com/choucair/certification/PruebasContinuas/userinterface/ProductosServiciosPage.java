package co.com.choucair.certification.PruebasContinuas.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductosServiciosPage {

    public static final Target PRESTAMOS_BUTTON = Target.the("Boton prestamos").
            located(By.xpath("//*[@id=\"navbar-collapse-grid\"]/ul/li[3]/ul/li/div[1]/div[1]/ul/li[4]/a"));


}
