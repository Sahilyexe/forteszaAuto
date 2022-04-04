package com.fortesza.retoAutomatizacion.task;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import net.serenitybdd.screenplay.targets.Target;

public class Ingresar {

	public static buscadorDeElemento elTexto(String texto) {
		return new buscadorDeElemento(texto);
	}
	
	public static class buscadorDeElemento extends PageObject implements Task{
		
		private static  String texto;
    	private Target elemento;
    	
    	

		public buscadorDeElemento(String texto) {
			super();
			this.texto = texto;
		}

        

		public buscadorDeElemento(String texto, Target elemento) {
			super();
			this.texto = texto;
			this.elemento = elemento;
		}

       public buscadorDeElemento enElElemento(Target elemento) {
    	   return Tasks.instrumented(buscadorDeElemento.class,texto,  elemento);
       }

		@Override
		public <T extends Actor> void performAs(T actor) {

			actor.attemptsTo(Enter.theValue(texto).into(elemento));
		}
		
		
	}
}
