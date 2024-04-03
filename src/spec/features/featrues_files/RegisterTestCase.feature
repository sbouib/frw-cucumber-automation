Feature: Verifier le module register
  En tant que utilisateur je souhaite remplir le formulaire afin de m enregistrer

  @registerTestCase
  Scenario Outline: Verifier le module register
   Given Je me connecte sur l application Mercury
   When Je click sur le lien Register
   When Je saisie mon First Name "<firstname>"
   And je saisie mon Last Name "<lastname>"
   And Je saisie mon numero telephone "<phone>"
   And Je saisie mon address Email "<email>"
   And Je saisie mon Address "<adress>"
   And Je saisie ma ville "<city>"
   And Je saisie mon stat "<Stat>"
   And Je saisie mon code postal "<codePostal>"
   And Je selectionne le pays "<country>"
   And Je saisie mon User Name "<username>"
   And Je saisie mon Password "<password>"
   And Je confirm mon Password "<confirmpassword>"
   And Je click sur le boutton Envoyer
 Then Je me derige vers la page register success "<Note>"
   

    Examples: 
      | firstname  | lastname  | phone  | email          | adress   | city  | Stat| codePostal | country | username | password | confirmpassword | Note                                               |
      | sboui      |Bahaeddine |25000000|baha@gmail.com  |xyz       |tws    |Gabes|6020        |TUNISIA  |baha@gmail.com       |baha@baha |baha@baha        |  Note: Your user name is baha@gmail.com.|
      | omar       |benlellahom|23000000|omar@gmail.com  | absc     |ammd   |tunis|1010        |TUNISIA  |omar@gmail.com    |   omar14 |omar14              |  Note: Your user name is omar@gmail.com.                     |
