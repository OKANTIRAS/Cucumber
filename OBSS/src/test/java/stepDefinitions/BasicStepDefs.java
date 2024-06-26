package stepDefinitions;


import io.cucumber.java.en.Given;
import config.ConfigurationManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import utils.BrowserUtils;

import javax.swing.*;

public class BasicStepDefs extends BaseStep {

	public static final Logger LOGGER = LogManager.getLogger(BasicStepDefs.class);


	@Given("The user navigate to the baseURL")
	public void i_navigate_to_the_base_url() {
		DRIVER.get(ConfigurationManager.getProperty("baseURL"));
		LOGGER.info("User navigates to baseURL");

	}



}
