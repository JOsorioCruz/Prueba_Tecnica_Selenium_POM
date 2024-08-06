Feature: inicio de sesion
  Scenario: inicio de sesion con crendenciales validas
    Given el usuario esta en la pagina principal
    When selecciona la opcion "Make Appointment"
    And ingresa el username valido
    And ingresa el password valido
    And selecciona el boton "Login"
    Then se abre la pantalla de inicio