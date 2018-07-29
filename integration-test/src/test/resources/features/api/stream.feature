Feature: Stream API

  Background:
    Given Media file stream/piano.mp3 is added

  Scenario: Airsonic sends stream data
    When A stream request is sent
    Then The response should have some bytes
    # TODO check length
