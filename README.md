Informações:
 - Java 8
 - Spring Boot 2.3.4.RELEASE
 - Lombok 
----------------------------------------------------------------------------------------------------------------------------------------------------------------
<h3> Instruções para uso: </h3>

<p>1. Na classe br.com.itau.chatbottelegram.gateway.impl.DesafioMarcosBot, colocar o token e o nome do chatbot nos retornos dos métodos getBotUsername() e getBotToken</p>

<p>2. No application.properties colocar a key, secret e access tokens da aplicação criada no twitter. 
Ler a doc: https://developer.twitter.com/en/docs/authentication/oauth-1-0a/obtaining-user-access-tokens</p>

<p>Após preencher essas informações basta rodar a aplicação. </p>

<p>A camada REST está documentada com swagger, basta acessar http://servidor:8080/swagger-ui.html</p>

<p>Também existe o arquivo dockerfile na raiz do projeto, ele está funcional e é possível usá-lo para criar uma imagem.</p>

<p>Esse projeto também está pronto para rodar testes unitários. O plugin do jacoco está configurado e apto para execução.</p>