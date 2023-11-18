    //setup system variables :
        // install nodejs + appium (npm install appium@next)
        //JAVA_HOME = C:\Program Files\Java\jdk20
        //MAVEN_HOME = C:\Program Files\apache-maven-3.9.2
        //ANDROID_HOME = C:\Users\viana\AppData\Local\Android\Sdk
        //ANDROID_SDK_ROOT = C:\Users\viana\AppData\Local\Android\Sdk
        //path -> C:\Users\viana\AppData\Local\Android\Sdk\emulator
        //path -> C:\Users\viana\AppData\Local\Android\Sdk\platform-tools
        //path -> C:\Program Files\apache-maven-3.9.2\bin
        //path -> C:\Program Files\Java\jdk-20\bin
        //path -> C:\Program Files\Java\jdk-20\bin
        //path -> C:\Program Files\nodejs\



#RUN TESTS :
    #MAC:    
        (mvn test || true)  && open target/cucumber-reports/report.html
    #WIN:
        (mvn test || true) && start target/cucumber-reports/report.html