package com.myRunner.in;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
  
   features = "/CucumberProject/src/test/resources/Features/logging.feature",
		   
   //path of step definition file
		   glue={"LoggingClass"},
				    
				//   glue= {"Steps"},
				   tags = "@SmokeTest" 
   )
public class TestRunner {

}
