
<p align="center">
  <img src="https://i.imgur.com/rqILBWA_d.webp?maxwidth=760&fidelity=grand" alt="Logo Petfood"></a>
</p>



# |1. Introdução

### |1.1. Propósito
- Fornecer um software que gerencia uma casa de ração, onde realizará serviços para o usuário durante seu horário de trabalho.
Ele será capaz de consultar, cadastrar e alterar produtos no estoque, além de emitir um relatório geral de vendas.Também será capaz de efetuar cadastro e controle de usuários.

### |1.2. Público Alvo
- Usuários internos da empresa PetFood.

### |1.3. Definições, Acrônimos e Abreviações 

<table>
<tr>
<td>N°</td>
<td>Nome</td>
<td>Descrição</td>
</tr>

<tr>
<td>01°</td>
<td>Login</td>
<td>Método de acesso ao sistema com informações do usuário</td>
</tr>

<tr>
<td>02°</td>
<td>Vendas(Pré-venda)</td>
<td>Tela onde será efetuada as vendas do estabelecimento</td>
</tr>

<tr>
<td>03°</td>
<td>Cadastro de Usuários</td>
<td>Tela onde será efetuado os cadastros dos usuários do estabelecimento</td>
</tr>

<tr>
<td>04°</td>
<td>Estoque</td>
<td>Tela onde será exibido todos os produtos do estabelecimento</td>
</tr>

<tr>
<td>05°</td>
<td>Financeiro</td>
<td>Tela onde será exibido o histórico de vendas (diárias e totais)</td>
</tr>

</table>


# |2. Descrição Geral do Produto

### |2.1. Situação Atual

 A empresa PetFood já possui um sistema de vendas no local, que atualmente apresenta os seguintes problemas: 

- Manutenção cara;
- Lentidão no sistema;
- Falha de registro de produtos;
- Falha no cadastro de usuário;
- Impossibilidade de mudar o preço;
- Falha no histórico de vendas;

### |2.2. Objetivos do Produto

- A empresa PetFood solicitou o desenvolvimento de um novo software para fazer um gerenciamento total da empresa, desde o começo, meio e o fim do processo de venda. Além disso, o produto deverá solucionar os problemas apresentados no sistema anterior.
- O software tratará das pendências de logística, a fim de organizar todos os processos relacionados às vendas e o bom funcionamento da empresa.

### |2.3. Benefícios do Projeto

- Inicialização rápida;
- Facilidade no processo de vendas;
- Maior controle de entrada/saída de produtos;
- Sistema de login de usuários eficiente;
- Facilidade no processo de busca de produtos;
- Controle de vendas individuais de cada usuário;
- Manutenção mais acessível e ágil;
 
### |2.4. Escopo

- Esse projeto trata-se da criação de um software de vendas para uma casa de ração, o escopo do futuro Sistema PetFood envolve as seguintes macro-funcionalidades:
<table>
  
<tr>
<td>N°</td>
<td>Módulo</td>
<td>Descrição</td>
</tr>
  
<tr>
<td>01°</td>
<td>Login de usuário</td>
<td>O sistema permitirá o acesso após o login de usuário</td>
</tr>

<tr>
<td>02°</td>
<td>Pesquisa de produtos</td>
<td>Permite que o usuário possa localizar um produto através de um barra de pesquisa</td>
</tr>

<tr>
<td>03°</td>
<td>Venda de produtos</td>
<td>Efetua a compra de um ou vários produtos, disponibilizando ferramentas para alterar quantidade, forma de pagamento, etc</td>
</tr>

<tr>
<td>04°</td>
<td>Cadastro de usuário</td>
<td>O sistema permitirá que o gerente cadastre novos usuários e suas informações no sistema, fazendo com que ele tenha acesso </td>
</tr>

<tr>
<td>05°</td>
<td>Cadastro de produtos</td>
<td>O sistema permitirá que o gerente cadastre novos produtos e suas informações no sistema, fazendo com que ele entre na lista do estoque</td>
</tr>

<tr>
<td>06°</td>
<td>Histórico de vendas</td>
<td>O sistema emitirá um histórico de vendas diárias e de datas anteriores</td>
</tr>

</table>

### |2.5. Atores

- Funcionário (Responsável por consultar produtos e realizar as vendas)
- Gerente (Responsável por incluir, excluir e alterar os produtos e os preços no estoque, cadastrar usuários e ter controle sobre o financeiro. Também poderá consultar produtos e realizar vendas)

<p align="center">
  <img src="https://i.imgur.com/JlrTSbB_d.webp?maxwidth=760&fidelity=grand" alt="Relação de hierarquia entre gerente e funcionário"></a>
</p>


### |2.6. Premissas

<table>

<tr>
<td>N°</td>
<td>Premissa</td>
<td>Descrição</td>
</tr>

<tr>
<td>01°</td>
<td>Data de implementação</td>
<td>É provável que o software seja implementado totalmente em um mês</td>
</tr>

<tr>
<td>02°</td>
<td>Manutenção</td>
<td>Será feita uma manutenção de mês em mês para que o sistema não apresente muitas falhas</td>
</tr>

