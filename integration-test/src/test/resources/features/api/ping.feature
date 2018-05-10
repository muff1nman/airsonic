Feature: Ping API

  Scenario: Airsonic responds to ping requests
    When A ping request is sent
    Then A ping response is received
