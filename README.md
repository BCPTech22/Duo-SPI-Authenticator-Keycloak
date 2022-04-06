# Duo-SPI-Authenticator-Keycloak

* Building
You should be able to build and package this project using Maven. 
$ mvn clean package

* How to use :

1) Install the authenticator extension
2) Build or download the pre-built "duo.jar" JAR file.
3) Copy this JAR file to the deployments folder on the Keycloak server keycloak/standalone/deployments.
4) Restart the Keycloak application server.

* Configure the authenticator :

1) create a new application in the Duo Admin Panel. The application should be of the type "Web SDK".
2) Add the "bcp-duo-keycloak" authenticator to a spot in the Keycloak authentication flow.
3) Set the authenticator to REQUIRED, and then click Config on the authenticator to change the settings.
4) Copy the Integration Key (Client ID), Secret Key, and API Hostname from the newly created application in the Duo Admin Panel and paste them into the boxes under Authenticator Config in Keycloak.
5) Now configure policies in Duo and they will be applied in your Keycloak flow.
