## nopCommerceMobile

    Web Application Testing Project using Java, Appium, and Cucumber.

# Description

    This project comprises automated tests for a web application using Java, Appium, and Cucumber.
    The tests are designed to validate the functionality of the application using the Behavior Driven Development (BDD) approach.

# Requirements
    * Java 17
    * Install Android Studio -> create emulator: Pixel7pro
    * install system variables:
                Win:    
                        JAVA_HOME = C:\Program Files\Java\jdk17
                        MAVEN_HOME = C:\Program Files\apache-maven-3.9.2
                        ANDROID_HOME = C:\Users\USER\AppData\Local\Android\Sdk
                        ANDROID_SDK_ROOT = C:\Users\USER\AppData\Local\Android\Sdk
                        
                Mac:    JAVA_HOME, MAVEN_HOME, ANDROID_HOME, ANDROID_HOME

    * Maven
    * Install nodejs + Appium (npm install appium@next)
    * Install UiAutomator2 driver for appium

# Installation

    Clone the repository: git clone https://github.com/vianat/nopCommerceMobile.git

    Download all dependencies: mvn clean install

# Running:
    1. Run emulator:  emulator @emulator_name

    1. Navigate to the project directory.

    2. For Mac, run:  (mvn test || true) && open  target/cucumber-reports/report.html
       For Win, run:  (mvn test || true) && start target/cucumber-reports/report.html

# Project Structure:

     src/java/java/pages/ - pom pages code
     src/test/java/steps/ - test code
     src/test/java/features/ - cucumber scenario files
