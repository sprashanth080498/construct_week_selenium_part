Project Title: Selenium based automation 

Project Description:

  1. Selenium based automation project using the cucumber framework.
  2. Selenium: Selenium is an open source framework for automated browser testing and web application automation providing us a suite of tools to communicate with the web browsers programmatically.
  3. In selenium we have four main components they are: Selenium IDE, selenium webdriver ,Selenium grid and selenium RC.
     Selenium IDE- for record and playback options
     Selenium webdriver-for programmatic browser control
     Selenium grid - for parallel test execution
     Selenium RC- for simple browser actions and linear executions with the use of programming language.

Architecture of selenium:




Application Name:
  
  Tutorial_ninja application
  
Walk through video of the code base:
  
    google drive url -> https://drive.google.com/file/d/18meTxuLNxHFG9wRmakJ0bJErtH6EMZQg/view?usp=drive_link

Project questionaire video link:

    google drive link -> https://drive.google.com/file/d/1Yx6o_zU6x5h7QjlSnv_P6uce7yZYBTK0/view?usp=drive_link
    
Features:
  
  Login functionality
  Add to cart functionality 
  
Installation and setup:
  
  1.Install the spring tool suite ide
  2.Create a new maven project
  3.Create a new package in the src/test/resources and add a feature file with .feature extension in it.
  4.Create two new packages in the src/test/java and add steps file in one package and a runner file in another package.
  
Advantages of Maven project:
    
    1.Maven is a powerful build automation tool where we have the dependencies(libraries) for suggestions and many src folders. 
    2.In maven we can use the annotations to create our tests like @Test, @beforetest, @aftertest, @beforeclass ,@afterclass, @beforesuite ,@aftersuite etc.
    3.Here in maven we can prioritize our tests , create a depends on method to execute our tests, give a pre-requisites in the @beforetest and post-requisites in the @aftertest
    4.Maven supports the cucumber framework where we can create the features file, runner file and test steps file.
    5.Other frameworks in maven are Page Object Model, TestNG.
    6.We can add waits in maven like implicit wait , explicit wait and thread.sleep.
    
Dependencies/libraries:

<project xmlns="https://maven.apache.org/POM/4.0.0" xmlns:xsi="https://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>sparsh_cucumber_new</groupId>
  <artifactId>sparsh_cucumber_new</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <dependencies>
	<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-java -->
<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-java</artifactId>
    <version>7.18.0</version>
</dependency>
<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-junit -->
<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-junit</artifactId>
    <version>7.18.0</version>
    <scope>test</scope>
</dependency>
<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.22.0</version>
</dependency>
  	<dependency>
  		<groupId>Cucumber_testNG</groupId>
  		<artifactId>Cucumber_testNG</artifactId>
  		<version>0.0.1-SNAPSHOT</version>
  	</dependency>
  </dependencies>
</project>

Tools and stacks used:
  
    1.Spring Tool Suite IDE( an integrated development)
    2.GitHub 
    3.Google drive
 Git commands:

  Git init -> initializes the git 
  git remote add origin "url" -> command to create a remote origin for the local in the cloud and .git file is seen in the folder which represents the folder is linked to remote 
  git add . -> command to add all the files in the local to remote
  git commit -m "message" -> command to write a commit message for the changes made to the folder for reference by our colleague in company
  git push origin master -> command to push our files to the remote repository

  API used:
  In selenium we use the W3C protocol which acts as a communication medium between the wedriver and browsers driver.

    
