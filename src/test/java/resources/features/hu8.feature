Feature: Añadir promoción para visualización en la aplicación
  Como usuario que brinda un servicio de alquiler deseo añadir promociones para poder conseguir más clientes

  Scenario: Usuario añade promoción
    Given El usuario se encuentra en la vista Home
    When El usuario busca en sección promociones
    Then El sistema muestra las promociones ingresadas
    When El usuario ingresa a la sección añadir promociones
    Then El sistema muestra la vista de añadir promoción
    When El usuario ingresa los datos para la nueva promocion
    Then El sistema muestra la nueva promoción

  Scenario: Usuario que brinda un servicio de alquiler desiste su intención de añadir promoción
    Given El usuario se encuentra en la vista Home
    When El usuario busca en sección promociones
    Then El sistema muestra las promociones ingresadas
    When El usuario ingresa a la sección añadir promociones
    Then El sistema muestra la vista de añadir promoción
    When El usuario desiste de añadir nueva promoción
    Then El sistema vuelve a la vista de promociones

  Scenario: Usuario ingresa datos invalidos
    Given El usuario se encuentra en la vista Home
    When El usuario busca en sección promociones
    Then El sistema muestra las promociones ingresadas
    When El usuario ingresa a la sección añadir promociones
    Then El sistema muestra la vista de añadir promoción
    When El usuario ingresa datos incorrectos para la nueva promoción
    Then El sistema vuelve a la vista de promociones