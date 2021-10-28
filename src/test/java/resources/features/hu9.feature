Feature: Editar promoción para visualización en la aplicación
  Como usuario que brinda un servicio de alquiler deseo editar mis promociones para corregir o actualizar la información

  Scenario: Usuario actualiza promoción con datos válidos
    Given El usuario se encuentra en la vista Home
    When El usuario ingresa en la sección promociones
    Then El sistema muestra la vista de promociones
    When El usuario ingresa a la sección editar promociones
    Then El usuario edita los datos para la promocion
    And El sistema muestra la promoción editada

  Scenario: Usuario desiste su intención de editar promoción
    Given El usuario se encuentra en la vista Home
    When El usuario ingresa en la sección promociones
    Then El sistema muestra la vista de promociones
    When El usuario ingresa a la sección editar promociones
    Then El sistema muestra la vista de editar promoción
    When El usuario desiste de editar la promoción
    Then El sistema vuelve a la vista de las promociones

  Scenario: Usuario ingresa datos invalidos a la actualización de la promoción
    Given El usuario se encuentra en la vista Home
    When El usuario ingresa en la sección promociones
    Then El sistema muestra la vista de promociones
    When El usuario ingresa a la sección editar promociones
    Then El sistema muestra la vista de editar promoción
    When El usuario edita con datos incorrectos la promocion
    Then El sistema no edita la promoción
    Then El sistema vuelve a la vista de las promociones