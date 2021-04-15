Feature: Calcular valor de Produtos
      Como um utilizador
      Quero escolher produtos
      Para calcular o preco

      Scenario Calcular preco
            Given I open Chrome and launch the application
            When I select type
            And I select type
            And I select support plan
            And I write monthly duration of
            And I click in calculate price button
            Then I validate price is
