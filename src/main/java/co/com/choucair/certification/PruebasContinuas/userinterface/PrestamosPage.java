package co.com.choucair.certification.PruebasContinuas.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.apache.tools.ant.taskdefs.Tar;
import org.openqa.selenium.By;

public class PrestamosPage {


    public static final Target PRESTAMOS_AUTOS_BUTTON = Target.the("Boton Prestamo Autos").
            located(By.xpath("//*[@id=\"none\"]/div/div/div[2]/div[3]/div/div[2]/h2/a"));


}
