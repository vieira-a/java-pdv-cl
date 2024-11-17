# Protótipo PDV com MVC via Linha de Comando

Este projeto é um protótipo de um Sistema de Ponto de Venda (PDV), desenvolvido utilizando o padrão de arquitetura MVC (Model-View-Controller). O sistema foi implementado em Java e é executado via linha de comando, onde é possível cadastrar produtos, clientes, realizar vendas e consultar relatórios de compras. A aplicação foi desenvolvida como parte dos requisitos acadêmicos para a matéria de Programação Orientada a Objetos, do curso de Bacharelado em Engenharia de Software.

## Funcionalidades

- Cadastro de Produtos: Permite cadastrar novos produtos, especificando informações como ID, descrição, preço e saldo em estoque.
- Cadastro de Clientes: Permite cadastrar clientes através de um CPF único, nome e outros dados relacionados.
- Realização de Vendas: Permite registrar uma venda, associando um cliente a um produto, com a quantidade comprada e o total da venda.
- Relatório de Compras por Cliente: Exibe um relatório detalhado de compras realizadas por um cliente específico, incluindo produto, quantidade e total gasto.
- Relatório de Produtos Cadastrados: Exibe todos os produtos cadastrados no sistema, com informações sobre ID, descrição, preço e saldo disponível.

## Estrutura do Projeto

O projeto segue o padrão MVC (Model-View-Controller), onde:

- Model: Contém as classes que representam as entidades principais do sistema, como Produto, Cliente e Compra.
- View: Responsável pela interação com o usuário, exibindo menus e relatórios na linha de comando.
- Controller: Contém a lógica de negócio que manipula as entidades e coordena as ações entre a view e o model.

Pacotes:

- controller: Contém os controladores que gerenciam a lógica de negócio.
- model: Contém as classes que representam as entidades de negócio (Produto, Cliente, Compra).
- view: Contém a classe Menu que exibe os menus e interage com o usuário.
- store: Contém a classe DataStore que simula o armazenamento em memória das entidades.

## Como Rodar o Sistema

### Requisitos

- JDK 8 ou superior

#### Passos

1. Clone o repositório:
`git clone https://github.com/seu-usuario/pdv-mvc-linha-de-comando.git`

2. Entre na pasta do projeto:
`cd pdv-mvc-linha-de-comando`

3. Compile e execute o projeto:
`javac src/**/*.java -d bin`
`java -cp bin view.Menu`

## Exemplo de Execução

1. Menu Inicial:
```
Digite uma opção:
1. Cadastrar Produto
2. Cadastrar Cliente
3. Realizar Venda
4. Relatório de Compras por Cliente
5. Relatório de Produtos Cadastrados
```
2. Cadastro de Produto:
```
Digite o ID do produto:
123
Digite a descrição do produto:
CAMISA
Digite o preço do produto:
59.90
Digite o saldo do produto:
50
Produto cadastrado com sucesso!
```
3. Relatório de Produtos:
```
Relatório de Produtos
ID                  Descrição        Preço      Saldo      
============================================================
123                 CAMISA          59.90      50
============================================================
```
