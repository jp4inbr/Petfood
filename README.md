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
- Gerente (Responsável por incluir, excluir e alterar os produtos e os preços no estoque, cadastrar usuários e ter controle sobre o financeiro. Também poderá consultar produtos e realizar vendas)

<p align="center">
  <img src="https://i.imgur.com/JlrTSbB_d.webp?maxwidth=760&fidelity=grand" alt="Relação de hierarquia entre gerente e funcionário"></a>
</p>


### 2.6. Premissas

### 2.7. Itens fora do Escopo


# 3. Requisitos Específicos

### 3.1. Requisitos Funcionais 

- RF01 - O sistema deverá solicitar ao usuário seu login e senha e verificar se o mesmo possui permissão de acesso ao sistema.
- RF02 - O sistema encaminhará o usuário à tela de pré-vendas automaticamente após o login (Caso o usuário logado for um funcionário). 
- RF03 - O sistema deve permitir a criação, exclusão e alteração dos itens no estoque.
- RF04 - O sistema deve armazenar o histórico de vendas, incluindo o valor total, usuário responsável e a data.
- RF05 - O sistema deve permitir consultar e alterar o preço dos produtos cadastrados.
- RF06 - O sistema deve permitir a criação, exclusão e alteração dos usuários.

### 3.2. Requisitos não Funcionais

- RNF01 - O sistema rodará no Windows. (Operacional)
- RNF02 - O sistema será de linguagem simples e acessível. (Usabilidade)
- RNF03 - Somente usuários cadastrados terão acesso. (Segurança)
- RNF04 - O sistema deverá inicializar em menos de dois minutos. (Desempenho)
- RNF05 - O sistema estará disponível de acordo com o horário de funcionamento do estabelecimento.

### 3.4. Regras de negocios

- RN01 - Alteração dos produtos (Alterações serão permitidas somente se o usuário logado for um gerente).
- RN02 - Movimentação de estoque (Só poderá ser feito a venda de um item se houver uma quantidade equivalente no estoque).
- RN03 - Cadastro de usuários (Será permitido cadastro de usuário somente se o usuário logado for um gerente).
- RN04 - Acesso as funcionalidades do sistema(Será permitido acesso as funcionalidades do sistema caso o usuário for um gerente).
- RN05 - Consulta do relatório geral de vendas (Será permitido consultas ao relatório geral de vendas somente se o usuário logado for um gerente).

### 3.4. Restrições de Hardware

- Mínimo de 8GB de memória RAM.
- Necessário um SSD para a locação/armazenamento do sistema e base de dados.


### 3.5. Restrições de Software

- Será permitida a utilização somente no sistema Windows.


### 3.6. Restrições de Ambiente

- O acesso ao sistema será apenas em ambiente local do estabelecimento.

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

# 7. Histórias de usuário

## 7.1. Histórias de usuário Funcionário/Gerente

### História 1 - Entrando no sistema

- Como funcionário/gerente quero colocar as minhas informações (login, senha) para acessar o sistema.

### Critério de aceitação 

- Campo para colocar o usuário.
- Campo para colocar a senha.

### História 2 - Menu do sistema

- Como funcionário/gerente , após o login , observo o menu do sistema , para que possa prosseguir a uma funcionalidade do sistema.

### Critério de aceite

- Caso o usuário seja um funcionário, será automaticamente redirecionado para o campo de vendas.
- Caso o usuário seja um gerente, será redirecionado para o menu, onde aparecerá 4 campos:
  - Campo para **Vendas** .
  - Campo para **Cadastro de usuários** .
  - Campo para **Estoque** .
  - Campo para **Financeiro** .

### História 3 - Aba de Vendas

- Como funcionário/gerente quero acessar a aba de **Vendas** para vender/pesquisar um produto.

### Critério de aceite

- Tela de Vendas.
- Campo com a lista de produtos escolhidos, quantidade, valor unitário, valor total (vlor unitário x quantidade) e código.
- Campo com as formas de pagamento (dinheiro, cartão, pix).
- Campo Aplicar desconto.
- Campo para cancelar venda.
  - Caso escolha a opção cancelar venda, todos os produtos escolhidos sairão da venda.
- Campo para cancelar um produto.
  - Caso escolha a opção cancelar um produto, será permitido a escolha de um produto para ser retirado da venda .
- Campo para pesquisa de produtos.
- Campo onde mostra qual usuário está conectado.
- Campo para Logoff para sair do usuário conectado .
- Campo com o valor total dos produtos (soma dos valores totais).
- Campo Finalizar compra.

### História 4 - Vendendo um produto

- Como funcionário/gerente quero escolher um produto para realizar a venda do mesmo.
  
