package co.com.choucair.certification.PruebasContinuas.questions;

import co.com.choucair.certification.PruebasContinuas.model.NombrePagina;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Answer implements Question<Boolean> {

    NombrePagina nombrePagina;

    public Answer(NombrePagina nombrePagina) {
        this.nombrePagina = nombrePagina;
    }

    public static Answer toThe(NombrePagina nombrePagina) {
        return new Answer(nombrePagina);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean result = false;

        String currentTitle = Serenity.getWebdriverManager().getCurrentDriver().getCurrentUrl();

        if (currentTitle.contains(nombrePagina.getStrNombreDeLaPagina())){
            result = true;
        }
        return result;

    }
}
