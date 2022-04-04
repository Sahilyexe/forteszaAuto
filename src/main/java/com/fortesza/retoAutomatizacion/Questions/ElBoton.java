package com.fortesza.retoAutomatizacion.Questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

import static com.fortesza.retoAutomatizacion.Userinterface.InterfaceWeb.BOTON_ACEPTAR;


public class ElBoton implements Question <Boolean>  {

Target boton;

    public ElBoton(Target boton) {
        this.boton=boton;
    }

    public static ElBoton estaDeshabilitado(Target boton) {
        return new ElBoton(boton);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return this.boton.resolveFor(actor).isDisabled();

    }
}
