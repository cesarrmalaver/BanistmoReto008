package co.com.choucair.certification.PruebasContinuas.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PrestamosAutosPage {
    public static final Target TASAS_TARIFAS_BUTTON = Target.the("Boton para acceder a tasas y tarifas").
            located(By.xpath("//*[@id=\"filialTabs\"]/li[4]/a"));

    public static final Target PROHIBICIONES_BUTTON = Target.the("Boton para descargar pdf").
            located(By.xpath("//*[@id=\"tab4\"]/table/tbody/tr[2]/td[2]/span/a/img"));
}


