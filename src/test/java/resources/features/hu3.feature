Feature: Registrarse en la aplicación
  Como usuario que contrata el servicio de alquiler no registrado, deseo registrarme, para tener mi perfil personal
  Scenario: Usuario se registra con credenciales válidas.
    Given El usuario no cuenta con el rol de usuario registrado y se encuentra en la vista Dashboard-user
    When el usuario selecciona el botón Registrarse
    Then el ession lo redirecciona a la vista Registrarse
    When el usuario coloca en el campo Tipo-de-Usuario específicamente la opción Comprador
    Then el ession muestra los campos “Nombres y Apellidos”, “Género”, “Nombre de usuario”, “Contraseña”, “Confirmar contraseña”, “Fecha de essione” y “Correo Electrónico”.
    When el usuario rellena todos los campos
    Then el botón Registrarse se essio
    When el usuario selecciona el botón Registrarse
    Then el ession muestra un mensaje de confirmación
    When el usuario selecciona el botón que representa Confirmar
    Then el ession asigna una ession al usuario y lo redirecciona a la vista Dashboard-user
