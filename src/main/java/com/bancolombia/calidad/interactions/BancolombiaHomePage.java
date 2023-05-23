package com.bancolombia.calidad.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Random;

import static com.bancolombia.calidad.userinterfaces.UserPage.*;

public class BancolombiaHomePage implements Interaction {

    Random random = new Random();
    String monto = Integer.toString(random.nextInt(499000000) + 1000000);
    String cuotas = Integer.toString(random.nextInt(36) + 48);


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(CERRAR_POPUP));
        actor.attemptsTo(Click.on(OPCION_CREDITOS));
        actor.attemptsTo(Click.on(OPCION_IR_SIMULAR));
        actor.attemptsTo(Click.on(OPCION_CONTINUAR));
        actor.attemptsTo(Click.on(OPCION_SI));
        actor.attemptsTo(Enter.theValue(monto).into(INPUT_MONTO));
        actor.attemptsTo(Enter.theValue(cuotas).into(INPUT_CUOTAS));
        actor.attemptsTo(Click.on(OPCION_FECHA));
        actor.attemptsTo(Click.on(OPCION_YEAR));
        actor.attemptsTo(Click.on(OPCION_MONTH));
        actor.attemptsTo(Click.on(OPCION_DAY));
        actor.attemptsTo(Click.on(OPCION_SIMULAR));
    }

    public static BancolombiaHomePage go(){

        return Tasks.instrumented(BancolombiaHomePage.class);
    }

}
