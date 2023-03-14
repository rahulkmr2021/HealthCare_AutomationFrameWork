package pageObject;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HealthCarePage {

	WebDriver remoteDriver;

	public HealthCarePage(WebDriver localDriver) {
		remoteDriver=localDriver;
		PageFactory.initElements(localDriver, this);	
	}

	@FindBy(xpath="//input[@type='email']")
	public WebElement email;

	@FindBy(xpath="//input[@type='password']")
	public WebElement password;

	@FindBy(xpath="//button[@class='btn-submit']")
	public WebElement btnLogin;

	@FindBy(xpath="//button[@id='add_firms']")
	public WebElement add_Firms;
	@FindBy(xpath="//input[@placeholder='Firm Name']")
	public WebElement firmName;
	@FindBy(xpath="//select[@id='firmType']")
	public WebElement selectFirmType;
	@FindBy(xpath="//input[@name='street_address_1']")
	public WebElement street_address_1;
	@FindBy(xpath="//input[@name='street_address_2']")
	public WebElement street_address_2;
	@FindBy(xpath="//input[@name='city']")
	public WebElement city;
	@FindBy(xpath="//select[@name='states']")
	public WebElement selectState;
	@FindBy(xpath="//input[@name='zip_code']")
	public WebElement zipCode;
	@FindBy(xpath="//input[@name='website']")
	public WebElement website;
	@FindBy(xpath="//input[@name='firm_phone']")
	public WebElement firm_Phone;
	@FindBy(xpath="//button[text()='Save']")
	public WebElement saveFirm;	
	@FindBy(xpath="(//tbody//tr//td[@role='gridcell'])[2]//a")
	public WebElement editFirm;
	@FindBy(xpath="//button[@type='submit']")
	public WebElement Update;
	@FindBy(xpath="//button[text()='Contacts']")
	public WebElement contact;
	@FindBy(xpath="//button[text()=' Add Contacts']")
	public WebElement addContacts;
	@FindBy(xpath="//input[@id='firstName']")
	public WebElement firstName;
	@FindBy(xpath="//input[@id='lastName']")
	public WebElement lastName;
	@FindBy(xpath="//input[@id='title']")
	public WebElement title;
	@FindBy(xpath="//input[@id='email']")
	public WebElement email_Update;
	@FindBy(xpath="//input[@id='phone']")
	public WebElement phoneUpdate;
	@FindBy(xpath="//input[@id='extension']")
	public WebElement extension;
	@FindBy(xpath="//input[@id='mobile']")
	public WebElement mobile;
	@FindBy(xpath="//textarea[@id='contactNotes']")
	public WebElement textArea;
	@FindBy(xpath="(//button[@type='submit'])[2]")
	public WebElement saveContact;
	@FindBy(xpath="(//a[@class='anchorId'])[1]")
	public WebElement editContact;
	@FindBy(xpath="(//button[@type='submit'])[2]")
	public WebElement updated_Contact;



	//Add User Details...........

	//Issue in firm name xpath is not working

	@FindBy(xpath="//button[@class='Add-button']")
	public WebElement adminAddbutton;
	@FindBy(xpath="//input[@id='first_name']")
	public WebElement adminfirst_name;
	@FindBy(xpath="//input[@name='last_name']")
	public WebElement adminlast_name;
	@FindBy(xpath="//input[@type='email']")
	public WebElement adminEmail;
	@FindBy(xpath="//input[@name='phone']")
	public WebElement adminPhone;
	@FindBy(xpath="//input[@name='extension']")
	public WebElement adminExtension;
	@FindBy(xpath="//input[@name='mobile']")
	public WebElement adminMobile;
	@FindBy(xpath="//input[@type='file']")
	public WebElement adminFile;
	@FindBy(xpath="//input[@type='checkbox']")
	public WebElement adminCheckbox;
	@FindBy(xpath="//button[@type='submit']")
	public WebElement adminSubmit;
	@FindBy(xpath="//a[text()='Users']")
	public WebElement clickUser;
	@FindBy(xpath="//input[@aria-label='Search in the data grid']")
	public WebElement search;
	@FindBy(xpath="(//span[@class='switch-on btn btn-success btn-xs'])[1]")
	public WebElement active;
	@FindBy(xpath="(//span[@class='switch-off btn btn-light btn-xs'])[1]")
	public WebElement deactive;
	@FindBy(xpath="//a[@title='Edit']")
	public WebElement editAdminUser;
	@FindBy(xpath="//div[@class='dx-texteditor-buttons-container']")
	public WebElement endSearch;


	@FindBy(xpath="//button[text()='Branding']")
	public WebElement branding;
	@FindBy(xpath="//input[@class='form-control-file']")
	public WebElement file_Brand_upld;
	@FindBy(xpath="//button[text()='Done']")
	public WebElement file_upload_done;

	@FindBy(xpath="//div[@class='saturation-black']")
	public WebElement primary_colour_picker;
	@FindBy(xpath="//div[text()='OK']")
	public WebElement primary_ok;

	@FindBy(xpath="//div[@class='saturation-black']")
	public WebElement secondary_colour_picker;
	@FindBy(xpath="//div[text()='OK']")
	public WebElement secondary_ok;
	@FindBy(xpath="//div[@class='col-md-3']/following::div[3]")
	public WebElement primary_colour;
	@FindBy(xpath="//div[@class='col-md-9']/following::div[4]")
	public WebElement secondary_colour;
	@FindBy(xpath="//button[text()='Save']")
	public WebElement branding_save;

	//Add & Update Order Details

	@FindBy(xpath="//button[text()='Orders']")
	public WebElement order_details;
	@FindBy(xpath="//button[text() =' Add Orders']")
	public WebElement add_orders;
	@FindBy (xpath="(//select[@class='form-select'])[3]")
	public WebElement select_product;
	@FindBy(xpath="//input[@name='purchaser_first_name']")
	public WebElement purch_first_name;
	@FindBy(xpath="//input[@placeholder='Purchaser Last Name ']")
	public WebElement purch_last_name;
	@FindBy(xpath="//input[@placeholder='Purchaser Email']")
	public WebElement purchaser_email;
	@FindBy(xpath="//input[@name='purchaser_phone']")
	public WebElement purchaser_phone;
	@FindBy(xpath="//input[@name='purchaser_status']")
	public WebElement purchaser_status_active;
	@FindBy(xpath="//label[text()='Inactive']")
	public WebElement purchaser_status_Inactive;
	@FindBy(xpath="//input[@placeholder='Invoice #']")
	public WebElement Invoice;
	@FindBy(xpath="//input[@placeholder='mm-dd-yyyy']")
	public WebElement Invoice_Date;
	@FindBy(xpath="(//input[@name='invoice_paid'])[1]")
	public WebElement Invoice_paid_yes;
	@FindBy(xpath="(//input[@name='invoice_paid'])[2]")
	public WebElement Invoice_paid_No;
	@FindBy(xpath="//input[@name='submit_code']")
	public WebElement submit_code;
	@FindBy(xpath="//textarea[@id='contactNotes']")
	public WebElement submit_portal_message;
	@FindBy(xpath="(//button[text()='Save'])[2]") 
	public WebElement order_save;


	// Pre-Submission--------------

	@FindBy(xpath="//a[text()='Pre-Submission']")
	public WebElement pre_submission;
	@FindBy(xpath="//button[text()=' Add Client']")
	public WebElement add_client;
	@FindBy(xpath="//div[@class=' css-1s2u09g-control']")
	public WebElement firm_name;
	@FindBy(xpath="//div[text()='Select...']")
	public WebElement orders;
	@FindBy(xpath="//button[text()='+ Add Client']")
	public WebElement add_client_details;
	@FindBy(xpath="//input[@placeholder='Client Name...']")
	public WebElement client_name;
	@FindBy(xpath="//input[@id='client_id']")
	public WebElement hcr_ID;
	@FindBy(xpath="//input[@placeholder='Contact First']")
	public WebElement contact_first_name;
	@FindBy(xpath="//input[@id='contact_last']")
	public WebElement contact_last_name;
	@FindBy(xpath="//input[@placeholder='Contact Phone']")
	public WebElement contact_phone;
	@FindBy(xpath="//input[@id='contact_mail']")
	public WebElement contact_email;
	@FindBy(xpath="//input[@placeholder='EIN']")
	public WebElement submit_ein;
	@FindBy(xpath="(//div[@class=' css-ackcql'])[3]")
	public WebElement renewal_months ;
	@FindBy(xpath="//input[@placeholder='dd/mm/yyyy']")
	public WebElement start_date_firm;

	//@FindBy(xpath="//input[@placeholder='dd/mm/yyyy']"),
	//public WebElement date_with_firm;

	@FindBy(xpath="//input[@name='estimated_ee']")
	public WebElement estimated_EE;
	@FindBy(xpath="//input[@placeholder='Funding']")
	public WebElement funding;
	@FindBy(xpath="(//span[contains(text(),'No')])[12]")
	public WebElement ref_year01;
	@FindBy(xpath="(//div[@class=' css-ackcql'])[4]")
	public WebElement tpa_Ref_yrs;
	@FindBy(xpath="(//div[@class=' css-ackcql'])[5]")
	public WebElement pbm_Ref_yrs;
	@FindBy(xpath="//input[@name='tpa_annual_fees']")
	public WebElement tpa_fees;
	@FindBy(xpath="//input[@placeholder='Stop Loss Premiums Paid']")
	public WebElement stop_loss_pre_paid;
	@FindBy(xpath="(//span[@class='switch-off btn btn-light btn-xs'])[12]")
	public WebElement teleMedicine;
	@FindBy(xpath="//input[@placeholder='Telemedicine Annual Costs']")
	public WebElement telemedicine_annual_cost;
	@FindBy(xpath="(//span[@class='switch-off btn btn-light btn-xs'])[13]")
	public WebElement telebehavior_health;
	@FindBy(xpath="//input[@placeholder='TeleBehavioral Annual Costs']")
	public WebElement telebehaviorl_annual_cost;
	@FindBy(xpath="(//span[@class='switch-off btn btn-light btn-xs'])[14]")
	public WebElement direct_primary_care;
	@FindBy(xpath="//input[@placeholder='Direct Primary Care Annual Costs']\r\n")
	public WebElement d_p_c_anul_cost;
	@FindBy(xpath="(//span[@class='switch-off btn btn-light btn-xs'])[15]")
	public WebElement v_primry_care;
	@FindBy(xpath="//input[@placeholder='Virtual Primary Care Annual Costs']")
	public WebElement v_p_c_anual_cost;
	@FindBy(xpath="(//span[@class='switch-off btn btn-light btn-xs'])[16]")
	public WebElement seperate_map_veder;
	@FindBy(xpath="//input[@id='map_vendor_name']")
	public WebElement map_vender_name;
	@FindBy(xpath="//input[@name='map_vendor_fees']")
	public WebElement map_vender_fee;
	@FindBy(xpath="//input[@placeholder='MAP Vendor Savings']")
	public WebElement map_vender_saving;
	@FindBy(xpath="//button[text()='Save']")
	public WebElement save_button;
	@FindBy(xpath="//button[text()='Update']")
	public WebElement update_button;
	//Update

	@FindBy(xpath="((//td[@class=\"dx-command-edit dx-command-edit-with-icons\"])[9]/following::a[@title=\"Edit\"])[3]")
	public WebElement update_client;
	@FindBy(xpath="(//a[@title='Delete'])[11]")
	public WebElement delete;

	//Import Data
	@FindBy(xpath="//button[text()='Import Data']")
	public WebElement import_Data;
	@FindBy(xpath="//input[@name='import_client_csv-input']")
	public WebElement add_file;
	@FindBy(xpath="//button[text()='Upload']")
	public WebElement upload_file_button;
	@FindBy(xpath="(//td[@aria-label='Column Completed Date'])[1]")
	public WebElement scrollSearchR;
	@FindBy(xpath="(//tbody//tr//td[@aria-colindex='1'])[28]")
	public WebElement scrollSearchL;

	@FindBy(xpath="//button[text()='Import Logs']")
	public WebElement  importLogs;
	@FindBy(xpath="//button[text()='Import Errors']")
	public WebElement importError;
	@FindBy(xpath="(//div[@class='dx-button-content']/following::i)[2]")
	public WebElement cancel_button;
	@FindBy(xpath="//input[@type='text']")
	public WebElement search_key;


	@FindBy(xpath="//div[@class='col-md-3']/following::div[3]")
	public WebElement primryColur;
	@FindBy(xpath="//div[@class='col-md-9']/following::div[4]")
	public WebElement secondryColour;


	@FindBy(xpath="(//a[text()='View'])[1]")
	public WebElement view_client;

	// Primary Client Details////////////

	@FindBy(xpath="//input[@placeholder='Legal First Name']")
	public WebElement legel_f_name;
	@FindBy(xpath="//input[@placeholder='Legal Middle Initial']")
	public WebElement legel_m_initial;
	@FindBy(xpath="//input[@placeholder='Legal Last Name']")
	public WebElement legel_l_name;
	@FindBy(xpath="//input[@placeholder='Title']")
	public WebElement client_title;
	@FindBy(xpath="//input[@placeholder='Work Email']")
	public WebElement work_email;
	@FindBy(xpath="//input[@placeholder='Work Phone']")
	public WebElement work_phone;
	@FindBy(xpath="//input[@placeholder='Street Address 1']")
	public WebElement street_ads;
	@FindBy(xpath="//input[@placeholder='Street Address 2']")
	public WebElement street_ads1;
	@FindBy(xpath="//div[@class=' css-ackcql']")
	public WebElement province;
	@FindBy(xpath="//input[@placeholder='City or Town']")
	public WebElement town;
	@FindBy(xpath="//input[@placeholder='Postal Code']")
	public WebElement postal_code;
	@FindBy(xpath="//input[@placeholder='Company Name']")
	public WebElement c_name;
	@FindBy(xpath="//input[@placeholder='Contact First Name']")
	public WebElement c_f_name;
	@FindBy(xpath="//input[@placeholder='Contact Last Name']")
	public WebElement c_l_name;
	@FindBy(xpath="//input[@placeholder='Contact Email']")
	public WebElement c_email;
	@FindBy(xpath="//input[@placeholder=' Contact Phone']")
	public WebElement c_phone;
	@FindBy(xpath="//button[text()='Update & Next']")
	public WebElement contact_update_next;


	@FindBy(xpath="//input[@placeholder='Legal Name']")
	public WebElement legel_name;
	@FindBy(xpath="//input[@placeholder='EIN']")
	public WebElement ein_reporting;
	@FindBy(xpath="//select[@class='form-select']")
	public WebElement p_s_s_i;
	@FindBy(xpath="//input[@placeholder='No. of Employees']")
	public WebElement total_emp;
	@FindBy( xpath="(//div[@class='switch-group'])[1]")
	public WebElement plan_gf;
	@FindBy(xpath="//div[@class='switch-group']/following::span[3]")
	public WebElement group_trust;
	@FindBy(xpath="//textarea[@name='association_details']")
	public WebElement name_of_plan;
	@FindBy(xpath="//input[@placeholder='Group Health Plan Name']")
	public WebElement health_plan_name;
	@FindBy(xpath="//input[@placeholder='No. of Members']")
	public WebElement members;
	@FindBy(xpath="//div[@class='switch-group']/following::span[10]")
	public WebElement f_5500;
	@FindBy(xpath="//input[@placeholder='Details']")
	public WebElement plan_5000;
	@FindBy(xpath="//button[text()='Update & Next']")
	public WebElement company_update_next;


	@FindBy(xpath="//div[@class='switch-group']")
	public WebElement group_info;
	@FindBy(xpath="//button[text()='+ Add Row']")
	public WebElement add_row;
	@FindBy(xpath="//input[@name='group_name']")
	public WebElement group_name;
	@FindBy(xpath="//input[@name='group_ein']")
	public WebElement group_ein;
	@FindBy(xpath="//select[@class='form-select']")
	public WebElement state_of_incop;
	@FindBy(xpath="//input[@class='form-control table-rows']")
	public WebElement estimated_of_employee;

	@FindBy(xpath="//span[text()='Remove']")
	public WebElement remove_button;

	@FindBy(xpath="//button[text()='Update & Next']")
	public WebElement ag_update;


	@FindBy(xpath="//input[@name='annual_employee_dependent']")
	public WebElement annual_employee;
	@FindBy(xpath="(//span[@class='switch-off btn btn-light btn-xs'])[1]")
	public WebElement aca_reporting;
	@FindBy(xpath="//textarea[@placeholder='Details']")
	public WebElement aca_details;
	@FindBy(xpath="(//span[@class='switch-off btn btn-light btn-xs'])[2]")
	public WebElement perception_drug;
	@FindBy(xpath="//textarea[@name='employee_contributions_details']")
	public WebElement contribution_details;
	@FindBy(xpath="(//span[@class='switch-off btn btn-light btn-xs'])[3]")
	public WebElement pharmecy_benefits;
	@FindBy(xpath="//textarea[@name='formulary_assignments_details']")
	public WebElement assignment_details;
	@FindBy(xpath="(//span[@class='switch-off btn btn-light btn-xs'])[4]")
	public WebElement prescription_drug;
	@FindBy(xpath="//textarea[@name='plan_structure_details']")
	public WebElement structure_details;
	@FindBy(xpath="//button[text()='Update & Next']")
	public WebElement contrl_update;


	@FindBy(xpath="//span[text()='+ Plan Year']")
	public WebElement plan_year;

	@FindBy(xpath="(//input[@placeholder='mm/dd/yyyy'])[1]")
	public WebElement start_date;
	@FindBy(xpath="(//input[@placeholder='mm/dd/yyyy'])[2]")
	public WebElement end_date;
	@FindBy(xpath="//select[@class='form-select plan']")
	public WebElement plan_type;
	@FindBy(xpath="(//select[@class='form-select'])[1]")
	public WebElement tpa_plan_year;
	@FindBy(xpath="(//select[@class='form-select'])[2]")
	public WebElement pbm_plan_yrear;
	@FindBy(xpath="//button[@type='submit']")
	public WebElement save_plan_year;

	@FindBy(xpath="//button[text()='Edit Plan Year']")
	public WebElement edit_plan_year;

	@FindBy(xpath="//button[text()='Update']")
	public WebElement update_plan_year;


	@FindBy(xpath="//span[text()='Filings']")
	public WebElement filings;


	@FindBy(xpath="(//input[@type='checkbox'])[1]")
	public WebElement checkbox01;
	@FindBy(xpath="(//input[@type='checkbox'])[2]")
	public WebElement checkbox02;
	@FindBy(xpath="(//input[@type='checkbox'])[3]")
	public WebElement checkbox03;

	@FindBy(xpath="//button[text()='Update & Next']")
	public WebElement filings_update;

	@FindBy(xpath="//button[text()='D1 Reporting Data']")
	public WebElement reporting_data01;
	@FindBy(xpath="//button[text()='D2 Reporting Data']")
	public WebElement reporting_data02;
	@FindBy(xpath="//button[text()='D3-D8 Rx Data']")
	public WebElement reporting_data03;


	@FindBy(xpath="//input[@placeholder='medical_claims']")
	public WebElement medical_clam;
	@FindBy(xpath="//input[@placeholder='pharmacy_claims']")
	public WebElement pharmacy_claim;
	@FindBy(xpath="//input[@placeholder='plan_administrative_fees']")
	public WebElement plan_admn_fee;
	@FindBy(xpath="//input[@placeholder='stop_loss_premiums']")
	public WebElement stop_loss_premium;
	@FindBy(xpath="//input[@placeholder='telemedicine_not_paid_via_tpa']")
	public WebElement telemedicine_not_via_tpa;
	@FindBy(xpath="//input[@placeholder='direct_virtual_not_paid_via_tpa']")
	public WebElement d_v_not_virtual_paid;
	@FindBy(xpath="//input[@placeholder='stop_loss_reimbursements']")
	public WebElement stop_loss_rembrusment;
	@FindBy(xpath="//input[@placeholder='prescription_drug_rebates']")
	public WebElement prescription_drug_rebate;
	@FindBy(xpath="//input[@placeholder='manufacturer_assistance_savings']")
	public WebElement m_assistance_save;
	@FindBy(xpath="((//span[@class='dx-button-text'])[1]")
	public WebElement upload_d1_data_file;

	@FindBy(xpath="//button[text()='Update & Next']")
	public WebElement update_next;    
	@FindBy(xpath="//h2[text()='UPLOAD D1 DATA FILES']")
	public WebElement data_files;

	

	@FindBy(xpath="//input[@placeholder='hospital']")
	public WebElement total_spending_hospital;
	@FindBy(xpath="//input[@id='cost_sharing_hospital']")
	public WebElement cost_sharing_hospital;
	@FindBy(xpath="//input[@id='amount_not_applied_hospital']")
	public WebElement amount_N_applied_hospital;


	@FindBy(xpath="//input[@placeholder='primary_care']")
	public WebElement primry_care_spending;
	@FindBy(xpath="//input[@placeholder='cost_sharing_primary_care']")
	public WebElement cost_sharing_primary_care;
	@FindBy(xpath="//input[@placeholder='amount_not_applied_primary_care']")
	public WebElement amount_not_applied_primary_care;


	@FindBy(xpath="//input[@placeholder='specialty_care']")
	public WebElement speciality_care_spending;
	@FindBy(xpath="//input[@placeholder='cost_sharing_specialty_care']")
	public WebElement cost_sharing_special_care;
	@FindBy(xpath="//input[@placeholder='amount_not_applied_specialty_care']")
	public WebElement amount_not_applied_special_care;


	@FindBy(xpath="//input[@placeholder='other_medical_costs_and_services']")
	public WebElement medical_cost_and_service;
	@FindBy(xpath="//input[@placeholder='cost_sharing_other_medical_costs_and_services']")
	public WebElement cost_sharing_medial_cost_service;
	@FindBy(xpath="//input[@placeholder='amount_not_applied_other_medical_costs_and_services']")
	public WebElement amount_applied_medical_cost_services;


	@FindBy(xpath="//input[@placeholder='known_medical_benfits_drugs']")
	public WebElement know_medical_benifits_drugs;
	@FindBy(xpath="//input[@placeholder='cost_sharing_known_medical_benfits_drugs']")
	public WebElement cost_sharing_medical_benefits_drugs;
	@FindBy(xpath="//input[@placeholder='amount_not_applied_known_medical_benfits_drugs']")
	public WebElement amount_not_applied_medical_benefits_drugs;



	@FindBy(xpath="//input[@placeholder='estimated_medical_benfits_drugs']")
	public WebElement estimated_medical_benefits_drugs;
	@FindBy(xpath="//input[@placeholder='cost_sharing_estimated_medical_benfits_drugs']")
	public WebElement cost_sharing_estimated_benefits_drugs;
	@FindBy(xpath="//input[@placeholder='amount_not_applied_estimated_medical_benfits_drugs']")
	public WebElement amount_N_estimated_medical_benefits_drugs;


	@FindBy(xpath="(//span[text()='Add File'])[1]")
	public WebElement add_file_reporting;



	@FindBy(xpath="//button[text()='Update & Next']")
	public WebElement update_next_reporting;
	
	
	
	@FindBy(xpath="(//span[text()='Add File'])[1]")
	public WebElement upload_D8_data_file01;
	@FindBy(xpath="(//span[text()='Add File'])[2]")
	public WebElement upload_D8_data_file02;
	@FindBy(xpath="(//span[text()='Add File'])[3]")
	public WebElement upload_D8_data_file03;
	@FindBy(xpath="(//span[text()='Add File'])[4]")
	public WebElement upload_D8_data_file04;
	
	
	@FindBy(xpath="//button[text()='Submit Files']")
	public WebElement submit_button;















	public  void login() throws Exception {
		remoteDriver.manage().window().maximize();
		email.sendKeys("admin@bc.com");	
		password.sendKeys("Password1!");
		btnLogin.click();
		Thread.sleep(10000);
	}

	public void adminUsers() throws Exception {
		clickUser.click();
		Thread.sleep(4000);
		adminAddbutton.click();
		Thread.sleep(4000);
		adminfirst_name.sendKeys("Rahulkmr890");
		Thread.sleep(4000);
		adminlast_name.sendKeys("kmr003");
		Thread.sleep(4000);
		adminEmail.sendKeys("rahulkmr4@gmail.com");
		Thread.sleep(4000);
		adminPhone.sendKeys("9823459635");
		Thread.sleep(4000);
		adminExtension.sendKeys("78089");
		Thread.sleep(4000);
		adminMobile.sendKeys("9978993789");
		Thread.sleep(4000);
		adminFile.sendKeys("C:\\Users\\Raneso\\Downloads\\iphone-lamborghini.jpg");
		Thread.sleep(4000);
		adminCheckbox.click();
		Thread.sleep(4000);
		adminSubmit.click();
		Thread.sleep(4000);
		System.out.println("User added Admin");
	}

	public void editAdminUsers() throws Exception {

		clickUser.click();
		Thread.sleep(4000);
		active.click();
		Thread.sleep(4000);
		deactive.click();
		Thread.sleep(4000);
		search.sendKeys("Rahul123");
		Actions a=new Actions(remoteDriver);
		a.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(4000);	
		editAdminUser.click();
		Thread.sleep(4000);
		adminfirst_name.clear();
		Thread.sleep(4000);
		adminfirst_name.sendKeys("Rajesh007");
		Thread.sleep(4000);
		adminlast_name.clear();
		Thread.sleep(4000);
		adminlast_name.sendKeys("Kmr12");
		Thread.sleep(4000);
		adminEmail.clear();
		Thread.sleep(4000);
		adminEmail.sendKeys("rajesh012@gmail.com");
		Thread.sleep(4000);
		adminPhone.clear();
		Thread.sleep(4000);
		adminPhone.sendKeys("9867366987");
		Thread.sleep(4000);
		adminExtension.clear();
		Thread.sleep(4000);
		adminExtension.sendKeys("67888");
		Thread.sleep(4000);
		adminMobile.clear();
		Thread.sleep(4000);
		adminMobile.sendKeys("7896583999");
		Thread.sleep(4000);
		adminFile.sendKeys("C:\\Users\\Raneso\\Downloads\\1080p-hd-desktop.jpg");
		Thread.sleep(4000);
		Update.click();
		Thread.sleep(4000);
		endSearch.click();
		Thread.sleep(10000);
		System.out.println("Admin User Updated");
	}



	public void addFirm() throws Exception {

		add_Firms.click();
		Thread.sleep(4000);
		firmName.sendKeys("Health01");	
		Thread.sleep(4000);
		Select s=new Select(selectFirmType);
		s.selectByValue("42");
		Thread.sleep(4000);
		street_address_1.sendKeys("gurudham01");
		Thread.sleep(4000);
		street_address_2.sendKeys("kishoreganj01");
		Thread.sleep(4000);
		city.sendKeys("Ranchi01");
		Thread.sleep(4000);
		Select s1=new Select(selectState);
		s1.selectByVisibleText("Alaska");
		Thread.sleep(4000);
		zipCode.sendKeys("65469");
		Thread.sleep(4000);
		website.sendKeys("https://www.google.com");
		Thread.sleep(4000);
		firm_Phone.sendKeys("9853851995");
		Thread.sleep(4000);
		saveFirm.click();
		Thread.sleep(8000);

		System.out.println("Frim has been added");
	}
	public void updateFirm() throws Exception {

		editFirm.click();
		Thread.sleep(4000);
		firmName.clear();	
		firmName.sendKeys("HealthCare01");		
		Thread.sleep(4000);
		Select s=new Select(selectFirmType);
		s.selectByValue("44");
		Thread.sleep(4000);	
		street_address_1.clear();
		Thread.sleep(4000);
		street_address_1.sendKeys("Hazaribgh01");
		Thread.sleep(4000);
		street_address_2.clear();
		Thread.sleep(4000);
		street_address_2.sendKeys("PTC01");
		Thread.sleep(4000);
		city.clear();
		city.sendKeys("Hazaribagh001");
		Thread.sleep(4000);
		Select s1=new Select(selectState);
		s1.selectByVisibleText("California");
		Thread.sleep(4000);
		zipCode.clear();
		Thread.sleep(4000);
		zipCode.sendKeys("87949");
		Thread.sleep(4000);
		website.clear();
		Thread.sleep(4000);
		website.sendKeys("https://www.facebook.com");
		Thread.sleep(4000);
		firm_Phone.clear();
		firm_Phone.sendKeys("9937342456");
		Thread.sleep(4000);
		Update.click();
		Thread.sleep(4000);

		System.out.println("Frim has been updated");
	}


	//Add Contact	
	public void add_Contant() throws Exception{

		editFirm.click();
		Thread.sleep(4000);
		contact.click();
		Thread.sleep(4000);
		addContacts.click();
		Thread.sleep(4000);
		firstName.sendKeys("Sourav001");
		Thread.sleep(4000);
		lastName.sendKeys("RAJ01");
		Thread.sleep(4000);
		title.sendKeys("MR");
		Thread.sleep(4000);
		email_Update.sendKeys("rahul.k412@gmail.com");
		Thread.sleep(4000);
		phoneUpdate.sendKeys("9853852888");
		Thread.sleep(4000);
		extension.sendKeys("77799");
		Thread.sleep(4000);
		mobile.sendKeys("7546363757");
		Thread.sleep(4000);
		textArea.sendKeys("Hello World01");
		Thread.sleep(4000);
		saveContact.click();
		Thread.sleep(4000);

		System.out.println("New Contact Added");
	}

	public void	editContact() throws Exception{

		//		temp editFirm
		//		editFirm.click();
		//		Thread.sleep(4000);

		contact.click();
		Thread.sleep(4000);
		editContact.click();
		Thread.sleep(4000);			
		firstName.clear();
		Thread.sleep(4000);
		firstName.sendKeys("Rahul001");
		Thread.sleep(4000);
		lastName.clear();
		Thread.sleep(4000);
		lastName.sendKeys("Kuamr003");
		Thread.sleep(4000);
		title.clear();
		Thread.sleep(4000);
		title.sendKeys("Mr");
		Thread.sleep(4000);
		email_Update.clear();
		Thread.sleep(4000);
		email_Update.sendKeys("rkmr124@gmail.com");
		Thread.sleep(4000);
		phoneUpdate.clear();
		Thread.sleep(4000);
		phoneUpdate.sendKeys("9867852678");
		Thread.sleep(4000);
		extension.clear();
		Thread.sleep(4000);
		extension.sendKeys("34278");
		Thread.sleep(4000);
		mobile.clear();
		Thread.sleep(4000);
		mobile.sendKeys("8536366889");
		Thread.sleep(4000);
		textArea.clear();
		Thread.sleep(4000);
		textArea.sendKeys("Hello World one");
		Thread.sleep(4000);
		updated_Contact.click();
		Thread.sleep(4000);

		System.out.println("udated Contact Details");
	}
	public void add_firm_Branding() throws Exception {

		//editFirm.click();
		//Thread.sleep(4000);
		branding.click();
		Thread.sleep(4000);
		file_Brand_upld.sendKeys("C:\\Users\\Raneso\\Downloads\\iphone-lamborghini.jpg");
		Thread.sleep(4000);
		file_upload_done.click();
		Thread.sleep(4000);


		primary_colour.click();
		Thread.sleep(5000);

		primary_colour_picker.click();
		Thread.sleep(4000);


		primary_ok.click();
		Thread.sleep(4000);


		secondary_colour.click();
		Thread.sleep(4000);

		secondary_colour_picker.click();
		Thread.sleep(4000);


		secondary_ok.click();
		Thread.sleep(4000);


		branding_save.click();
		Thread.sleep(4000);

		System.out.println("Brand Details Updated");


	}
	public void order_Details() throws Exception {

		editFirm.click();
		Thread.sleep(4000);
		order_details.click();
		Thread.sleep(4000);
		add_orders.click();
		Thread.sleep(4000);
		Select s = new Select(select_product);
		s.selectByIndex(3);

		purch_first_name.sendKeys("Rakesh001");
		Thread.sleep(4000);
		purch_last_name.sendKeys("Kmr001");
		Thread.sleep(4000);
		purchaser_email.sendKeys("abd4@yahoo.com");
		Thread.sleep(4000);
		purchaser_phone.sendKeys("9853851773");
		Thread.sleep(4000);
		purchaser_status_active.click();
		Thread.sleep(4000);
		purchaser_status_Inactive.click();
		Thread.sleep(4000);
		Invoice.sendKeys("ABC12348");
		Thread.sleep(4000);
		Invoice_Date.sendKeys(null);
		Thread.sleep(4000);
		Invoice_paid_yes.click();
		Thread.sleep(4000);
		Invoice_paid_No.click();
		Thread.sleep(4000);
		submit_code.sendKeys("56898");
		Thread.sleep(4000);
		submit_portal_message.sendKeys("Hello..World");
		Thread.sleep(4000);

		order_save.click();
		Thread.sleep(4000);

		System.out.println("Order Details Updated");

	}

	public void pre_submission_Details() throws Exception {
		Thread.sleep(4000);
		pre_submission.click();
		Thread.sleep(4000);
		add_client.click();
		Thread.sleep(4000);
		firm_name.click();

		//Using Robot Class

		Robot r = new Robot();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);


		//To Enter Keys
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);


		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		JavascriptExecutor js = (JavascriptExecutor)remoteDriver;
		js.executeScript("arguments[0].click;",orders);
		Thread.sleep(4000);

		//Using Robot Class
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(4000);
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(4000);
		//To Enter Keys
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);



		add_client_details.click();
		Thread.sleep(4000);
		client_name.sendKeys("CSK07");
		Thread.sleep(4000);
		hcr_ID.sendKeys("cs123");
		Thread.sleep(4000);
		contact_first_name.sendKeys("Rakesh");
		Thread.sleep(4000);
		contact_last_name.sendKeys("KMR01");
		Thread.sleep(4000);
		contact_phone.sendKeys("9709115509");
		Thread.sleep(4000);
		contact_email.sendKeys("qwe@gmail.com");
		Thread.sleep(4000);
		submit_ein.sendKeys("12-3werd98");
		Thread.sleep(4000);
		//renewal_months
		renewal_months.click();
		Thread.sleep(4000);
		//Using Robot Class
		Robot r2 = new Robot();
		r2.keyPress(KeyEvent.VK_DOWN);
		r2.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(4000);
		r2.keyPress(KeyEvent.VK_DOWN);
		r2.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(4000);
		//To Enter Keys
		r2.keyPress(KeyEvent.VK_ENTER);
		r2.keyRelease(KeyEvent.VK_ENTER);

		//date_with_firm
		start_date_firm.click();
		Thread.sleep(4000);
		start_date_firm.sendKeys("12/02/2023");
		Thread.sleep(4000);
		estimated_EE.sendKeys("98576");
		Thread.sleep(4000);
		funding.sendKeys("5679");       
		Thread.sleep(4000);
		ref_year01.click();
		Thread.sleep(4000);
		tpa_Ref_yrs.click();
		Thread.sleep(4000);

		//Robot Class
		Robot r3 = new Robot();
		r3.keyPress(KeyEvent.VK_DOWN);
		r3.keyRelease(KeyEvent.VK_DOWN);

		r3.keyPress(KeyEvent.VK_ENTER);
		r3.keyRelease(KeyEvent.VK_ENTER);


		pbm_Ref_yrs.click();

		//Robot Class
		Robot r4 = new Robot();
		r4.keyPress(KeyEvent.VK_DOWN);
		r4.keyRelease(KeyEvent.VK_DOWN);

		r4.keyPress(KeyEvent.VK_ENTER);
		r4.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		tpa_fees.sendKeys("34890");
		Thread.sleep(4000);
		stop_loss_pre_paid.sendKeys("3478");
		Thread.sleep(4000);
		teleMedicine.click();
		Thread.sleep(4000);
		telemedicine_annual_cost.sendKeys("56987");
		Thread.sleep(4000);
		telebehavior_health.click();
		Thread.sleep(4000);
		telebehaviorl_annual_cost.sendKeys("267980");
		Thread.sleep(4000);
		direct_primary_care.click();
		Thread.sleep(4000);
		d_p_c_anul_cost.sendKeys("567899");
		Thread.sleep(4000);
		v_primry_care.click();
		Thread.sleep(4000);
		v_p_c_anual_cost.sendKeys("347890");
		Thread.sleep(4000);
		seperate_map_veder.click();
		Thread.sleep(4000);
		map_vender_name.sendKeys("Amar01");
		Thread.sleep(4000);
		map_vender_fee.sendKeys("34598");
		Thread.sleep(4000);
		map_vender_saving.sendKeys("2347");
		Thread.sleep(4000);
		JavascriptExecutor js2=(JavascriptExecutor)remoteDriver;
		js2.executeScript("arguments[0].scrollIntoView();", save_button);
		Thread.sleep(4000);
		save_button.click();



		//Update Client Details...................
		js2.executeScript("arguments[0].scrollIntoView();",delete);
		Thread.sleep(4000);
		update_client.click();
		Thread.sleep(4000);

		client_name.clear();
		Thread.sleep(4000);
		client_name.sendKeys("RCB12");
		Thread.sleep(4000);
		hcr_ID.clear();
		Thread.sleep(4000);
		hcr_ID.sendKeys("def12");
		Thread.sleep(4000);
		contact_first_name.clear();
		Thread.sleep(4000);
		contact_first_name.sendKeys("Rajesh");
		Thread.sleep(4000);
		contact_last_name.clear();
		Thread.sleep(4000);
		contact_last_name.sendKeys("KMR02");
		Thread.sleep(4000);
		contact_phone.clear();
		Thread.sleep(4000);
		contact_phone.sendKeys("9407115608");
		Thread.sleep(4000);
		contact_email.clear();
		Thread.sleep(4000);
		contact_email.sendKeys("abcd34512@gmail.com");
		Thread.sleep(4000);
		submit_ein.clear();
		Thread.sleep(4000);
		submit_ein.sendKeys("59-7wera99");
		Thread.sleep(4000);
		//renewal_months
		renewal_months.click();
		Thread.sleep(4000);
		//Using Robot Class

		r2.keyPress(KeyEvent.VK_DOWN);
		r2.keyRelease(KeyEvent.VK_DOWN);
		r2.keyPress(KeyEvent.VK_DOWN);
		r2.keyRelease(KeyEvent.VK_DOWN);
		r2.keyPress(KeyEvent.VK_DOWN);
		r2.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(4000);
		r2.keyPress(KeyEvent.VK_DOWN);
		r2.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(4000);
		//To Enter Keys
		r2.keyPress(KeyEvent.VK_ENTER);
		r2.keyRelease(KeyEvent.VK_ENTER);

		//date_with_firm
		start_date_firm.click();
		Thread.sleep(4000);
		start_date_firm.clear();
		Thread.sleep(4000);
		start_date_firm.sendKeys("21/004/2022");
		Thread.sleep(4000);
		estimated_EE.clear();
		Thread.sleep(4000);
		estimated_EE.sendKeys("12789");
		Thread.sleep(4000);
		funding.clear();
		Thread.sleep(4000);
		funding.sendKeys("98712");       
		Thread.sleep(4000);
		ref_year01.click();
		Thread.sleep(4000);
		ref_year01.click();
		Thread.sleep(4000);
		tpa_Ref_yrs.click();
		Thread.sleep(4000);
		tpa_Ref_yrs.click();
		Thread.sleep(4000);

		//Robot Class

		r3.keyPress(KeyEvent.VK_DOWN);
		r3.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(4000);

		r3.keyPress(KeyEvent.VK_DOWN);
		r3.keyRelease(KeyEvent.VK_DOWN);

		r3.keyPress(KeyEvent.VK_ENTER);
		r3.keyRelease(KeyEvent.VK_ENTER);


		pbm_Ref_yrs.click();

		//Robot Class

		r4.keyPress(KeyEvent.VK_DOWN);
		r4.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(4000);
		r4.keyPress(KeyEvent.VK_DOWN);
		r4.keyRelease(KeyEvent.VK_DOWN);

		r4.keyPress(KeyEvent.VK_ENTER);
		r4.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		tpa_fees.clear();
		Thread.sleep(4000);
		tpa_fees.sendKeys("67850");
		Thread.sleep(4000);
		stop_loss_pre_paid.clear();
		Thread.sleep(4000);
		stop_loss_pre_paid.sendKeys("12370");
		Thread.sleep(4000);
		teleMedicine.click();
		Thread.sleep(4000);
		teleMedicine.click();
		Thread.sleep(4000);
		telemedicine_annual_cost.clear();
		Thread.sleep(4000);
		telemedicine_annual_cost.sendKeys("13000");
		Thread.sleep(4000);
		telebehavior_health.click();
		Thread.sleep(4000);
		telebehavior_health.click();
		Thread.sleep(4000);
		telebehaviorl_annual_cost.clear();
		Thread.sleep(4000);
		telebehaviorl_annual_cost.sendKeys("267980");
		Thread.sleep(4000);
		direct_primary_care.click();
		Thread.sleep(4000);
		direct_primary_care.click();
		Thread.sleep(4000);
		d_p_c_anul_cost.clear();
		Thread.sleep(4000);
		d_p_c_anul_cost.sendKeys("5876580");
		Thread.sleep(4000);
		v_primry_care.click();
		Thread.sleep(4000);
		v_primry_care.click();
		Thread.sleep(4000);
		v_p_c_anual_cost.clear();
		Thread.sleep(4000);
		v_p_c_anual_cost.sendKeys("344590");
		Thread.sleep(4000);
		seperate_map_veder.click();
		Thread.sleep(4000);
		seperate_map_veder.click();
		Thread.sleep(4000);
		map_vender_name.clear();
		Thread.sleep(4000);
		map_vender_name.sendKeys("Aman01");
		Thread.sleep(4000);
		map_vender_fee.clear();
		Thread.sleep(4000);
		map_vender_fee.sendKeys("123789");
		Thread.sleep(4000);
		map_vender_saving.clear();
		Thread.sleep(4000);
		map_vender_saving.sendKeys("23679");
		Thread.sleep(4000);
		js2.executeScript("arguments[0].scrollIntoView();", update_button);
		Thread.sleep(4000);
		update_button.click();



		//Import Data
		Thread.sleep(4000);
		import_Data.click();
		Thread.sleep(4000);
		add_file.sendKeys("C:\\Users\\Raneso\\Downloads\\client-load (1).csv");
		Thread.sleep(4000);
		upload_file_button.click();
		Thread.sleep(4000);
		// Import Logs
		importLogs.click();
		Thread.sleep(4000);

		js2.executeScript("arguments[0].scrollIntoView();", scrollSearchR);
		Thread.sleep(4000);
		js2.executeScript("arguments[0].scrollIntoView();",scrollSearchL);

		//ImportErrors
		Thread.sleep(4000);
		importError.click();

		Thread.sleep(4000);
		cancel_button.click();

		Thread.sleep(4000);
		search_key.sendKeys("RCB123",Keys.ENTER);

		Thread.sleep(4000);
		view_client.click();

		//Using Window Handling

	/*	//Primary Client Details
		Thread.sleep(4000);
		legel_f_name.sendKeys("Rajesh");
		Thread.sleep(4000);
		legel_m_initial.sendKeys("M");
		Thread.sleep(4000);
		legel_l_name.sendKeys("Abc");
		Thread.sleep(4000);
		client_title.sendKeys("Mr.");
		Thread.sleep(3000);
		js2.executeScript("arguments[0].scrollIntoView();", contact_update_next);
		Thread.sleep(3000);
		work_email.sendKeys("Qtesting@gmail.com");
		Thread.sleep(4000);
		work_phone.sendKeys("9876547890");
		Thread.sleep(4000);
		street_ads.sendKeys("abcdef");
		Thread.sleep(4000);
		street_ads1.sendKeys("jklmh1234");
		Thread.sleep(4000);
		province.sendKeys("Alaska");
		Thread.sleep(4000);
		town.sendKeys("Quest");
		Thread.sleep(4000);
		postal_code.sendKeys("65467");
		Thread.sleep(3000);
		js2.executeScript("arguments[0].scrollIntoView();",c_name );
		Thread.sleep(4000);
		c_name.sendKeys("Xyz");
		Thread.sleep(4000);
		c_f_name.sendKeys("AB");
		Thread.sleep(4000);
		c_l_name.sendKeys("XZ");
		Thread.sleep(4000);
		c_email.sendKeys("abce34@gmail.com");
		Thread.sleep(4000);
		c_phone.sendKeys("8756431290");
		Thread.sleep(4000);
		js2.executeScript("arguments[0].scrollIntoView();", contact_update_next);
		Thread.sleep(3000);
		contact_update_next.click();
		Thread.sleep(4000);

		//Company Informations
		legel_name.sendKeys("Automation Testing");
		Thread.sleep(4000);
		ein_reporting.sendKeys("44-4444488");
		Thread.sleep(4000);
		Select S = new Select(p_s_s_i);
		S.selectByIndex(5);
		Thread.sleep(4000);
		total_emp.sendKeys("34");
		Thread.sleep(4000);
		plan_gf.click();
		Thread.sleep(4000);
		group_trust.click();
		Thread.sleep(4000);
		name_of_plan.sendKeys("Qwerty22@@@@@@@@@@@");
		Thread.sleep(4000);
		health_plan_name.sendKeys("wer23333@@@@@@@@@@2@@@@@@@@@@@@!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		Thread.sleep(4000);
		members.sendKeys("1235678999");
		Thread.sleep(4000);
		f_5500.click();
		Thread.sleep(4000);
		plan_5000.sendKeys("qwerty23333");
		Thread.sleep(3000);
		js2.executeScript("arguments[0].scrollIntoView();", company_update_next);
		Thread.sleep(4000);
		company_update_next.click();

		//Aggregate Group Information

		Thread.sleep(4000);
		group_info.click();
		Thread.sleep(4000);
		group_name.sendKeys("@@@@@@@@@@@@@@@@@@@");
		Thread.sleep(4000);
		group_ein.sendKeys("123456789");
		Thread.sleep(4000);
		Select S1 = new Select(state_of_incop);
		S1.selectByIndex(7);
		Thread.sleep(4000);
		estimated_of_employee.sendKeys("0000000000");
		Thread.sleep(4000);

		add_row.click();
		Thread.sleep(4000);
		group_name.sendKeys("&&&&&&&&&&");
		Thread.sleep(4000);
		group_ein.sendKeys("7688888");
		Thread.sleep(4000);
		Select S2 = new Select(state_of_incop);
		S2.selectByIndex(9);
		Thread.sleep(4000);
		estimated_of_employee.sendKeys("12345");
		Thread.sleep(4000);

		remove_button.click();
		Thread.sleep(4000);

		ag_update.click();

		//Your Entity Employee Contributions
		Thread.sleep(4000);
		annual_employee.sendKeys("2345");
		Thread.sleep(4000);
		aca_reporting.click();
		Thread.sleep(4000);
		aca_details.sendKeys("sdd@@@@@@1222");
		Thread.sleep(4000);
		perception_drug.click();
		Thread.sleep(4000);
		contribution_details.sendKeys("wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww222222222@@@@@@@@@@@@");
		Thread.sleep(4000);
		js2.executeScript("arguments[0].scrollIntoView();",contrl_update );
		Thread.sleep(4000);

		pharmecy_benefits.click();
		Thread.sleep(4000);
		assignment_details.sendKeys("weerttt@@@@");
		Thread.sleep(4000);

		prescription_drug.click();
		Thread.sleep(4000);
		structure_details.sendKeys("adfcser");
		Thread.sleep(4000);
		contrl_update.click();

		//Plan Years.....................

		plan_year.click();
		Thread.sleep(4000);
		start_date.sendKeys("05/04/2021");
		Thread.sleep(4000);
		end_date.sendKeys("04/03/2021");
		Thread.sleep(4000);
		Select S01 = new Select(plan_type);
		S01.selectByIndex(3);
		Thread.sleep(4000);
		Select S02 = new Select(tpa_plan_year);
		S02.selectByIndex(2);
		Thread.sleep(4000);
		Select S03 = new Select(pbm_plan_yrear);
		S03.selectByIndex(1);
		Thread.sleep(4000);
		save_plan_year.click();
		Thread.sleep(4000);
		edit_plan_year.click();
		Thread.sleep(4000);
		start_date.clear();
		Thread.sleep(4000);
		start_date.sendKeys("05/04/2021");
		Thread.sleep(4000);
		end_date.clear();
		end_date.sendKeys("04/03/2021");
		Thread.sleep(4000);
		Select S011 = new Select(plan_type);
		S011.selectByIndex(4);
		Thread.sleep(4000);
		Select S022 = new Select(tpa_plan_year);
		S022.selectByIndex(2);
		Thread.sleep(4000);
		Select S033 = new Select(pbm_plan_yrear);
		S033.selectByIndex(2);
		Thread.sleep(4000);	
		update_plan_year.click();

		/////////fillings/////////////////////////

		Thread.sleep(4000);

		filings.click();
		Thread.sleep(4000);
		checkbox01.click();
		Thread.sleep(4000);
		checkbox02.click();
		Thread.sleep(4000);
		checkbox03.click();

		Thread.sleep(4000);
		js2.executeScript("arguments[0].scrollIntoView();",filings_update);

		Thread.sleep(4000);
		filings_update.click();


		//////Client Data//////////////////

		Thread.sleep(4000);
		reporting_data01.click();
		Thread.sleep(4000);
		medical_clam.sendKeys("2,232,222");
		Thread.sleep(4000);
		pharmacy_claim.sendKeys("$23,444");
		Thread.sleep(4000);
		plan_admn_fee.sendKeys("$345");
		Thread.sleep(4000);
		stop_loss_premium.sendKeys("$97");
		Thread.sleep(4000);
		telemedicine_not_via_tpa.sendKeys("$3,431");
		Thread.sleep(4000);
		d_v_not_virtual_paid.sendKeys("$3,456");
		Thread.sleep(4000);
		stop_loss_rembrusment.sendKeys("$345");
		Thread.sleep(4000);
		prescription_drug_rebate.sendKeys("$5,678");
		Thread.sleep(4000);
		m_assistance_save.sendKeys("$345");
		Thread.sleep(4000);

		js2.executeScript("arguments[0].scrollIntoView();",update_next );
		Thread.sleep(4000);
		js2.executeScript("arguments[0].scrollIntoView();" ,data_files);
		Thread.sleep(4000);
		upload_d1_data_file.sendKeys("C:\\Users\\Raneso\\Downloads\\MyStoreTestData.xlsx");
		Thread.sleep(4000);
		js2.executeScript("arguments[0].scrollIntoView();",update_next);
		Thread.sleep(3000);
		update_next.click();


		Thread.sleep(3000);
		total_spending_hospital.sendKeys("$23,333");
		Thread.sleep(3000);
		cost_sharing_hospital.sendKeys("$890");
		Thread.sleep(3000);
		amount_N_applied_hospital.sendKeys("$100");
		Thread.sleep(3000);
		primry_care_spending.sendKeys("$34,567");
		Thread.sleep(3000);
		cost_sharing_primary_care.sendKeys("$789");
		Thread.sleep(3000);
		amount_not_applied_primary_care.sendKeys("$200");
		Thread.sleep(3000);
		speciality_care_spending.sendKeys("$1,239");
		Thread.sleep(3000);
		cost_sharing_special_care.sendKeys("$678");
		Thread.sleep(3000);
		amount_not_applied_special_care.sendKeys("$300");
		Thread.sleep(3000);
		medical_cost_and_service.sendKeys("$5,678");
		Thread.sleep(3000);
		cost_sharing_medial_cost_service.sendKeys("$456");
		Thread.sleep(3000);
		amount_applied_medical_cost_services.sendKeys("$400");
		Thread.sleep(3000);
		know_medical_benifits_drugs.sendKeys("$123");
		Thread.sleep(3000);
		cost_sharing_medical_benefits_drugs.sendKeys("$345");
		Thread.sleep(3000);
		amount_not_applied_medical_benefits_drugs.sendKeys("$500");
		Thread.sleep(3000);
		estimated_medical_benefits_drugs.sendKeys("$34,566");
		Thread.sleep(3000);
		cost_sharing_estimated_benefits_drugs.sendKeys("$234");
		Thread.sleep(3000);
		amount_N_estimated_medical_benefits_drugs.sendKeys("$600");
		Thread.sleep(3000);
		add_file_reporting.sendKeys("C:\\Users\\Raneso\\Downloads\\MyStoreTestData.xlsx");
		Thread.sleep(3000);

		update_next_reporting.click();



		
		Thread.sleep(3000);
		upload_D8_data_file01.sendKeys("C:\\Users\\Raneso\\Downloads\\clientImprotLogs.xlsx");
		Thread.sleep(3000);
		upload_D8_data_file02.sendKeys("C:\\Users\\Raneso\\Downloads\\Summary.xlsx");
		Thread.sleep(3000);
		upload_D8_data_file03.sendKeys("C:\\Users\\Raneso\\Downloads\\MyStoreTestData.xlsx");
		Thread.sleep(3000);
		upload_D8_data_file04.sendKeys("C:\\Users\\Raneso\\Desktop\\TestData.xlsx");
		Thread.sleep(3000);
		
		
		
		
		js2.executeScript("arguments[0].scrollIntoView();",submit_button);
		Thread.sleep(4000);
		submit_button.click();
*/







	}



}
