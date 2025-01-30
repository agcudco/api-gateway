# API Gateway

Usar el **SonarQube** con Maven:

```bash
mvn clean verify sonar:sonar
```
## Deshabilitar (temporalmente) las pruebas
```bash
mvn clean verify sonar:sonar -DskipTests
```

## Incluyendo propiedades

```bash
mvn clean verify sonar:sonar \
  -Dsonar.projectKey=proyectoMicroservicios \
  -Dsonar.host.url=http://localhost:9000 \
  -Dsonar.login=TU_TOKEN_SONARQUBE
```