<tr>
<td>03°</td>
<td>Desempenho</td>
<td>O sistema rodará tranquilamente no computador, caso os requisitos estejam satisfeitos</td>
</tr>

</table>

### |2.7. Itens fora do Escopo

- A coleta de dados não é necessária para as funcionalidades do software, respeitando as diretrizes da LGPD.

# |3. Requisitos Específicos

### |3.1. Requisitos Funcionais 

- RF01 - O sistema terá um login de admin que já estará cadastrado no sistema
- RF02 - O sistema deverá solicitar ao usuário seu login e senha e verificar se o mesmo possui permissão de acesso ao sistema.
- RF03 - O sistema encaminhará o usuário à tela de Vendas automaticamente após o login (Caso o usuário logado for um funcionário). 
- RF04 - O sistema deve permitir a criação, exclusão e alteração dos itens no estoque.
- RF05 - O sistema deve armazenar o histórico de vendas, incluindo o valor total, usuário responsável e a data.
- RF06 - O sistema deve permitir consultar e alterar o preço dos produtos cadastrados.
- RF07 - O sistema deve permitir a criação, exclusão e alteração dos usuários.

### |3.2. Requisitos não Funcionais

- RNF01 - O sistema rodará no Windows. (Operacional)
- RNF02 - O sistema será de linguagem simples e acessível. (Usabilidade)
- RNF03 - Somente usuários cadastrados terão acesso. (Segurança)
- RNF04 - O sistema deverá inicializar em menos de dois minutos. (Desempenho)
- RNF05 - O sistema estará disponível de acordo com o horário de funcionamento do estabelecimento.

### |3.4. Regras de negocios

- RN01 - Alteração dos produtos (Alterações serão permitidas somente se o usuário logado for um gerente).
- RN02 - Movimentação de estoque (Só poderá ser feito a venda de um item se houver uma quantidade equivalente no estoque).
- RN03 - Cadastro de usuários (Será permitido cadastro de usuário somente se o usuário logado for um gerente).
- RN04 - Acesso as funcionalidades do sistema(Será permitido acesso as funcionalidades do sistema caso o usuário for um gerente).
- RN05 - Consulta do relatório geral de vendas (Será permitido consultas ao relatório geral de vendas somente se o usuário logado for um gerente).

### |3.4. Restrições de Hardware

- Mínimo de 8GB de memória RAM.
- Necessário um SSD para a locação/armazenamento do sistema e base de dados.


### |3.5. Restrições de Software

- Será permitida a utilização somente no sistema Windows.


### |3.6. Restrições de Ambiente

- O acesso ao sistema será apenas em ambiente local do estabelecimento.

### |3.7. Lista de riscos 

<table>

<tr>
<td>N°</td>
<td>Riscos</td>
</tr>

<tr>
<td>01°</td>
<td>Surgimento de imprevistos com recurso</td>
</tr>

</table>

# |4. Diagramas UML

### |4.1. Diagrama de Classes

<p align="center">
 <img src="https://github.com/jp4inbr/Petfood/assets/161530938/e152abb2-77a1-4c3a-ac2f-960074b4ea41" alt="Diagrama de classes"></a>
</p>

### |4.2. Diagrama de Casos de uso

<p align="center">
 <img src="https://github.com/jp4inbr/Petfood/assets/161530938/f166864d-4e34-45ac-963f-a4bc523e6f87" alt="Diagrama de casos de uso"></a>
</p>

### |4.3. Diagrama de Atividades

<p align="center">
 <img src="https://github.com/jp4inbr/Petfood/assets/161530938/0f1162dd-126b-48e1-a055-9901fb52623e" alt="Diagrama de casos de uso"></a>
</p>


# |5. Apêndice

# |6. Aprovação

# |7. Histórias de usuário

## |7.1. Histórias de usuário Funcionário/Gerente

### |História 1 - Entrando no sistema (Complexidade 3:Implementar o formulário de login e a autenticação | Tempo: 1.5 dias)

- Como funcionário/gerente quero colocar as minhas informações (login, senha) para acessar o sistema.

### |Critério de aceitação 

- Campo para colocar o usuário.
- Campo para colocar a senha.

### |História 2 - Menu do sistema (Complexidade 5 Autenticação e redirecionamento condicional, criação do menu dinâmico | Tempo: 2.5 dias)

- Como funcionário/gerente , após o login , observo o menu do sistema , para que possa prosseguir a uma funcionalidade do sistema.

### |Critério de aceite

- Caso o usuário seja um funcionário, será automaticamente redirecionado para o campo **Realizar uma venda**.
- Caso o usuário seja um gerente, será redirecionado para o menu, onde aparecerão 9 campos: 
  - Campo **Cadastro de produtos** .
  - Campo **Realizar uma venda** .
  - Campo **Alterar estoque de um produto** .
  - Campo **Verificar Estoque** .
  - Campo **Alterar preço do produto** .
  - Campo **Excluir produto** .
  - Campo **Acessar histórico de venda** .
  - Campo **Cadastrar novo Funcionário** .
  - Campo **Voltar para tela inicial** .

