@login
  Feature: Login de Usuário
    Como um usuário
    Eu quero fazer login
    Para acessar a página inicial


  Scenario Outline: Login com credenciais válidas
    Given que estou na página de login
    And incluo o usuário "<user>"
    And incluo a senha "<password>"
    When clico no botão sign in
    Then sou direcionada para a página home

    Examples:
      | user  | password |
      | admin | admin    |

