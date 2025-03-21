
## Application de gestion d' hôpital
Dans cette application nous avons creer une applicatin de  gestion d'hôpital  dans l'objeectif de 
mettre en evidence le concept de mapping objet relationnel en utilisant spring Data 
 JPA (Java Persistence API)   son implementation Hibernate : 

nous creeoons un projet spricng boot avec des dependance  JPA, lombock, h2 et spring web

![creaio projet ](captureDEcran/img1.png)
![creaio projet ](captureDEcran/img2.png)

Apres la definition de  l'entite  Patient,  executons  nous faisons les configuration dans la le fichier 
application.propaties pour  tester le projet. Nous avons les resultats suivant a l'execution.
![test11](captureDEcran/test11.png)

nous pouvons voir la base de donnees h2 qui a ete cree saisissant dans le navigateur http://localhost:8085/h2-console/
![creaio projet ](captureDEcran/test12.png)
![creaio projet ](captureDEcran/test13.png)


Nous passons a present a la creation de l'interface JPA Repository basée sur Spring data. Apres cette creation , nous pouvons maaintenant  implemnter la 
l'interface Commandline run pour redefinir la methode run qui va nous permettre de faire des ajout.
nous definissions de type patientrepository,nous faisons l'injection grace a l'annotation autowired et nous utiisons cet objet pour faire  des savec dans la metode run que nous redefinisson
nou avons les resultats suivant :
![test](captureDEcran/test32.png)
![test](captureDEcran/test31.png)

De la meme facon, nous utilisons le meme objet pour  consulter tous les patient en utilisant 
 la methode findAll:
![test](captureDEcran/test41.png)

