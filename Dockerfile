FROM eclipse-temurin:17

WORKDIR /app

COPY . .

RUN ./gradlew build

FROM eclipse-temurin:17-jre

WORKDIR /app

COPY --from=0 /app/build/libs/est-openapi-gen-1.0-SNAPSHOT.jar /app/build/libs/est-openapi-gen-1.0-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "/app/build/libs/est-openapi-gen-1.0-SNAPSHOT.jar"]