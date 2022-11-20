# Yanport Test

Ce projet est un test proposer par Yanport ( Ihoover )
A fin de tester ce projet tu peux choisir entre plusieurs méthode

## Tester le Projet sur un contenaire

1- Vous pouvez aussi télécharger les deux images du docker hub:
 #### image angular : https://hub.docker.com/repository/docker/wissembhk/yanport_angular : docker pull wissembhk/yanport_angular
 #### image spring : https://hub.docker.com/repository/docker/wissembhk/yanport_spring : docker pull wissembhk/yanport_spring

2-Pour lancer le projet sur un contenaire docker il faut  :

#### `2.1 acceder au dossier Yanport/YanportFront
#### `2.2 npm install`
#### `2.3 ng build ou npm run ng build`
#### `2.4 acceder au dossier Yanport/spring`
#### `2.5 mvn clean`
#### `2.6 mvn install`
#### `2.7 acceder au dossier Yanport`
#### `2.8 docker-compose up -d `
#### `2.9 tester l'application en visitant http://localhost:4200/yanport-front/`
remarque : il vous faut mvn 3.6 & npm 8.19 & node 19

## Tester le Projet directement

3-Pour lancer directement le projet sans contenaire il faut : 

#### `3.1 acceder au dossier Yanport/YanportFront
#### `3.2 npm install`
#### `3.3 ng serve ou npm run ng serve`
#### `3.4 acceder au dossier Yanport/spring`
#### `3.5 mvn clean`
#### `3.6 mvn install`
#### `3.7 java -jar target/YanportTest-1.0.jar`
#### `3.8 tester lapplication en visitant http://localhost:4200/yanport-front/`
remarque : il vous faut openjdk version 11 & mvn 3,6 & npm 8 & node 19


 L'application se lancera sur le port 4200 pour l'angular et 8089 pour le spring
![image](https://user-images.githubusercontent.com/58009610/202931669-3cd9f7dc-d710-4514-8133-ce0af3726c27.png)
