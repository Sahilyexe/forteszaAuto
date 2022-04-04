package com.fortesza.retoAutomatizacion.task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;


public class Clic implements Task {
    private Target elemento;
    public Clic (Target elemento){this.elemento=elemento;}
    public static Clic enElElemento(Target elemento) {

        return Tasks.instrumented(Clic.class,elemento);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(
                WaitUntil.the(elemento, WebElementStateMatchers.isVisible()),
                Scroll.to(elemento));

       actor.attemptsTo(
               WaitUntil.the(this.elemento, WebElementStateMatchers.isVisible()),
               Click.on(this.elemento));
    }
}
