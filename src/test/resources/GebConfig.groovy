/*
	This is the Geb configuration file.
	
	See: http://www.gebish.org/manual/current/#configuration
*/


import org.openqa.selenium.chrome.ChromeDriver

waiting {
	timeout = 10
}

environments {
	
	chrome {
		driver = { new ChromeDriver() }
	}
}

// To run the tests with all browsers just run “./gradlew test”

baseUrl = "http://www.seleniumeasy.com/test/"
