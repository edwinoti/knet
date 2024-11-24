# knet

Java Automation Project - Setup and Run Instructions
Prerequisites

Ensure you have the following installed on your system:

        Verify installation by running:

    java -version

Apache Maven (for dependency management)

    Verify installation by running:

        mvn -version

    IDE (e.g.Eclipse)

    WebDriver (if using Selenium for browser automation)
        Ensure the driver executable is added to your system's PATH.

Project Setup
1. Clone the Repository

Clone the project repository from your version control system:

git clone https://github.com/edwinoti/knet.git/
cd knet

2. Install Dependencies

Use Maven to install the necessary dependencies:

mvn clean install

This will download and configure all required libraries listed in the pom.xml file.
3. Configure Environment Variables

4. Test Configurations

Check the configuration files for:
    Test URLs
    Any other environment-specific settings

These may be located in src/test/resources or a similar directory.
Running the Tests
1. Run Tests via Maven

Execute the test suite using Maven:

mvn test

2. Run Tests via TestNG (if applicable)

    Open the testng.xml file in your project.
    Execute the tests directly from your IDE.

3. Run Tests via Command Line

Use TestNG or JUnit commands to run specific tests:

java -cp <compiled_classes_directory> org.testng.TestNG testng.xml

Test Reports

    Test reports are typically generated in the target directory.
