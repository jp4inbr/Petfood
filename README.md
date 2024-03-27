# 1. Introdução

### 1.1. Propósito
- Fornecer um software que gerencia uma casa de ração, onde realizará serviços para o usuário durante seu horário de trabalho.
Ele será capaz de consultar, cadastrar e alterar produtos no estoque, além de emitir um relatório geral de vendas.Também será capaz de efetuar cadastro e controle de usuários.

### 1.2. Público Alvo
- Usuários internos da empresa PetFood.

### 1.3. Definições, Acrônimos e Abreviações 
- 


# 2. Descrição Geral do Produto

### 2.1. Situação Atual

 A empresa PetFood já possui um sistema de vendas no local, que atualmente apresenta os seguintes problemas: 

- Manutenção cara;
- Lentidão no sistema;
- Falha de registro de produtos;
- Falha no cadastro de usuário;
- Impossibilidade de mudar o preço;
- Falta de suporte aos usuários;
- Falha no histórico de vendas;

### 2.2. Objetivos do Produto

- A empresa PetFood solicitou o desenvolvimento de um novo software para fazer um gerenciamento total da empresa, desde o começo, meio e o fim do processo de venda. Além disso, o produto deverá solucionar os problemas apresentados no sistema anterior.
- O software tratará das pendências de logística, a fim de organizar todos os processos relacionados às vendas e o bom funcionamento da empresa.

### 2.3. Benefícios do Projeto

- Inicialização rápida;
- Facilidade no processo de vendas;
- Maior controle de entrada/saída de produtos;
- Sistema de login de usuários eficiente;
- Facilidade no processo de busca de produtos;
- Controle de vendas individuais de cada usuário;
- Manutenção mais acessível e ágil;
 
### 2.4. Escopo

### 2.5. Atores

- Funcionário (Responsável por consultar produtos e realizar as vendas)
- Gerente (Responsável por incluir, excluir e alterar os itens e os preços no estoque. Também poderá consultar produtos e realizar vendas)

<p align="center">
  <img src="https://i.imgur.com/JlrTSbB_d.webp?maxwidth=760&fidelity=grand" alt="Relação de hierarquia entre gerente e funcionário"></a>
</p>


### 2.6. Premissas

### 2.7. Itens fora do Escopo


# Requisitos Específicos

### 3.1. Requisitos Funcionais 

- RF01 - O sistema deverá solicitar ao usuário seu login e senha e verificar se o mesmo possui permissão de acesso ao sistema
- RF02 - O sistema deve permitir a criação, exclusão e alteração dos itens no estoque
- RF03 - O sistema deve armazenar o histórico de vendas, incluindo o valor total, usuário responsável e a data
- RF04 - O sistema deve permitir consultar e alterar o preço dos produtos cadastrados

### 3.2. Requisitos não Funcionais

- RNF01 - O sistema rodará no Windows (Operacional)
- RNF02 - O sistema será de linguagem simples e acessível. (Usabilidade)
- RNF03 - Somente usuários cadastrados terão acesso. (Segurança)
- RNF04 - O sistema deverá inicializar em menos de dois minutos. (Desempenho)

### 3.4. Regras de negocios
- RN01 - Alteração dos produtos (Somente será permitida alterações se o usuário logado for um gerente).
- RN02 - Movimentação de estoque (Só poderá ser feito a venda de um item se houver uma quantidade equivalente no estoque).
- RN03 - Cadastro de usuários (Será permitido cadastro de usuário somente se o usuário logado for um gerente).
- RN04 - Consulta do relatório geral de vendas (Será permitido consultas ao relatório geral de vendas somente se o usuário logado for um gerente).


### 3.4. Restrições de Hardware
- Mínimo de 8GB de memória RAM.
- Necessário um SSD para a locação/armazenamento do sistema e base de dados.


### 3.5. Restrições de Software
- Será permitida a utilização somente no sistema Windows.


### 3.6. Restrições de Ambiente
- O acesso ao sistema será apenas em ambiente local.

### 3.7. Lista de riscos 


# 4. Diagramas UML

### 4.1. Identificação dos Casos de Uso

### 4.2. Diagramas de Casos de Uso

### 4.3. Diagrama de Atividades

### 4.4. Diagrama de Classes

### 4.5. Diagrama de Objetos

### 4.6. Diagrama de Sequência 

### 4.7. Diagrama de Estados


# 5. Apêndice

# 6. Aprovação

# Histórias de usuário 

## Histórias de usuário Funcionário

### História 1 - Entrando no sistema

- Como funcionário quero entrar no sistema da loja

### Critério de aceitação 

- Campo para colocar o usuário
- Campo para colocar a senha
- Campo esqueci a senha

### História 2 - Consultando produtos

- Como funcionário quero pesquisar um produto da loja

### Critério de aceitação 

- Campo para categoria de produtos
- Campo para pesquisa de produtos 
- Lista com acesso a categoria escolhida
- Lista com acesso completo aos produtos

### História 3 - Escolhendo o produto

- Como funcionário quero escolher um produto da loja para encaminhá-lo ao setor de vendas ou para consultar o seu preço/quantidade no estoque

### Critério de aceitação

- Campo com a mercadoria escolhida
- Preço da mercadoria
- Quantidade restante no estoque 
- Campo com a quantidade de quantos produtos serão vendidos

### História 4 - Vendendo um produto

- Como funcionário estou realizando a venda de um produto
  
### Critério de aceitação

- Campo com forma de pagamento
- Não permite vendas com quantidades que ultrapassam o estoque
- Campo com a confirmação de valor, quantidade e forma de pagamento

  
## Histórias de usuário Gerente 

### História 1 - Entrando no sistema

- Como gerente quero entrar no sistema da loja

### Critério de aceitação 

- Campo para colocar o usuário
- Campo para colocar a senha
- Campo esqueci a senha

### História 2 - Consultando produtos

- Como gerente quero pesquisar um produto da loja

### Critério de aceitação 

- Campo para categoria de produtos
- Campo para pesquisa de produtos 
- Lista com acesso a categoria escolhida
- Lista com acesso completo aos produtos

### História 3 - Escolhendo o produto

- Como gerente quero escolher um produto da loja para encaminhá-lo ao setor de vendas ou para consultar o seu preço/quantidade no estoque

### Critério de aceitação

- Campo com a mercadoria escolhida
- Preço da mercadoria
- Quantidade restante no estoque 
- Campo com a quantidade de quantos produtos serão vendidos

### História 4 - Vendendo um produto

- Como gerente estou realizando a venda de um produto
  
### Critério de aceitação

- Campo com forma de pagamento
- Não permite vendas com quantidades que ultrapassam o estoque
- Campo com a confirmação de valor, quantidade e forma de pagamento

