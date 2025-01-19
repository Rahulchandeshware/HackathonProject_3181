Tutorials Ninja - Automated Testing with Selenium, Java, and Cucumber
Welcome to the Tutorials Ninja GitHub repository! This project is a comprehensive automated testing solution for the Tutorials Ninja website. The testing framework uses Selenium WebDriver, Java, Cucumber, and Page Object Model (POM) to verify the key functionalities of the website.

The project was developed as part of a Hackathon initiative by a team of two collaborators, with the goal of automating the testing process and ensuring the website's features are working as expected. The test suite includes 76 test cases, covering the major functionalities of the site.

Table of Contents
Project Overview
Features
Technologies Used
Test Coverage
Project Structure
Getting Started
Running Tests
Contributors
License
Project Overview
Tutorials Ninja is an e-learning platform that offers tutorials on various topics. The purpose of this project is to ensure the core features of the website are functioning properly by running automated tests. The project is built with Selenium and Cucumber to simulate user interactions and verify that the application behaves as expected.

This Hackathon project was split among two team members, with each collaborator contributing to different parts of the framework.

Features
The automated tests cover the following features of the Tutorials Ninja website:

User Login: Validates the login process for registered and unregistered users.
Search Functionality: Ensures that the search bar works correctly.
Product Page: Verifies the functionality of product details and navigation.
Cart Operations: Test adding and removing items from the cart.
Checkout Process: Validates the checkout flow and order submission.
Profile Management: Ensures users can update and manage their profiles.
Technologies Used
Selenium WebDriver: Used for automating the web interactions.
Java: The primary programming language for implementing test cases.
Cucumber: A testing framework used to define behavior-driven test scenarios.
Page Object Model (POM): A design pattern for creating object-oriented classes that serve as an interface to the web page's elements.
JUnit: Used for managing and running tests.
Maven: Used for project management and dependency resolution.
Test Coverage
This project includes 76 test cases, covering various aspects of the website's functionality. These test cases ensure that both the frontend and backend features are well-tested. The main functionalities such as login, search, checkout, and cart operations are all thoroughly validated.

Project Structure
The project follows a modular structure with clearly separated components:

bash
Copy
Tutorials-Ninja/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── stepDefinitions/   # Cucumber step definitions
│   │       └── pageObjects/        # Page Object Model classes
│   ├── test/
│   │   └── java/
│   │       └── runner/             # Cucumber test runner
│   │       └── steps/              # Cucumber feature step files
├── pom.xml                          # Maven configuration
└── README.md                        # This README file
Getting Started
To get started with this project, follow these steps:

Clone the repository: git clone https://github.com/your-username/Tutorials-Ninja.git

Install dependencies: Make sure you have Java and Maven installed on your system. Then, run the following command to install the necessary dependencies:

mvn install

Set up WebDriver: Make sure you have the appropriate Selenium WebDriver for your browser installed and configured.

Running Tests
To run the Cucumber tests, use the following Maven command:

mvn test
This will execute all the tests defined in the Cucumber feature files, running them in the order specified.

You can also run the tests with a specific browser by updating the desired capabilities in the BaseTest class.

Collaborator 1: [Your Name] (Team Member 1)
Collaborator 2: [Your Name] (Team Member 2)
Special thanks to both team members for their collaboration and hard work during the Hackathon!

License
This project is open-source
