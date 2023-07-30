@SmokeFeature
Feature: Login

  @smoke
  Scenario: GeneralStoreEndToEndTest
    Given End to End app test

  @smoke
  Scenario: Open settings
    Given open gitsettings

  @Google
  Scenario: Open wifi settings
    Given open wifi settings

  @smoke
  Scenario: check toast message
    Given check toast message

  @smoke
  Scenario: scroll and find product and choose
    Given find product and choose