### |História 3 - Realizar uma venda (Complexidade 8 Interface com múltiplos campos, lógica de vendas, cancelamento, pesquisa | Tempo: 4 dias)

- Como funcionário/gerente quero acessar a aba **Realizar uma venda** para vender/pesquisar um produto.

### |Critério de aceite

- Tela de Vendas.
- Campo com a lista de produtos escolhidos, quantidade, valor unitário, valor total (valor unitário x quantidade) e código.
- Campo para o pagamento .
- Campo para limpar lista de compras.
  - Caso escolha a opção limpar lista de compras, todos os produtos escolhidos sairão da venda.
- Campo para consulta de produtos.
- Campo onde mostra qual usuário está conectado.
- Campo para Logoff para sair do usuário conectado .
- Campo com o valor total dos produtos (soma dos valores totais).
- Campo Finalizar compra.

### |História 4 - Vendendo um produto (Complexidade 8 Lógica de busca e validação, integração com formas de pagamento | Tempo: 4 dias)

- Como funcionário/gerente quero escolher um produto para realizar a venda do mesmo.
  
### |Critério de aceitação
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

  
## |7.2. Histórias de usuário Gerente (Exclusivo)

### |História 1 - Cadastrando um usuário (Complexidade 5 Formulário complexo com validações | Tempo: 2.5 dias)

- Como gerente quero cadastrar um usuário para que um funcionário tenha acesso ao sistema.

### |Critério de aceitação

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
    - Ter no minimo 3 caracteres
- Campo onde será adicionado a senha.
  - A senha não deve:
    - Ser igual ao usuário.
  - A senha deve:
    - Ter pelo menos 5 caracteres.
    - Ter pelo menos 1 número.
    - Ter pelo menos 1 caractere especial.
    - Ter pelo menos 1 letra maiuscula.
- Campo onde será adicionado a data de nascimento.
- Campo onde será adicionado o cpf.
- Campo onde será adicionado o valor do vale transporte.
- Campo onde será adicionado o valor do vale alimentação.
- Campo onde será adicionado o horário de trabalho. 
 
### |História 2 - Adicionando um produto (Complexidade 3 Formulário de cadastro de produto | Tempo: 1.5 dias)

- Como gerente quero acessar o campo **Estoque** para adicionar um produto ao sistema.

### |Critério de aceitação

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
  
 
### |História 3 - Alterando preço de um produto (Complexidade 3 Formulário de atualização | Tempo: 1.5 dias)

- Como gerente quero acessar o campo **Estoque** para alterar o preço de um produto.

### |Critério de aceitação

- Campo **Estoque**.
- Campo com a lista de produtos.
- Campos com as informações do produto.
- Campo com o preço.
- Campo com a confirmação da alteração do produto.
- Mensagem produto alterado com sucesso.

### |História 4 - Alterando quantidade de um produto (Complexidade 3 Formulário de atualização | Tempo: 1.5 dias)

- Como gerente quero acessar o campo **Estoque** para alterar a quantidade de um produto.

### |Critério de aceitação

- Campo **Estoque**.
- Campo com a lista de produtos.
- Campos com as informações do produto.
- Campo com a quantidade.
- Campo com a confirmação da alteração do produto.
- Mensagem produto alterado com sucesso.

### |História 5 - Excluindo um produto (Complexidade 3 Formulário de exclusão | Tempo: 1.5 dias)

- Como gerente quero acessar o campo **Estoque** para excluir um produto.

### |Critério de aceitação

- Campo **Estoque**.
- Campo com a lista de produtos.
- Campo excluir produto.
- Campo com a confirmação da exclusão do produto.
- Mensagem produto excluído com sucesso.

### |História 6 - Acessando o histórico de vendas (Complexidade 5 Visualização de dados financeiros, filtragem e agregação | Tempo: 2.5 dias)

- Como gerente quero acessar a aba **Financeiro** para ver o histórico de vendas

### |Critério de aceitação

- Aba **Financeiro**
- Campo Venda do dia totais
- Campo Venda no cartão
- Campo Venda no Pix
- Campo Histórico de vendas por vendedor
  - Será informado qual o vendedor, a data e o total da venda 

# |8. Mapa de Histórias de Usuário 
 
<table>
<tr>
<td>Vendas</td>
<td>Controle de produtos</td>
<td>Controle de usuarios</td>
<td>Funcionalidades do sistema</td>
</tr>
<tr>
<td>7.1/ História 3 Aba de Vendas</td>
<td>7.2/ História 2 Adicionando um produto</td>
<td>7.2/ História 1 Cadastrando um usuário</td>
<td>7.1/ História 1 Entrando no sistema</td>
</tr>
<tr>
<td>7.1/ História 4 Vendendo um produto</td>
<td>7.2/ História 3 Alterando preço de um produto</td>
<td></td>
<td>7.1/ História 2 Menu do sistema</td>
</tr>
<tr>
<td></td>
<td>7.2/ História 4 Alterando quantidade de um produto</td>
<td></td>
<td>7.2/ História 6 Acessando o histórico de vendas</td>
</tr>
<tr>
<td></td>
<td>7.2/ História 5 Excluindo um produto</td>
<td></td>
<td></td>
</tr>
</table>

