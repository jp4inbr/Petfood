# [] Visão Casos de Uso : Loja Petshop (PetFood)

## | Ator Principal (Funcionário/Gerente)

  - Login do Sistema
O Funcionário/Gerente deverá logar no sistema, utilizando seu login e senha

  - Venda e pesquisa de um produto
O funcionário/Gerente poderá pesquisar um produto, seja por código ou nome

  - Adicionar um produto a tela de venda
O funcionário/Gerente poderá adicionar um produto a tela de venda através da pesquisa de produto, após isso selecionará a quantidade que será enviada a tela.

  - Cancelar um produto
O funcionário/Gerente poderá cancelar um produto utilizando um botão no qual será possível a exclusão de apenas um produto ou da venda inteira.

  - Aplicar desconto
O funcionário/Gerente poderá aplicar um desconto em cima do produto escolhido, ou na venda inteira 

  - Finalização da venda 
O funcionário/Gerente poderá escolher uma forma de pagamento (pix, cartão ou dinheiro) de acordo com a preferência do cliente, após a escolha, ao clicar no botão “finalizar compra”, a compra será efetuada com sucesso.

  - Escolha das funcionalidades do Sistema (Gerente)
O gerente poderá escolher qual aba (Vendas, Cadastro de usuário, Estoque e Financeiro) deseja acessar.

  - Cadastro de produtos no estoque (Gerente)
O gerente poderá cadastrar novos produtos no estoque, adicionando seu nome, código, quantidade, preço de custo e preço de venda. 

  - Cadastro de usuário (Gerente)
O gerente poderá cadastrar novos usuário (funcionários) no sistema, adicionando seu nome, data de nascimento, CPF, vale transporte, vale alimentação e horário de trabalho.

  - Acesso ao financeiro  (Gerente)
O gerente terá acesso a aba do financeiro, que irá disponibilizar o histórico de vendas, que irá conter as vendas do dia com suas informações (data, valor total e o vendedor )

## | Ator Secundário: Sistema

  - Autenticação de Usuário 
O Sistema coletará os dados inseridos (login e senha) e validará se é um usuário cadastrado ou não

  - Informações dos produtos
O sistema deve informar o nome, código, valor unitário, quantidade inserida e 
valor total

  - Adição de produto na tela de venda
O sistema identifica o produto escolhido e o redireciona para a tela de vendas, possibilitando o usuário inserir a quantidade que será enviada, caso não tenha quantidade disponível, o sistema emitirá uma mensagem informando.

  - Cancelamento de uma venda/produto 
O sistema irá identificar a solicitação de cancelamento, e retirará o produto da venda ou cancelará a venda inteira. 

  - Aplicação de descontos
O sistema irá identificar o pedido de desconto em um item ou na venda inteira, e realizará a operação de acordo com a porcentagem informada.

  - Finalização da venda
O sistema irá identificar a forma de pagamento escolhida, e enviará uma
mensagem de confirmação de dados, após a confirmação, a venda será
realizada e computada. 

  - Atualizar Estoque
Após a finalização da venda, o sistema irá atualizar o estoque, subtraindo os produtos que foram escolhidos, com suas respectivas quantidades.

  - Atualizar histórico de vendas
Após a finalização, o sistema adicionará as informações da venda no histórico.

  - Funcionalidades do sistema (Gerente)
O sistema disponibilizará as abas  (Vendas, Cadastro de usuário, Estoque e
Financeiro) que o gerente poderá acessar.

  - Cadastro de produtos (Gerente)
O sistema irá adicionar o(s) produto(s) no estoque de acordo com as informações fornecidas pelo gerente

  - Cadastro de funcionário (Gerente)
O sistema irá adicionar o(s) funcionário(s) na lista de usuários de acordo com as informações fornecidas pelo gerente.

  - Acesso ao financeiro (Gerente)
O sistema disponibilizará as informações (data, valor total e o vendedor ) das vendas realizadas

# [] Visão de processo:

## | Visão de processo: Acesso ao sistema

  - Login
O usuário acessa a página inicial, inserindo seu usuário e senha no login.

  - Menu (Gerente)
O gerente acessa o menu e escolhe uma das funcionalidades (Vendas, Cadastro de usuário, Estoque ou Financeiro).

## | Visão de Processo: Tela de vendas

  - Pesquisa de Produto
Após o acesso, o funcionário/gerente têm a opção de pesquisar produtos utilizando a barra de pesquisa, seja por nome ou código de produto.

  - Selecionando o produto
O funcionário/gerente poderá selecionar o produto clicando no mesmo.

  - Alterando a quantidade 
Após selecionar o produto, poderão alterar a quantidade que será encaminhada.

  - Aplicar Desconto 
