package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.HealthCarePage;

public class HealthCareStepDef {

public	WebDriver driver;
public	HealthCarePage healthCare;
	
	@Given("User launch url of the Application")
	public void user_launch_url_of_the_application() {
	   WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	   healthCare=new HealthCarePage(driver);
	   driver.get("http://35.92.157.147/login");
	}

	@When("User enters the Credentials of Application and click on login")
	public void user_enters_the_credentials_of_application_and_click_on_login() throws Exception {
		healthCare.login();
	}
	@And("User adds Admin User for Application")
	public void user_adds_admin_user_for_application() throws Exception {
		//healthCare.adminUsers();
		//healthCare.editAdminUsers();
	}
	
	@Then("User add the new Firm of the Application")
	public void user_add_the_new_firm_of_the_application() throws Exception {
	     // healthCare.addFirm();
	}
	@And("User click on edit and update user details")
	public void user_click_on_edit_and_update_user_details() throws Exception {
	    // healthCare.updateFirm();
	}
	@And("User add and Update Contact details")
	public void user_add_and_update_contact_details() throws Exception {
		//healthCare.add_Contant();
	   // healthCare.editContact();
	}
	@Then("User add Firm Branding Details")
	public void user_add_firm_branding_details() throws Exception {
	   // healthCare.add_firm_Branding();
	}
	@And("User Add Order Details")
	public void user_add_order_details() throws Exception {
	  // healthCare.order_Details();
	}
	@And("USer Enters pre Submission details")
	public void u_ser_enters_pre_submission_details() throws Exception {
	   healthCare.pre_submission_Details();
	}
	

}
