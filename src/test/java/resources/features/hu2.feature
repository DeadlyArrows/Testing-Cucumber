Feature: Visualizar y agregar una calificación al vehículo en la aplicación
  Como usuario que contrata un servicio de alquiler deseo ver las calificaciones de los vehículos de mi interés para saber cuán confiable es el vehículo

  Scenario: Usuario visualiza la calificación del vehículo
    Given El usuario se encuentra en la vista Home
    Then El sistema muestra los vehículos a rentar
    When El usuario ingresa a la sección de calificación de vehículo
    Then El sistema muestra la ventana de calificaciones
    Then El sistema muestra una lista de las calificaciones

  Scenario: Usuario no visualiza la calificación del vehículo
    Given El usuario se encuentra en la vista Home
    Then El sistema muestra los vehículos a rentar
    When El usuario ingresa a la sección de calificación de vehículo
    Then El sistema no muestra la calificación del vehículo en la ventana



  Scenario: Usuario que contrata un servicio de alquiler agrega una nueva calificación
    Given El usuario se encuentra en la vista Home
    When El usuario busca en sección calificaciones
    Then El sistema muestra las calificciones ingresadas
    When El usuario ingresa a la sección añadir calificaciones
    Then El sistema muestra la vista de añadir calificación
    When El usuario ingresa los datos para la calificación
    Then El sistema muestra la nueva calificación

