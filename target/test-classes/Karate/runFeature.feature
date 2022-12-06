Feature: Test Page

  Scenario: Get Data
    Given url 'http://localhost:8080/api/brands/getall'
    When method GET
    Then status 200


