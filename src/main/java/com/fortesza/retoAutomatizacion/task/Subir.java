package com.fortesza.retoAutomatizacion.task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.SendKeysIntoTarget;


import static com.fortesza.retoAutomatizacion.Userinterface.InterfaceWeb.FILE;

public class Subir implements Task {
    private String imagen;
    public Subir(String imagen){this.imagen=imagen;}
    public static Subir laImagen(String imagen) {
        return Tasks.instrumented(Subir.class,imagen);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(new SendKeysIntoTarget(FILE,this.imagen));
    }
}