Feature: Suscribirse en la aplicación
  Como usuario deseo susrcribirme en la aplicación por medio de la descripción,
  precio o tipo de suscripción para tener mejores funcionalidades

  Scenario 1: Usuario que realiza una suscripción por primera vez
    Given El usuario se encuentra en la vista Home
    When El usuario selecciona el botón nueva suscripción
    Then El sistema lo redirecciona a la vista Nueva Suscripción
    When El usuario rellena sus datos en todos los campos de suscripción
    When El usuario selecciona registrar su suscripción
    Then El usuario ya está suscrito

  Scenario 2: Usuario que contrata o brinda el servicio de alquiler quiere ver las suscripciones disponibles.
    Given El usuario se encuentra en la vista Home
    When El usuario selecciona el botón ver suscripción
    Then El sistema lo redirecciona a la vista Ver Suscripción
    Then El sistema muestra todas las suscripciones disponibles