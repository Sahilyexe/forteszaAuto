package com.fortesza.retoAutomatizacion.task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;


public class EsperarHastaQueNoVeaElElemento implements Task {
    private Target elemento;
    public EsperarHastaQueNoVeaElElemento(Target elemento){this.elemento=elemento;}
    public static EsperarHastaQueNoVeaElElemento enElElemento(Target elemento) {

        return Tasks.instrumented(EsperarHastaQueNoVeaElElemento.class,elemento);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(
                WaitUntil.the(elemento, WebElementStateMatchers.isNotVisible()));

    }
}
