Feature: Acessar a lupa de pesquisar e fazer as buscas

  @sucess @lupaPesquisaPage
  Scenario: Accessar a tela do blog e fazer pesquisas na lupa Termo relevante
    Given estou na home page do blog agibank
    And clico na lupa para fazer as buscas no blog
    And deve abrir um campo de pesquisa e aparece o botão pesquisar
    When preencho o campo com termo "agibank" e clico no botao pesquisar
    Then a mensagem de resultados da busca deve conter o termo de busca agibank

  Scenario: Accessar a tela do blog e fazer pesquisas na lupa termo que não existe no blog
    Given estou na home page do blog agibank
    And clico na lupa para fazer as buscas no blog
    And deve abrir um campo de pesquisa e aparece o botão pesquisar
    When preencho o campo com termo "copa do mundo" e clico no botao pesquisar
    Then a mensagem de resultados da busca deve conter o termo de Nenhum resultado

  Scenario: Accessar a tela do blog e fazer pesquisas na lupa sem preencher o campo
    Given estou na home page do blog agibank
    And clico na lupa para fazer as buscas no blog
    And deve abrir um campo de pesquisa e aparece o botão pesquisar
    When clicar no botao de pesquisa sem preencher o campo
    Then a mensagem de resultados da busca deve fitrar todos os resultados abordando todos os temas do blog

  Scenario: Accessar a tela do blog e fazer pesquisas na lupa termo com caracates especiais
    Given estou na home page do blog agibank
    And clico na lupa para fazer as buscas no blog
    And deve abrir um campo de pesquisa e aparece o botão pesquisar
    When preencho o campo com termo "@#$%##$%%" e clico no botao pesquisar
    And a mensagem de resultados da busca deve conter o termo de Nenhum resultado

  Scenario: Accessar a tela do blog e fazer pesquisas na lupa termo com com espaçamentos
    Given estou na home page do blog agibank
    And clico na lupa para fazer as buscas no blog
    And deve abrir um campo de pesquisa e aparece o botão pesquisar
    When preencho o campo com termo "                    " e clico no botao pesquisar
    Then a mensagem de resultados da busca deve conter o termo de Nenhum resultado

  Scenario: Accessar a tela do blog apos pesquisa clicar em um link
    Given estou na home page do blog agibank
    And clico na lupa para fazer as buscas no blog
    And deve abrir um campo de pesquisa e aparece o botão pesquisar
    When preencho o campo com termo "agibank" e clico no botao pesquisar
    Then clicar no link apos a pesquisa

  Scenario: Accessar a tela do blog apos a pesquisa ir para proxima pagina
    Given estou na home page do blog agibank
    And clico na lupa para fazer as buscas no blog
    And deve abrir um campo de pesquisa e aparece o botão pesquisar
    When preencho o campo com termo "agibank" e clico no botao pesquisar
    Then apos fazer a pesquisa clicar na pagina para ser direcionado para outra pagina