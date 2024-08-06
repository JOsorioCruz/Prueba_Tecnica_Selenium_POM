# Selenium (Selenide)

La siguiente plantilla está realizada con Selenide, Java, POM y allure.

**Nota**; Selenide es un marco de automatización de pruebas para aplicaciones web basado en Selenium WebDriver. Está diseñado para simplificar y mejorar la experiencia de escribir y mantener pruebas automatizadas. Ofrece una API más simple y fácil de usar que Selenium, con características destacadas:

- **Esperas automáticas**: Maneja automáticamente las esperas para la aparición o desaparición de elementos
en la página, reduciendo la necesidad de escribir explícitamente comandos de espera.

- **API concisa**: Proporciona una sintaxis más corta y legible, facilitando la escritura y mantenimiento 
de pruebas.

- **Soporte para múltiples navegadores**: Compatible con Chrome, Firefox, Edge, y otros navegadores 
mediante Selenium WebDriver.

### Ejecutar Todos los Tests

Para ejecutar todos los tests de un proyecto Maven desde la consola, utiliza el siguiente comando:

```bash
mvn test -Dtest=BuscarStep
```

Comando para ejecutar un test en especifico
```bash
mvn -Dtest=BuscarStep#search test
```

### Generar y Abrir el Reporte de Allure

Para generar y abrir el reporte de Allure después de ejecutar las pruebas, utiliza el siguiente comando:

`allure generate allure-results --clean`: se utiliza para generar un reporte de Allure a partir
  de los resultados de las pruebas almacenados en un directorio.

```bash
allure generate allure-results --clean
```

Abrir reporte de allure
```bash
allure open
```
