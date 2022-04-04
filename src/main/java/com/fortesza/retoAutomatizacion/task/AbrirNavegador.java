package com.fortesza.retoAutomatizacion.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;


public class AbrirNavegador implements Task {
    private Web AplicacionFortesza;

    public static AbrirNavegador enElNavegador(){
        return Tasks.instrumented(AbrirNavegador.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Open.browserOn(AplicacionFortesza));
    }
}
