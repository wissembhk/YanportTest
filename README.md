# Yanport Test

Ce projet est un test proposer par Yanport ( Ihoover )
A fin de tester ce projet tu peux choisir entre plusieurs méthode

## Tester le Projet sur un contenaire

1-Pour lancer le projet sur un contenaire docker il faut  :

#### `1.1 acceder au dossier Yanport/YanportFront
#### `1.2 npm install`
#### `1.3 ng build ou npm run ng build`
#### `1.4 acceder au dossier Yanport/spring`
#### `1.5 mvn clean`
#### `1.6 mvn install`
#### `1.7 acceder au dossier Yanport`
#### `1.8 docker-compose up -d `
#### `1.9 tester lapplication en visitant http://localhost:4200/yanport-front/`
remarque : il vous faut openjdk version 11 & npm 8 & node 19

2-Pour lancer directement le projet sans contenaire il faut : 

#### `2.1 acceder au dossier Yanport/YanportFront
#### `2.2 npm install`
#### `2.3 ng serve ou npm run ng serve`
#### `2.4 acceder au dossier Yanport/spring`
#### `2.5 mvn clean`
#### `2.6 mvn install`
#### `2.7 java -jar target/YanportTest-1.0.jar`
#### `2.8 tester lapplication en visitant http://localhost:4200/yanport-front/`
remarque : il vous faut openjdk version 11 & npm 8 & node 19

3- Vous pouvez aussi télécharger les deux images du docer hub:
 #### image angular : https://hub.docker.com/repository/docker/wissembhk/yanport_angular
 #### image spring : https://hub.docker.com/repository/docker/wissembhk/yanport_spring
 L'application se lancera sur le port 4200 pour l'angular et 8089 pour le spring
