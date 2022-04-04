package com.fortesza.retoAutomatizacion.Userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class InterfaceWeb extends PageObject {

    public static final Target CUERPO_WEB =Target.
            the("El body de la aplicación").
            located(By.xpath("//body"));
    public static final Target ENLACE_INICIA_SESION =Target.
            the("Enlace para iniciar seción").
            located(By.xpath("//strong[text()='Inicia Sesión']"));

    public static final Target CORREO_CAJA_TEXTO =Target.
            the("correo del usuario para iniciar seción").
            located(By.xpath("//input[@id='txt-email-or-user']"));

    public static final Target CLAVE_CAJA_TEXTO =Target.
            the("Clave del usuario para iniciar seción").
            located(By.xpath("//input[@id='txt-password']"));

    public static final Target BOTON_INICIO_SESION =Target.
            the("Botón para iniciar seción").
            located(By.xpath("//button[@id='btn-sign-in-page']"));

   public static final Target PROGRESO =Target.
            the("Botón para iniciar seción").
            located(By.xpath("//*[contains(text(),'Cargando')]"));

  public static final Target MENSAJE_VALIDACION_GENERICO =Target.
            the("ALERTA AL USUARIO").
            located(By.xpath("//div[contains(text(),'Error')]"));


    public static final Target CERRAR_SESION =Target.
            the("Botón de cierre de sesión").
            located(By.xpath("//button//span[text()='Cerrar sesión']"));

    public static final Target MENU_3_PUNTOS =Target.
            the("Menú para acceder a la seguridad").
            located(By.xpath("//mat-toolbar//button[2]"));

    public static final Target BOTON_SEGURIDAD =Target.
            the("Botón Seguridad par acceder al perfil del usuario").
            located(By.xpath("//button//span[text()='Seguridad']"));

    public static final Target BOTON_EDITAR_TELEFONO_CONTACTO =Target.
            the("BOTÓN EDITAR TELEFONO DE CONTACTO").
            located(By.xpath("//mat-form-field[1]//button//span[contains(text(),'Editar')]"));

     public static final Target BOTON_EDITAR_CORREO_ELECTRONICO =Target.
            the("BOTÓN EDITAR CORREO ELECTRONICO").
            located(By.xpath("//mat-form-field[2]//button//span[contains(text(),'Editar')]"));

     public static final Target CAJA_DE_TEXTO_TELEFONO_CONTACTO =Target.
            the("Caja de texto para editar el telefono de contacto").
            located(By.xpath("//div//input[@placeholder='Teléfono de contacto']"));

      public static final Target BOTON_ACEPTAR =Target.
            the("Botón para aceptar cuando guarda los cambios").
            located(By.xpath("//span[contains(text(),'Guardar')]//ancestor::button"));

   public static final Target CAJA_DE_TEXTO_CORREO_ELECTRONICO =Target.
            the("Caja de texto para editar el correo electronico").
            located(By.xpath("//div//input[@placeholder='Correo electrónico']"));

     public static final Target CAJA_DE_TEXTO_CONTRASENA_ACTUAL =Target.
            the("Caja de texto para editar la contraseña actual").
            located(By.xpath("//mat-form-field[1]//input[@id='input-password-change']"));

 public static final Target CAJA_DE_TEXTO_NUEVA_CONTRASENA =Target.
            the("Caja de texto para editar  la nueva contraseña").
            located(By.xpath("//mat-form-field[2]//input[@id='input-password-change']"));

public static final Target CAJA_DE_TEXTO_CONFIRMAR_NUEVA_CONTRASENA =Target.
            the("Caja de texto para confirmar la nueva contraseña").
            located(By.xpath("//input[@id='input-password-change-confirm']"));

public static final Target BOTON_CAMBIAR_CONTRASENA =Target.
            the("Botón para cambiar la contraseña").
            located(By.xpath("//button//span[contains(text(),'Cambiar contraseña')]//ancestor::button"));

public static final Target BOTON_EDITAR_IMAGEN =Target.
            the("Lapiz para carar la imagen").
            located(By.xpath("//mat-icon[text()='edit']"));
public static final Target FILE =Target.
            the("Lapiz para carar la imagen").
            located(By.xpath("//input[@name='upload-file']"));
public static final Target BOTON_ACEPTAR_SUBIR_IMAGEN =Target.
            the("Botón que acepta cuando subes una imagen").
            located(By.xpath("//button//span[text()='Aceptar']"));
    public static final Target CORREO_REGISTRO = Target.
            the("Botón que acepta cuando subes una imagen").
            located(By.xpath("//input[@id='input-email-register']"));
 public static final Target CLAVE_REGISTRO = Target.
            the("Botón que acepta cuando subes una imagen").
            located(By.xpath("//input[@id='input-password-register']"));
public static final Target TERMINOS_Y_CONDICIONES = Target.
            the("Botón que acepta cuando subes una imagen").
            located(By.xpath("//mat-checkbox[@id='check-terms-and-conditions']"));
public static final Target BOTON_CREAR_CUENTA = Target.
            the("Botón que acepta cuando subes una imagen").
            located(By.xpath("//button[@id='btn-register-user']"));
}
