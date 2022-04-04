package com.fortesza.retoAutomatizacion.Questions;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SeMuestra {


    public static buscadorElemento  elTexto(String texto) {
        return new buscadorElemento(texto);
    }

    public static class buscadorElemento extends PageObject implements Question<Boolean>{

        private String texto;
        private Target elemento;

        public buscadorElemento(String texto) {
            this.texto = texto;
        }


        public buscadorElemento(Target elemento, String texto) {
            this.elemento = elemento;
            this.texto = texto;
        }

        public buscadorElemento enElElemento(Target elemento) {
            return new buscadorElemento(elemento, this.texto);
        }

        @Override
        @Step("Se verificar que se muestre el texto #texto")
        public Boolean answeredBy(Actor actor) {
            return getRenderedView().doWait().withMessage("no se encontro el texto: "+this.texto).until(ExpectedConditions
                    .textToBePresentInElement(this.elemento.resolveFor(actor),texto));
        }
 }
}