### Critério de aceitação
- Tela de vendas.
- Campo para pesquisa de produtos.
- Campo com a lista de produtos.
  - Após selecionar o produto, escolherá a quantidade que será vendida, e então o produto será redirecionado para a venda.
- Produtos com quantidades zeradas não serão encaminhados para a venda e aparecerá uma mensagem na tela:
  - ''O produto não pode ser vendido pois não há quantidade no estoque''.
- Campo com a lista de produtos escolhidos , onde é mostrado nome, preço, quantidade e código.
- Campo com forma de pagamento.
  - Caso seja pix, um QRCODE é gerado para a efetuação do pagamento.
- Não permite vendas com quantidades que ultrapassam o estoque.
- Campo com a confirmação de valor, quantidade e forma de pagamento.

  
## 7.2. Histórias de usuário Gerente (Exclusivo)

### História 1 - Cadastrando um usuário

- Como gerente quero cadastrar um usuário para que um funcionário tenha acesso ao sistema.

### Critério de aceitação

- Campo **Cadastrar Usuário**.
- Campo onde será adicionado o nome completo.
  - Os nomes dos usuários não podem ser iguais uns aos outros.
- Campo onde será adicionado o login.
  - O login não deve:
    - Ter caracteres especiais (`,&,_,).
    - Ter mais de 10 caracteres.
    - Ter espaço.
    - Ter números.
  - O login deve :
    - Ter no mínimo 3 caracteres.
- Campo onde será adicionado a senha.
  - A senha não deve:
    - Ser igual ao usuário.
  - A senha deve:
    - Ter pelo menos 5 caracteres.
    - Ter pelo menos 1 número.
    - Ter pelo menos 1 caractere especial.
    - Ter pelo menos 1 letra maiúscula.
- Campo onde será adicionado a data de nascimento.
- Campo onde será adicionado o cpf.
- Campo onde será adicionado o valor do vale transporte.
- Campo onde será adicionado o valor do vale alimentação.
- Campo onde será adicionado o horário de trabalho. 
 
### História 2 - Adicionando um produto

- Como gerente quero acessar o campo **Estoque** para adicionar um produto ao sistema.

### Critério de aceitação

- Campo **Estoque**.
- Campo com a lista de produtos (Exibindo nome, preço, quantidade, preço de custo.
- Campo Cadastrar novo produto.
  - Campo onde será inserido o nome.
  - Campo onde será inserido o preço.
  - Campo onde será inserido o preço de custo.
  - Campo onde será inserido a quantidade.
  - Campo onde será inserido o código.
  - Campo para confirmação de dados.
    - Mensagem produto adicionado com sucesso.
  
 
### História 3 - Alterando preço de um produto

- Como gerente quero acessar o campo **Estoque** para alterar o preço de um produto.

### Critério de aceitação

- Campo **Estoque**.
- Campo com a lista de produtos.
- Campos com as informações do produto.
- Campo com o preço.
- Campo com a confirmação da alteração do produto.
- Mensagem produto alterado com sucesso.

### História 4 - Alterando quantidade de um produto

- Como gerente quero acessar o campo **Estoque** para alterar a quantidade de um produto.

### Critério de aceitação

- Campo **Estoque**.
- Campo com a lista de produtos.
- Campos com as informações do produto.
- Campo com a quantidade.
- Campo com a confirmação da alteração do produto.
- Mensagem produto alterado com sucesso.

### História 5 - Excluindo um produto

- Como gerente quero acessar o campo **Estoque** para excluir um produto.

### Critério de aceitação

- Campo **Estoque**.
- Campo com a lista de produtos.
- Campo excluir produto.
- Campo com a confirmação da exclusão do produto.
- Mensagem produto excluído com sucesso.

### História 6 - Acessando o histórico de vendas

- Como gerente quero acessar a aba **Financeiro** para ver o histórico de vendas

### Critério de aceitação

- Aba **Financeiro**
- Campo Venda do dia totais
- Campo Venda no cartão
- Campo Venda no Pix
- Campo Histórico de vendas por vendedor
  - Será informado qual o vendedor, a data e o total da venda 

# 8. Mapa de Histórias de Usuário 

### Vendas

- 7.1/ História 3 - Aba de Vendas
- 7.1/ História 4 - Vendendo um produto

### Controle de produtos

- 7.2/ História 2 - Adicionando um produto
- 7.2/ História 3 - Alterando preço de um produto
- 7.2/ História 4 - Alterando quantidade de um produto
- 7.2/ História 5 - Excluindo um produto

### Controle de usuarios

- 7.2/ História 1 - Cadastrando um usuário

### Funcionalidades do sistema

- 7.1/ História 1 - Entrando no sistema
- 7.1/ História 2 - Menu do sistema
- 7.2/ História 6 - Acessando o histórico de vendas
  




