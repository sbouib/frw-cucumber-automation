Feature: Verifier le module register
  En tant que utilisateur je souhaite remplir le formulaire afin de m enregistrer

  @moduleRegister
  Scenario Outline: Verifier le module register
   Given je me connecte sur l application Mercury
   When je saisie mon First Name "<firstname>"
   And Je saisie mon Last Name "<lastname>"
   And je saisie mon numero telephone "<phone>"
   And je saisie mon address Email "<email>"
   And je saisie mon Address "<adress>"
   And je saisie ma ville "<city>"
   And je saisie mon stat "<Stat>"
   And je saisie mon code postal "<codePostal>"
   And je select le pays "<country>"
   And je saisie mon User Name "<username>"
   And je saisie mon Password "<password>"
   And je confirm mon Password "<confirmpassword>"
   And je click sur le boutton Envoyer
 Then je me derige vers la page register success "<Note>"
   

    Examples: 
      | firstname  | lastname  | phone  | email                    | adress   | city  | Stat| codePostal | country | username | password | confirmpassword | Note                                        |
      | Sboui      |Bahaeddine |25035234|bahaeddinesboui1@gmail.com|wed-ennour|Elhamma|Gabes|6020        |TUNISIA  |baha      |baha@baha |baha@baha        |Note: Your user name is baha.              |
      | omar       |benlellahom|23000000|omar@gmail.com            | absc     |ammd   |tunis|1010        |TUNISIA  |OMAR      |   omar14 |omar14           |Note: Your user name is OMAR.              |
