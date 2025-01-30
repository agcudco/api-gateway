# API Gateway

Usar el **SonarQube** con Maven:

```bash
mvn clean verify sonar:sonar
```

# Incluyendo propiedades

```bash
mvn clean verify sonar:sonar \
  -Dsonar.projectKey=proyectoMicroservicios \
  -Dsonar.host.url=http://localhost:9000 \
  -Dsonar.login=TU_TOKEN_SONARQUBE
```