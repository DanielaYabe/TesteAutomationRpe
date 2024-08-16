@clientes
Feature: Gerenciar clientes
  Como um usuário do sistema
  Eu quero gerenciar meus clientes
  Para poder incluir e listar os dados deles de forma eficiente


  Scenario Outline: Inclusao de novos clientes com dados validos
    Given que estou na tela home
    And navego até a tela de inclusao de novos clientes
    And informo <nome>
    And informo <cpf>
    And informo <status>
    And informo <saldo>
    When clico no botão salvar
    Then o cliente e salvo com sucesso

    Examples:
      | nome           | cpf            | status   | saldo  |
      | Gabriela Souza | 83584656702    | ativo    | 1000   |