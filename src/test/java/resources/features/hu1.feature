Feature: Búsqueda de vehículos menores
  Como usuario deseo buscar un vehículo por medio de los medio de la marca,nombre o tipo de vehículo para poder realizar el servicio de alquiler de manera más fácil y eficaz

  Scenario: Usuario que desea contratar un servicio de alquiler busca un vehículo por nombre
    Given El usuario se encuentra en la vista Home
    Then El sistema muestra los vehículos a rentar
    When El usuario busca por nombre el vehículo de su interés
    Then El sistema muestra los resultados de la búsqueda por nombre

  Scenario: Usuario que desea contratar un servicio de alquiler busca un vehículo por marca
    Given El usuario se encuentra en la vista Home
    Then El sistema muestra los vehículos a rentar
    When El usuario busca por marca los diferentes tipos de vehículos
    Then El sistema muestra los resultados de la búsqueda por marca

  Scenario: Usuario que desea contratar un servicio de alquiler busca los vehículos por tipos
    Given El usuario se encuentra en la vista Home
    Then El sistema muestra los vehículos a rentar
    When El usuario busca el vehículo de su interés por tipo de vehículo
    Then El sistema muestra los resultados de la búsqueda por tipo de vehículo

  Scenario: Usuario que desea contratar un servicio de alquiler no encuentra resultados del vehículo
    Given El usuario se encuentra en la vista Home
    Then El sistema muestra los vehículos a rentar
    When El usuario busca el vehículo de su interés
    Then El sistema no muestra ningún resultado de la búsqueda realizada