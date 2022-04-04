package com.fortesza.retoAutomatizacion.stepsdefinitions;


import com.fortesza.retoAutomatizacion.Questions.SeMuestra;
import com.fortesza.retoAutomatizacion.task.AbrirNavegador;
import com.fortesza.retoAutomatizacion.task.Clic;
import com.fortesza.retoAutomatizacion.task.EsperarHastaQueNoVeaElElemento;
import com.fortesza.retoAutomatizacion.task.Ingresar;
import cucumber.api.java.Before;
import cucumber.api.java.es.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.apache.commons.lang3.RandomStringUtils;


import static com.fortesza.retoAutomatizacion.Userinterface.InterfaceWeb.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class RegistroStepDefinition {


    @Dado("^que navego hacia la pagina de registro$")
    public void queNavegoHaciaLaPaginaDeRegistro() {
        OnStage.theActorInTheSpotlight().wasAbleTo(AbrirNavegador.enElNavegador());
    }

    @Cuando("^ingreso el usuario correo y la clave$")
    public void ingresoElUsuarioCorreo() {
        String correo= RandomStringUtils.random(4, true, true);
        String clave= RandomStringUtils.random(6, true, true);
        System.out.println(clave);
        OnStage.theActorInTheSpotlight().attemptsTo(Ingresar.elTexto(correo.concat("@gmail.com")).enElElemento(CORREO_REGISTRO));
        OnStage.theActorInTheSpotlight().attemptsTo(Ingresar.elTexto(clave.concat("4A!")).enElElemento(CLAVE_REGISTRO));
        OnStage.theActorInTheSpotlight().attemptsTo(Clic.enElElemento(TERMINOS_Y_CONDICIONES));
        OnStage.theActorInTheSpotlight().attemptsTo(Clic.enElElemento(BOTON_CREAR_CUENTA));
        OnStage.theActorInTheSpotlight().attemptsTo(EsperarHastaQueNoVeaElElemento.enElElemento(PROGRESO));

    }
}