Terá a opção de aplicar desconto através de um botão, definindo a porcentagem que será aplicada.

  - Método de pagamento 
Após a aplicação do desconto, o usuário poderá escolher qual o método de pagamento desejado pelo cliente através de três opções (dinheiro, pix ou cartão).

  - Finalizando a compra
Após a aplicação do desconto e a seleção do método de pagamento, o usuário poderá finalizar a compra através de um botão “Finalizar compra” e após isso terá a confirmação da compra.

## | Visão de processo: Cadastro de usuário (Gerente)

  - Cadastro de funcionário
O gerente irá inserir as seguintes informações: Nome completo, Data de nascimento, CPF, valor de vale transporte, vale alimentação e horário de trabalho.

  - Finalização do cadastro
Após inserir todas as informações, o gerente poderá finalizar o cadastro do
funcionário utilizando um botão “Cadastrar”

## | Visão de processo: Estoque (Gerente)

  - Pesquisa de produto
Após o acesso ao estoque, o gerente poderá pesquisar um produto através da barra de pesquisa.

  - Alteração de produto 
Após a escolha de um produto, o gerente poderá modificar suas informações (preço, quantidade, nome e preço de custo)

  - Cadastro de produto
O gerente poderá cadastrar um novo produto através do botão “cadastrar novo produto” inserindo as suas informações.

## | Visão de processo: Financeiro (Gerente)

  - Visualização das finanças
O gerente poderá visualizar as finanças do dia, onde aparecerá o valor total das vendas, ou o valor vendido em cada forma de pagamento.

  - Histórico de vendas
O gerente poderá visualizar o histórico de vendas, onde aparecerá o vendedor responsável, a data e o valor da compra. 

# [] Visão Lógica

- Modelo de Dados
Produto, usuários e relatório

- Lógica de Negócios
Processamento de venda, Geração de Relatórios, Gerenciamento de Estoque e Gerenciamento de Usuários

## | Visão Lógica: Sistema de Vendas 

- Modelo de dados:

  - Produto:  A entidade Produto representa os itens que estão disponíveis para venda no estoque. Cada produto possui atributos como código, nome, preço e quantidade.

  - Usuário: A entidade Usuário representa os funcionários cadastrados no sistema. Cada usuário possui atributos como nome, data de nascimento, CPF, valor de vale transporte e alimentação, e horário de trabalho.

  - Relatório: A entidade relatório representa as vendas realizadas. Cada venda possui atributos como valor, forma_de_pagamento, data e usuário_responsável

- Lógica de Negócios

  - Processamento de Venda: A lógica de processamento de vendas inclui a validação dos dados da venda, como a disponibilidade do produto em estoque, o cálculo do preço total da venda, a forma de pagamento e a atualização do estoque após a venda.

  - Gerenciamento de Estoque: A lógica de gerenciamento de estoque monitora e atualiza a quantidade disponível de cada produto em estoque, garantindo que as vendas só sejam aceitas se houver estoque suficiente.

  - Geração de Relatórios: Pode haver lógica para gerar relatórios, como vendas diárias, ou total, descrevendo o usuário responsável e a data.

# [] Visão Física: PetFood

- Servidores e Ambiente de Hospedagem: O sistema PetFood irá ser hospedado localmente na máquina da loja

- Linguagem e Programação: A linguagem de programação utilizada no desenvolvimento do sistema foi Java e HMTL 

- Segurança da Informação: O sistema PetFood está de acordo com a LGPD (Lei Geral de Proteção de Dados Pessoais)

# [] Visão de Implementação

- Configuração da Infraestrutura: Provisionamento e configuração da máquina local, adaptada para suportar o sistema PetFood

- Segurança e acesso: Implementação de medidas de segurança caso a senha e usuário estejam inválidados, bloqueando acesso após 3 tentativas. 

- Testes de Integração: Realização de testes de integração para garantir que todas as partes dosistema funcionem corretamente juntas, incluindo interfaces de usuário,lógica de negócios.

- Testes de Desempenho e Escalabilidade: Será realizado os  testes de desempenho e escalabilidade para garantir que o sistema possa lidar com cargas de trabalho esperadas e que responda de forma rápida e eficiente.

- Backup e Recuperação de Desastres:. Configuração de rotinas de backup regulares e implementação de planos de recuperação de desastres para garantir a disponibilidade e a integridade dos dados.

- Treinamento de Operadores:. Será realizado um treinamento de operadores e administradores do sistema PetFood, designado para gerenciar e manter ainfraestrutura e o ambiente de produção de forma eficaz.

- Auditoria e Conformidade: Realização de auditorias regulares para garantir que o sistema esteja em conformidadecom padrões de segurança e regulamentações aplicáveis.
