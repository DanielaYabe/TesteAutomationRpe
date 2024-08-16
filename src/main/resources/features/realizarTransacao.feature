@clientes
Feature: Gerenciar vendas
  Como um usuário do sistema
  Eu quero gerenciar minhas vendas
  Para poder incluir e listar as vendas realizadas por cada cliente


  Scenario Outline: Inclusao de novas transacoes com dados validos
    Given que clico para incluir nova transacao
    And seleciono o cliente "<nome>"
    And incluo o valor da compra "<valor>"
    When clico no botão salvar transacoes
    Then a transacao e realizada com sucesso

    Examples:
      | nome       | valor   |
      | Mario Bros | 1000    |