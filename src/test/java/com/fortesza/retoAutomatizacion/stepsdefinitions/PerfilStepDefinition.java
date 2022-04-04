package com.fortesza.retoAutomatizacion.stepsdefinitions;


import com.fortesza.retoAutomatizacion.Questions.ColorTexto;
import com.fortesza.retoAutomatizacion.Questions.ElBoton;
import com.fortesza.retoAutomatizacion.Questions.SeMuestra;
import com.fortesza.retoAutomatizacion.task.*;
import cucumber.api.java.Before;
import cucumber.api.java.es.*;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.actors.OnStage;

import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.targets.Target;

import static com.fortesza.retoAutomatizacion.Userinterface.InterfaceWeb.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class PerfilStepDefinition {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Usuario de Fortesza");
    }

    @Dado("^que inicio sesion con el usuario \"(.*)\" y la clave \"(.*)\"$")
    public void queNavegoHaciaElInicioDeSesion(String usuario, String clave) {
        System.out.println("Test");
        OnStage.theActorInTheSpotlight().wasAbleTo(AbrirNavegador.enElNavegador());
        OnStage.theActorInTheSpotlight().attemptsTo(Clic.enElElemento(ENLACE_INICIA_SESION));
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ingresar.elTexto(usuario).
                        enElElemento(CORREO_CAJA_TEXTO));
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ingresar.elTexto(clave).
                        enElElemento(CLAVE_CAJA_TEXTO));
        OnStage.theActorInTheSpotlight().attemptsTo(
                Clic.enElElemento(BOTON_INICIO_SESION));
        OnStage.theActorInTheSpotlight().attemptsTo(EsperarHastaQueNoVeaElElemento.enElElemento(PROGRESO));

    }

    @Y("^veo el título \"(.*)\"$")
    public void ingresoIngresoElUsuarioErasmotorresGmailComLaClaveEsFortesza(String titulo) {

        OnStage.theActorInTheSpotlight().should(seeThat(SeMuestra.elTexto(titulo).enElElemento(CUERPO_WEB)));

    }

    @Dado("^que navego hacia la seccion de seguridad$")
    public void queNavegoHaciaLaSecciOnDeSeguridad() {
        OnStage.theActorInTheSpotlight().attemptsTo(Clic.enElElemento(MENU_3_PUNTOS));
        OnStage.theActorInTheSpotlight().attemptsTo((Clic.enElElemento(BOTON_SEGURIDAD)));
    }
    @Cuando("^ingreso el nuevo el nuevo telefono de contacto \"(.*)\"$")
    public void ingresoElNuevoElNuevoTelefonoDeContacto(String telefono) {
        OnStage.theActorInTheSpotlight().attemptsTo(Clic.enElElemento((BOTON_EDITAR_TELEFONO_CONTACTO)));
        OnStage.theActorInTheSpotlight().attemptsTo(Ingresar.elTexto(telefono).enElElemento(CAJA_DE_TEXTO_TELEFONO_CONTACTO));
        OnStage.theActorInTheSpotlight().attemptsTo(Clic.enElElemento(BOTON_ACEPTAR));

    }
    @Entonces("^el sistema muestra el mensaje \"(.*)\"$")
    public void elSistemaMuestraElMensajeActualizaciOnCorrecta(String mensaje) {
        OnStage.theActorInTheSpotlight().should(seeThat(SeMuestra.elTexto(mensaje).enElElemento(CUERPO_WEB)));

    }
    @Entonces("^se observa el telefono de contacto \"(.*)\" en la caja de texto telefono de contacto$")
    public void seObservaElTelefonoDeContactoEnLaCajaDeTextoTelefonoDeContacto(String texto) {
        OnStage.theActorInTheSpotlight().should(seeThat(SeMuestra.elTexto(texto).enElElemento(CUERPO_WEB)));

    }

    @Y("^el usuario cierra la sesion y puede ver el mensaje \"(.*)\"$")
    public void elUsuarioCierraLaSesion(String mensaje) {
        OnStage.theActorInTheSpotlight().attemptsTo(EsperarHastaQueNoVeaElElemento.enElElemento(MENSAJE_VALIDACION_GENERICO));
        OnStage.theActorInTheSpotlight().attemptsTo(Clic.enElElemento(MENU_3_PUNTOS));
        OnStage.theActorInTheSpotlight().attemptsTo(Clic.enElElemento(CERRAR_SESION));
        OnStage.theActorInTheSpotlight().should(seeThat(SeMuestra.elTexto(mensaje).enElElemento(CUERPO_WEB)));
    }

    @Pero("^el sistema inhabilita el boton aceptar$")
    public void elSistemaInhabilitaElBotonAceptar() {
        OnStage.theActorInTheSpotlight().should(seeThat(ElBoton.estaDeshabilitado(BOTON_ACEPTAR)));
    }

    @Cuando("^ingreso el valor invalido en el campo \"(.*)\"$")
    public void ingresoElValorInvalidoEnElCampoNumero(String valor) {
        OnStage.theActorInTheSpotlight().attemptsTo(Clic.enElElemento((BOTON_EDITAR_TELEFONO_CONTACTO)));
        OnStage.theActorInTheSpotlight().attemptsTo(Ingresar.elTexto(valor).enElElemento(CAJA_DE_TEXTO_TELEFONO_CONTACTO));

    }


    @Cuando("^modifico al correo electronico \"(.*)\"$")
    public void modificoAlCorreoElectronico(String correo)  {
        OnStage.theActorInTheSpotlight().attemptsTo(Clic.enElElemento(BOTON_EDITAR_CORREO_ELECTRONICO));
        OnStage.theActorInTheSpotlight().attemptsTo(Ingresar.elTexto(correo).enElElemento(CAJA_DE_TEXTO_CORREO_ELECTRONICO));
        OnStage.theActorInTheSpotlight().attemptsTo(Clic.enElElemento(BOTON_ACEPTAR));
    }

    @Cuando("^ingreso la contraseña actual (.*) contraseña nueva (.*) y confirmo (.*)$")
    public void ingresoLaContrasenaActualContraseñaNuevaYConfirmo(String claveActual, String nuevaClave, String mismaClave)  {
        OnStage.theActorInTheSpotlight().attemptsTo(Ingresar.elTexto(claveActual).enElElemento(CAJA_DE_TEXTO_CONTRASENA_ACTUAL));
        OnStage.theActorInTheSpotlight().attemptsTo(Ingresar.elTexto(nuevaClave).enElElemento(CAJA_DE_TEXTO_NUEVA_CONTRASENA));
        OnStage.theActorInTheSpotlight().attemptsTo(Ingresar.elTexto(mismaClave).enElElemento(CAJA_DE_TEXTO_CONFIRMAR_NUEVA_CONTRASENA));
        OnStage.theActorInTheSpotlight().attemptsTo(Clic.enElElemento(BOTON_CAMBIAR_CONTRASENA));
    }

    @Pero("^el sistema coloca el mensaje \"(.*)\" de color rojo$")
    public void elSistemaColocaElMensajeMensajeDeColorRojo(String mensaje) {

        OnStage.theActorInTheSpotlight().
                asksFor(ColorTexto.delElemento(Target.the("elemento")
                        .located(By.xpath("//*[text()='"+mensaje+"']"))).es("red"));

    }


    @Pero("^el sistema inhabilita el botón cambiar contrasenia$")
    public void elSistemaInhabilitaElBotonCambiarContrasenia() {
        OnStage.theActorInTheSpotlight().should(seeThat(ElBoton.estaDeshabilitado(BOTON_CAMBIAR_CONTRASENA)));

    }

    @Cuando("^intento ingresar la contraseña actual (.*) contraseña nueva (.*) y confirmo (.*)$")
    public void intentoIngresarLaContraseñaActualActualContraseñaNuevaNuevaYConfirmoConfirmo(String claveActual, String nuevaClave, String mismaClave) {
        OnStage.theActorInTheSpotlight().attemptsTo(Ingresar.elTexto(claveActual).enElElemento(CAJA_DE_TEXTO_CONTRASENA_ACTUAL));
        OnStage.theActorInTheSpotlight().attemptsTo(Ingresar.elTexto(nuevaClave).enElElemento(CAJA_DE_TEXTO_NUEVA_CONTRASENA));
        OnStage.theActorInTheSpotlight().attemptsTo(Ingresar.elTexto(mismaClave).enElElemento(CAJA_DE_TEXTO_CONFIRMAR_NUEVA_CONTRASENA));

    }
}
