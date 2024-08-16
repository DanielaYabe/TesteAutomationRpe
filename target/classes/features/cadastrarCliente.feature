@clientes
Feature: Gerenciar clientes
  Como um usuário do sistema
  Eu quero gerenciar meus clientes
  Para poder incluir e listar os dados deles de forma eficiente


  Scenario Outline: Inclusao de novos clientes com dados validos
    Given que clico para incluir novos clientes
    And incluo o nome "<nome>"
    And incluo o cpf "<cpf>"
    And incluo o status "<status>"
    And incluo o saldo "<saldo>"
    When clico no botão salvar clientes
    Then o cliente e salvo com sucesso

    Examples:
      | nome           | cpf            | status   | saldo  |
      | Gabriela Souza | 83584656702    | Ativo    | 1000   |