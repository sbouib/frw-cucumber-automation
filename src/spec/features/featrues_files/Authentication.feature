Feature: Je verefie la page d authentification
  En tant que utilisateur je souhaite me connecter au site Mercury

  @connexion
  Scenario: Je verefie la page d authentification
   Given Je me connecte sur l aplication Mercury
   When Je saisie le User Name "Test" 
   And Je saisie le Password "Test" 
   And je clique sur le button Submit
   Then je me redirige vers la page home "Login Successfully"