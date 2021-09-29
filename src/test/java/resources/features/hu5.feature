Feature: Cambiar plan de suscripción en la aplicación
  Como usuario que contrata o brinda el servicio de alquiler deseo poder cambiar mi plan de suscripción,
  para poder aprovechar al máximo los diferentes beneficios.

  Scenario 1: Usuario que contrata un servicio de alquiler cambia de plan.
    Given El usuario se encuentra en la vista Home
    When El usuario selecciona el botón ver suscripción
    Then El sistema lo redirecciona a la vista Ver Suscripción
    When El usuario selecciona el botón Update
    Then El usuario rellena los datos de su nueva suscripción
    When El usuario guarda la nueva suscripción
    Then El sistema lo redirige a la vista Home


  Scenario 2: Usuario que contrata un servicio de alquiler desiste su intención de cambiar de plan.
    Given El usuario se encuentra en la vista Home
    When El usuario selecciona el botón ver suscripción
    Then El sistema lo redirecciona a la vista Ver Suscripción
    When El usuario selecciona el botón Update
    Then El usuario rellena parcialmente los datos de su nueva suscripción
    When El usuario cambia de opinión y se redirige a la vista Ver Suscripción
