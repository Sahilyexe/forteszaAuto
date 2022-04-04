# language: es
# encoding: UTF8
Característica: Prueba funcionalidad de Seguridad de Fortesza
  Yo como analista de QA
  Quiero verificar el ambiente de certificación
  Para conocer el estado del ambiente

  Antecedentes: Iniciar sesión en Fortesza
    Dado que inicio sesion con el usuario "sahily.siguenza77@gmail.com" y la clave "Garrapata17!"
    Y veo el título "Formulario inversionista"


  Escenario: Editar telefono de contacto
    Dado que navego hacia la seccion de seguridad
    Cuando ingreso el nuevo el nuevo telefono de contacto "65044101"
    Entonces el sistema muestra el mensaje "Actualización correcta"
    Y el usuario cierra la sesion y puede ver el mensaje "Regístrate"


  Escenario: Validación cuando se ingresa un número de telefono con longitud mayor a 25 caracteres
    Dado que navego hacia la seccion de seguridad
    Cuando ingreso el nuevo el nuevo telefono de contacto "12345678911234567892223456"
    Pero el sistema muestra el mensaje "El número de teléfono debe tener como máximo 25 caracteres"
    Y el usuario cierra la sesion y puede ver el mensaje "Regístrate"


  Esquema del escenario: Validaciones del campo telefono si se ingresan valores incorrectos
    Dado que navego hacia la seccion de seguridad
    Cuando ingreso el valor invalido en el campo <numero>
    Pero el sistema inhabilita el boton aceptar
    Y el usuario cierra la sesion y puede ver el mensaje "Regístrate"

    Ejemplos:
      |numero |
      |  ""   |
      | "abc" |
      |"!&#+)("|


  Escenario: Validación cuando ya existe el correo
    Dado que navego hacia la seccion de seguridad
    Cuando modifico al correo electronico "sahily.siguenza77@gmail.com"
    Pero el sistema muestra el mensaje "El correo ya existe"
    Y el usuario cierra la sesion y puede ver el mensaje "Regístrate"

  Escenario: Validación cuando el formato del correo es invalido
    Dado que navego hacia la seccion de seguridad
    Cuando modifico al correo electronico "esto no es un correo"
    Pero el sistema muestra el mensaje "Correo invalido"
    Y el usuario cierra la sesion y puede ver el mensaje "Regístrate"

  Escenario: Validación clave actual incorrecta
    Dado que navego hacia la seccion de seguridad
    Cuando ingreso la contraseña actual As(9rrrrrrrr contraseña nueva A23a9999/ y confirmo A23a9999/
    Pero el sistema muestra el mensaje "La contraseña actual es incorrecta"
    Y el usuario cierra la sesion y puede ver el mensaje "Regístrate"


  Esquema del escenario: Validaciones de los campos con del cambio de contrasenña
    Dado que navego hacia la seccion de seguridad
    Cuando intento ingresar la contraseña actual <actual> contraseña nueva <nueva> y confirmo <confirmo>
    Pero el sistema inhabilita el botón cambiar contrasenia
    Y el usuario cierra la sesion y puede ver el mensaje "Regístrate"

    Ejemplos:
      |actual       |nueva           |confirmo|
      |123456Dd!|"1A8638267M37384"|1A8638267M37384"|
      |123456Dd!|"1a8638267m37384"|1a8638267m37384"|
      |123456Dd!|"sinNumeros&$#()%|sinNumeros&$#()%|
      |123456Dd!|"1A8638267m373841|1A8638267m373841|
      |123456Dd!|"Aa77!12          |Aa77!12        |
      |123456Dd!|"Aa77!123456789123|Aa77!123456789123|
