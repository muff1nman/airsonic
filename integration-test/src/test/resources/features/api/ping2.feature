Feature: Ping 2 API

  Scenario: Airsonic2 responds to ping requests
    When A ping request is sent
    Then A required parameter response is received
