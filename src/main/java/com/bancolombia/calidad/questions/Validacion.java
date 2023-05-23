package com.bancolombia.calidad.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.bancolombia.calidad.userinterfaces.UserPage.TEXTO_VALIDACION;

public class Validacion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String stringTemporal = Text.of(TEXTO_VALIDACION).viewedBy(actor).asString();
        if (stringTemporal.contains("cuotas mensuales")){
            return true;
        }
        return false;
    }

    public static Validacion finSimulacion(){
        return new Validacion();
    }
}
