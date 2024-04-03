Feature: Je remplie la formulaire de creation de compte
  En tant que utilisateur je souhaite de creer un compte sur Mercury

  @register
  Scenario: Je remplie la formulaire de creation de compte
   Given je me connecte sur l application Mercury
   When je me crick sur Register
   And je saisie mon First Name "Sboui"
   And Je saisie mon Last Name "Bahaeddine"
   And je saisie mon numero telephone "25035234"
   And je saisie mon address Email "bahaeddinesboui1@gmail.com"
   And je saisie mon Address "wed-ennour"
   And je saisie ma ville "Elhamma"
   And je saisie mon stat "Gabes"
   And je saisie mon code postal "6020"
   And je select le pays "TUNISIA"
   And je saisie mon User Name "baha"
   And je saisie mon Password "baha@baha"
   And je confirm mon Password "baha@baha"
   And je click sur le boutton Envoyer 
   Then je me derige vers la page register success "Note: Your user name is bahaeddinesboui1@gmail.com."
