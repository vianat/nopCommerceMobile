@SmokeFeature
Feature: Store

  Background: open store app
    Given open store app

  @smoke
  Scenario: GeneralStoreEndToEndTest
    Given End to End app test

  @smoke
  Scenario: check toast message
    Given check toast message

  @smoke
  Scenario: scroll and find product and choose
    Given find product and choose