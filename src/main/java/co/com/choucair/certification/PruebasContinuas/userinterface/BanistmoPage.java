package co.com.choucair.certification.PruebasContinuas.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.apache.tools.ant.taskdefs.Tar;
import org.openqa.selenium.By;

public class BanistmoPage {

    public static final Target ACEPTAR_COOKIES_BUTTON = Target.the("Boton aceptar cookies").
            located(By.id("btn-aceptar-cookies"));

    public static final Target PRODUCTOS_SERVICIOS_BUTTON = Target.the("Menu productos y servicios").
            located(By.xpath("//*[@id=\"navbar-collapse-grid\"]/ul/li[3]/a"));

}
