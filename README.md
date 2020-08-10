# Web Automation Framework

## Pre - Requisite
Knowledge of Java.

Knowledge of Gherkin. 

Knowledge of TestNG.

Knowledge of Selenium.

Knowledge of Maven.

Knowledge of Cucumber.

## Installation

Use [Maven Repository](https://mvnrepository.com/) to install below dependencies :
```xml
<dependencies>
	<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
	<dependency>
		<groupId>org.seleniumhq.selenium</groupId>
		<artifactId>selenium-java</artifactId>
		<version>3.141.59</version>
	</dependency>
	<!-- https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-core -->
	<dependency>
		<groupId>org.apache.logging.log4j</groupId>
		<artifactId>log4j-core</artifactId>
		<version>2.13.3</version>
	</dependency>
	<!-- https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-core -->
	<dependency>
		<groupId>org.apache.logging.log4j</groupId>
		<artifactId>log4j-api</artifactId>
		<version>2.13.3</version>
	</dependency>
	<!-- https://mvnrepository.com/artifact/javax.mail/javax.mail-api -->
	<dependency>
		<groupId>javax.mail</groupId>
		<artifactId>javax.mail-api</artifactId>
		<version>1.6.2</version>
	</dependency>
	<!-- https://mvnrepository.com/artifact/org.apache.poi/poi -->
	<dependency>
		<groupId>org.apache.poi</groupId>
		<artifactId>poi</artifactId>
		<version>4.0.1</version>
	</dependency>
	<!-- https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml -->
	<dependency>
		<groupId>org.apache.poi</groupId>
		<artifactId>poi-ooxml</artifactId>
		<version>4.0.1</version>
	</dependency>
	<!-- https://mvnrepository.com/artifact/org.apache.poi/poi-scratchpad -->
	<dependency>
		<groupId>org.apache.poi</groupId>
		<artifactId>poi-scratchpad</artifactId>
		<version>4.0.1</version>
	</dependency>
	<!-- https://mvnrepository.com/artifact/org.testng/testng -->
	<dependency>
		<groupId>org.testng</groupId>
		<artifactId>testng</artifactId>
		<version>6.14.3</version>
		<scope>test</scope>
	</dependency>
	<dependency>
		<groupId>commons-io</groupId>
		<artifactId>commons-io</artifactId>
		<version>2.6</version>
	</dependency>
	<!-- https://mvnrepository.com/artifact/com.beust/jcommander -->
	<dependency>
		<groupId>com.beust</groupId>
		<artifactId>jcommander</artifactId>
		<version>1.72</version>
	</dependency>
	<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-java -->
	<dependency>
		<groupId>io.cucumber</groupId>
		<artifactId>cucumber-java</artifactId>
		<version>4.2.2</version>
	</dependency>
	<!-- https://mvnrepository.com/artifact/io.cucumber/gherkin -->
	<dependency>
		<groupId>io.cucumber</groupId>
		<artifactId>gherkin</artifactId>
		<version>5.1.0</version>
	</dependency>
	<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-testng -->
	<dependency>
		<groupId>io.cucumber</groupId>
		<artifactId>cucumber-testng</artifactId>
		<version>4.2.2</version>
		<exclusions>
			<exclusion>
				<groupId>junit</groupId>
				<artifactId>junit</artifactId>
			</exclusion>
		</exclusions>
	</dependency>
	<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-picocontainer -->
	<dependency>
		<groupId>io.cucumber</groupId>
		<artifactId>cucumber-picocontainer</artifactId>
		<version>4.2.2</version>
		<scope>test</scope>
	</dependency>
	<!-- https://mvnrepository.com/artifact/net.masterthought/cucumber-reporting -->
	<dependency>
		<groupId>net.masterthought</groupId>
		<artifactId>cucumber-reporting</artifactId>
		<version>4.4.0</version>
	</dependency>
</dependencies>
```

