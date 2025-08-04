src/
 └── main/
     └── java/
         ├── POM/                ← page classes (inherit BaseClass)
         │    ├── LoginPage.java
         │    ├── HomePage.java (TBD)
         │    └── ProfilePage.java (TBD)
         ├── Utility/            ← framework backbone
         │    ├── BaseClass.java         ← contains config, locators, driver
         ├── CucumberFeatures/   ← .feature files
     └── resources/
         ├── config.properties
         ├── locators.properties
 └── test/
     └── java/
         ├── StepDefs/           ← glue code
         │    └── LoginSteps.java
         ├── Runner/            ← runner classes
         │    └── TestNGRunner.java
