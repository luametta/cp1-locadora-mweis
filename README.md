🎬 Locadora API

API desenvolvida em Java com Spring Boot para gerenciamento de uma locadora de filmes. O sistema permite cadastrar, listar e organizar filmes e gêneros, simulando o catálogo de uma locadora.

📌 Sobre o Projeto

Este projeto foi desenvolvido com o objetivo de praticar conceitos de:

API REST
Spring Boot
Arquitetura MVC
Persistência de dados com JPA
Organização em camadas (Controller, Model, Repository)
🚀 Tecnologias Utilizadas
Java
Spring Boot
Maven
Spring Data JPA
H2 Database (ou outro configurado no application.properties)
📁 Estrutura do Projeto
src/main/java/br/fiap/cp1/locadora
│
├── controller     # Camada de controle (endpoints da API)
├── model          # Entidades do sistema (Filme, Genero)
├── repository     # Interfaces de acesso ao banco de dados
└── LocadoraAPI    # Classe principal (main)
🎥 Funcionalidades
📌 Filmes
Cadastrar filme
Listar filmes
Buscar filme por ID
Remover filme
📌 Gêneros
Cadastrar gênero
Listar gêneros
📌 Catálogo
Organização de filmes por gênero
🔗 Endpoints (Exemplos)
🎬 Filme
GET /filmes → Lista todos os filmes
POST /filmes → Cadastra um novo filme
GET /filmes/{id} → Busca filme por ID
DELETE /filmes/{id} → Remove um filme
🎭 Gênero
GET /generos → Lista todos os gêneros
POST /generos → Cadastra um novo gênero
⚙️ Como Executar o Projeto
Pré-requisitos:
Java 17+ (ou versão compatível)
Maven
Passos:
# Clone o repositório
git clone <url-do-repositorio>

# Acesse a pasta
cd cp1-locadora-mweis-main

# Execute o projeto
./mvnw spring-boot:run

Ou, no Windows:

mvnw.cmd spring-boot:run
🛠️ Configurações

As configurações da aplicação estão no arquivo:

src/main/resources/application.properties

Você pode alterar:

Porta do servidor
Banco de dados
Configurações do JPA
🧪 Testes

O projeto possui estrutura básica de testes:

src/test/java/br/fiap/cp1/locadora

Para rodar:

./mvnw test
📚 Aprendizados

Este projeto aborda conceitos importantes como:

Criação de APIs REST
Boas práticas com Spring Boot
Separação de responsabilidades
Manipulação de dados com repositórios
👩‍💻 Autor

Projeto desenvolvido para fins acadêmicos.
