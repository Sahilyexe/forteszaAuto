package com.fortesza.retoAutomatizacion.Questions;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;


public class ColorTexto {


    public static buscadorElemento  delElemento(Target elemento) {
        return new buscadorElemento(elemento);
    }

    public static class buscadorElemento extends PageObject implements Question<Boolean>{

        private String color;
        private Target elemento;

        public buscadorElemento(Target elemento) {
            this.elemento = elemento;
        }


        public buscadorElemento(Target elemento, String color) {
            this.elemento = elemento;
            this.color = color;
        }

        public buscadorElemento es(String color) {
            return new buscadorElemento(this.elemento, color);
        }

        @Override
        @Step("Se verificar que se muestre el texto #texto")
        public Boolean answeredBy(Actor actor) {
            return this.elemento.resolveFor(actor).getCssValue("class").contains(this.color);
        }




    }



}
