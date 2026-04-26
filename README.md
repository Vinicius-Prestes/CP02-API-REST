Integrantes:
David Gabriel Gomes Fernandes 
Denise Senise 
Larissa Rodrigues Lapa
Mateus Leme 
Vinicius Augusto Neves Prestes 

**Order Management API - Checkpoint 2**

API REST para gerenciamento de pedidos desenvolvida com Java 21, Spring Boot 4 e banco de dados H2.

Como Executar
Certifique-se de ter o JDK 21 instalado
Execute a classe Checkpoint2Application.java

A API estará disponível em:

http://localhost:8085/orders
Endpoints (CRUD)
Operação	Método	Endpoint	Descrição	Status Sucesso

Criar	POST	/orders	Cria um novo pedido	201 Created

Listar	GET	/orders	Retorna todos os pedidos	200 OK

Buscar	GET	/orders/{id}	Busca pedido por ID	200 OK

Atualizar	PUT	/orders/{id}	Atualiza nome e valor	200 OK

Deletar	DELETE	/orders/{id}	Remove o pedido	204 No Content

Tecnologias usadas
Lombok: Automação de boilerplate (@Getter, @Setter, etc.)
JPA / Hibernate: Persistência de dados e mapeamento de tabelas

H2 Console: Acesso ao banco em:

http://localhost:8085/h2-console
Validation: Uso de @Valid para garantir integridade dos dados
