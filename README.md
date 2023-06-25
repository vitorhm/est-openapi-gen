Esse projeto utiliza o Swagger CodeGen para gerar os stubs para utilização da API do projeto: [est-openapi](https://github.com/vitorhm/est-openapi).

O módulo `client` contém as definições do OpenAPI para geração dos stubs.
- `resources/api.json` contém a definição do OpenAPI;
- `resources/config.json` contém a configuração do Swagger CodeGen para geração dos stubs;

##  Stack
- Java
- Spring Boot
- Spring MVC
- Swagger Code Gen

## Run
- Use `docker build . -t estopenapi-gen` to build the image;
- Use `docker run -p 8080:8080 estopenapi-gen` to run the image;