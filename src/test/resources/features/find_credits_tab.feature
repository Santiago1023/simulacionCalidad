#Authors: Kevin Correa, Jovan Alejandro Zambrano, Santiago Bedoya
  #Language: ES

Feature: simular credito
  como persona natural
  quiero simular un credito de libre inversion a traves de la sucursal virtual personas
  para conocer las opciones de pago que hay

  Scenario: Ingresar a la seccion de creditos y simular uno
    Given que estoy en la pagina principal de la sucursal virtual personas de bancolombia
    When accedo a la ventana de simulacion de creditos e ingreso la informacion necesaria
    Then puedo ver las opciones de pago segun la informacion ingresada