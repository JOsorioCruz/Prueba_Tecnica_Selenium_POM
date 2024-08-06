<img src="imagen.png" alt="Descripción de la imagen" width="200"/>

# Proyecto Selenium Maven Java POM

Este proyecto es una prueba técnica utilizando Selenium, Selenide, Maven, y el patrón Page Object Model (POM). El objetivo del proyecto es automatizar pruebas de una aplicación web demostrativa.

## Estructura del Proyecto

```plaintext
Prueba_Tecnica_Selenium_POM/
├── .idea/
├── .mvn/
├── build/
├── src/
│   ├── test/
│   │   ├── java/
│   │   │   ├── credenciales/
│   │   │   │   ├── Login.java
│   │   │   │   └── Usuarios.java
│   │   │   ├── pages/
│   │   │   │   ├── BasePage.java
│   │   │   │   ├── DashboarPage.java
│   │   │   │   └── InicioLoginPage.java
│   │   │   ├── stepDefinition/
│   │   │   │   ├── InicioLoginStep.java
│   │   │   │   └── LogeadoStep.java
│   │   │   └── url/
│   │   │       └── Prod.java
├── target/
├── .gitignore
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

## Dependencias

El archivo pom.xml contiene las siguientes dependencias clave:

    JUnit 5: Para las pruebas unitarias.
    Selenide: Framework para pruebas automatizadas de navegadores.
    Allure: Para generar reportes detallados de pruebas.
    SLF4J: Simple Logging Facade for Java.

### Configuración del pom.xml

El archivo pom.xml está configurado con las propiedades necesarias para compilar y ejecutar el proyecto, incluyendo versiones específicas de JUnit, AspectJ, y Allure. También se incluyen los plugins necesarios para la ejecución de pruebas y generación de reportes.


## Comandos de Ejecución

Para ejecutar las pruebas y generar los reportes, utiliza los siguientes comandos en la consola:

- Ejecutar las Pruebas
```bash
mvn clean test
```

- Generar Reporte de Allure
```bash
mvn allure:report
```

- Servir el Reporte de Allure
```bash
mvn allure:serve
```

### Recomendaciones

- Manten actualizadas las dependencias: Revisa y actualiza periódicamente las versiones de tus dependencias para asegurarte de que estás utilizando las versiones más recientes y seguras.

- Evita el uso de Selenide.sleep(): Utiliza condiciones explícitas de espera en lugar de Selenide.sleep() para hacer tus pruebas más robustas y menos propensas a fallos.

- Seguridad de las Credenciales: No almacenes credenciales directamente en el código fuente. Utiliza archivos de configuración seguros o variables de entorno para gestionar las credenciales.

- Documenta tu código: Mantén tu código bien documentado y utiliza anotaciones para describir las funcionalidades y propósitos de las pruebas, especialmente cuando uses Allure para la generación de reportes.

- Estructura Modular: Sigue manteniendo una estructura modular y limpia en tu proyecto, asegurándote de que cada clase tenga una única responsabilidad y esté correctamente encapsulada.

## Contribución

Si deseas contribuir a este proyecto, por favor sigue las pautas establecidas en el archivo README.md y asegúrate de mantener el código limpio y bien documentado.
Contacto

## Contacto

Para más información o consultas, puedes contactarme a través de mi correo electrónico: [osoriocruzjairo@gmail.com](mailto:osoriocruzjairo@gmail.com) o LinkedIn: [Jairo Osorio Cruz](https://www.linkedin.com/in/jairo-osorio-c-8461061b3/).
