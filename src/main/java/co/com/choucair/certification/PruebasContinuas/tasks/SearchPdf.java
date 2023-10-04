package co.com.choucair.certification.PruebasContinuas.tasks;

import co.com.choucair.certification.PruebasContinuas.interactions.SwitchWindows;
import co.com.choucair.certification.PruebasContinuas.userinterface.ProductosServiciosPage;
import co.com.choucair.certification.PruebasContinuas.userinterface.BanistmoPage;
import co.com.choucair.certification.PruebasContinuas.userinterface.PrestamosAutosPage;
import co.com.choucair.certification.PruebasContinuas.userinterface.PrestamosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SearchPdf implements Task {

    public static SearchPdf legalInformation() {
        return Tasks.instrumented(SearchPdf.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(BanistmoPage.ACEPTAR_COOKIES_BUTTON),
                Click.on(BanistmoPage.PRODUCTOS_SERVICIOS_BUTTON),
                Click.on(ProductosServiciosPage.PRESTAMOS_BUTTON),
                Click.on(PrestamosPage.PRESTAMOS_AUTOS_BUTTON),
                Click.on(PrestamosAutosPage.TASAS_TARIFAS_BUTTON),
                Click.on(PrestamosAutosPage.PROHIBICIONES_BUTTON),
                SwitchWindows.setWindow()
        );
    }
}
