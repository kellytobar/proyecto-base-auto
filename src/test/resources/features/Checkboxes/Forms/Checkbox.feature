#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Regresion
Feature: Formulario con Checkboxes
  El usuario debe poder seleccionar en el formulario las opciones: 
  sólo el check1 ó sólo el check2 ó el check1 y check2

  @CasoExitoso1
  Scenario: Diligenciamiento de todos los checkbox de forma exitosa en el formulario.  
  	No se presenta ningun mensaje de validación.
  Given Ingreso a la URL "http://the-internet.herokuapp.com/checkboxes" y clickeo todos los check
  
  	
  	
   

  

      
   
