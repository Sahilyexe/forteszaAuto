# language: es
# encoding: UTF8
Característica: Prueba funcionalidad de Seguridad de Fortesza
  Yo como cliente de Fortesza
  Quiero registrarme
  Para empezar a generar ganancias

    Escenario: Registro de un nuevo usuario
    Dado que navego hacia la pagina de registro
    Cuando ingreso el usuario correo y la clave
    Entonces el sistema muestra el mensaje "Tu cuenta ha sido creada con éxito, te invitamos a continuar con el proceso de cumplimiento y completar el formulario de Debida Diligencia."
    Y el usuario cierra la sesion y puede ver el mensaje "Regístrate"


