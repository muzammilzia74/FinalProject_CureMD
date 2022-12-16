package ProjecFinal;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class FinalProject1 {
	WebDriver driver;
	Logger logger = LogManager.getLogger("FinalProject1");
	
	@FindBy(id="vchLogin_Name")
	WebElement userName;

	@FindBy(id="vchPassword")
	WebElement password;

	@FindBy(xpath="//button[text()='Login']")
	WebElement logInButton;

	@FindBy(id="fra_Menu_CureMD")
	WebElement frame1;

	@FindBy(xpath="//i[@class='icon icon-patient']")
	WebElement patient;

	@FindBy(id="fraCureMD_Body")
	WebElement frame2;

	@FindBy(xpath="//td[@title='Add Patient']")
	WebElement addPatient;

	@FindBy(id="cmbVTitle")
	WebElement title;
	
	@FindBy(id="txtVFNAME")
	WebElement firstName;
	
	@FindBy(id="txtVLNAME")
	WebElement lastName;

	@FindBy(id="cmbVSEX")
	WebElement gender;
	
	@FindBy(id="txtDDOB")
	WebElement DOB;
	
	@FindBy(id="cmbILOCID")
	WebElement location;
	
	@FindBy(id="txtVZIP")
	WebElement zip;
	
	@FindBy(id="txtvcity")
	WebElement city;
	
	@FindBy(id="txtVSTATE")
	WebElement state;
	
	@FindBy(id="txtVEMAIL")
	WebElement email;

	@FindBy(id="imgpInsurance")
	WebElement iconPrimInsurance;
	
	@FindBy(id="cmbIPLANID")
	WebElement plan;
	
	@FindBy(id="cmbPlanAdd")
	WebElement address;
	
	@FindBy(id="imgSInsurance")
	WebElement iconSECInsurance;
	
	@FindBy(id="cmbSECPLANID")
	WebElement planSEC;
	
	@FindBy(id="cmbSecPlanAdd")
	WebElement addressSEC;

	@FindBy(id="txtSecDSIGNONFILE")
	WebElement dateSEC;
	
	@FindBy(id="tdsave")
	WebElement save;
	
	@FindBy(xpath="//iframe[@id='DynamicBHdialogbox']")
	WebElement frame3;
	
	@FindBy(id="saveAsNewButton")
	WebElement saveAsNew;

	@FindBy(id="fraCureMD_Patient_Menu")
	WebElement frame4;

	@FindBy(xpath="//a[@id='Provider_Notes_anchor']")
	WebElement ProviderNotes;

	@FindBy(id="Provider_Notes_New_Case_anchor")
	WebElement newCase;
	
	@FindBy(id="txtVCNAME")
	WebElement caseName;

	@FindBy(id="cmdSubmit")
	WebElement saveButton2;
	
	@FindBy(id="Provider_Notes_Provider_Notes")
	WebElement ProviderNotes2;

	@FindBy(id="SpAdd1")
	WebElement addProviderNotes;

	@FindBy(id="Sdate")
	WebElement Date;

	@FindBy(id="cmbProvider")
	WebElement Provider;

	@FindBy(id="cmbRTemplate")
	WebElement noteTemplate;
	
	@FindBy(id="txtVREASON")
	WebElement visitReason;

	@FindBy(id="cmbLocation")
	WebElement location2;

	@FindBy(id="btnSave")
	WebElement createButton;

	@FindBy(xpath="//a[@id='Clinical_Diagnoses_6_anchor']//child::a")
	WebElement  addDiagnosis;
	
	@FindBy(id="DynamicBHdialogbox")
	WebElement frame5;

	@FindBy(id="txtKeyword")
	WebElement ICDsearchField;

	@FindBy(id="imgMaster")
	WebElement searchButtonICD;

	@FindBy(id="0")
	WebElement rsultShown;
	
	@FindBy(id="tdSaveDiagnosis")
	WebElement saveDiagnosisButton;
	
	@FindBy(id="tdSoapAccept")
	WebElement acceptButton;

	@FindBy(id="Clinical_Lab_Order_7_anchor")
	WebElement orders;
	
	@FindBy(xpath="//a[@id='OrderResult_8_2_anchor']//child::a")
	WebElement addProcedure;	
	
	@FindBy(id="txtSearch")
	WebElement procedureCodeSearchField;
	
	@FindBy(id="SearchImg")
	WebElement CodeSearchButton;

	@FindBy(xpath="//ul[@id='ulSearchResultFav']//child::a")
	WebElement  firstOption;
	
	@FindBy(id="tdSaveDiagnosis")
	WebElement saveAndAcceptButton;

	@FindBy(id="sp_eSuperbill")
	WebElement eSuperBillButton;	 

	@FindBy(id="frm")
	WebElement frame6;
	
	@FindBy(id="ddleandm")
	WebElement EvaluationAndManagement;
	
	@FindBy(id="chk99211")
	WebElement checkBox;

	@FindBy(id="gvSuperBill_ctl02_txtDxPointer")
	WebElement DxPtr;

	@FindBy(id="chkDxPointer_1")
	WebElement DxPtrCheckBox;
	
	@FindBy(id="gvSuperBill_ctl02_txtAmount")
	WebElement amount;

	
	public FinalProject1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	  }
	 static void WindowHandler(WebDriver driver) {
		for (String tab1 : driver.getWindowHandles()) {
			driver.switchTo().window(tab1);
		}		
	  }	
	  public void LogIn() throws InterruptedException {
		  userName.sendKeys("ChargePOS");
		  logger.info("userName Entered ");
		  password.sendKeys("SuPPort.2014");
		  logger.info("userPassword Entered ");
		  logInButton.click();
		  logger.info("LoggedIn Successfully");
		  WindowHandler(driver);
    	  Thread.sleep(4000);
    	  driver.switchTo().frame(frame1);
		  Assert.assertTrue(patient.isDisplayed());
	  }	  
      public void AddPatient() throws InterruptedException {
    	  Thread.sleep(2000);
	      patient.click();
	      logger.info("Patient Button Clicked ");
	      driver.switchTo().defaultContent();
		  Thread.sleep(1000);
		  driver.switchTo().frame(frame2);
		  Thread.sleep(1000);
		  addPatient.click();
		  Thread.sleep(1000);
		  Select patientTitle  =new Select(title);
		  patientTitle.selectByIndex(3);
		  logger.info("Patient Title Selected ");
		  firstName.sendKeys("Maan");
		  logger.info("Patient First Name Entered ");
		  lastName.sendKeys("Ashir");
		  logger.info("Patient Last Name Entered ");
		  Select patientGender  =new Select(gender);
		  patientGender.selectByIndex(0);
		  logger.info("Patient Gender Selected ");
		  Thread.sleep(2000);
		  DOB.sendKeys("08/10/2006");
		  Select clinicLocation  =new Select(location);
		  clinicLocation.selectByIndex(3);
		  logger.info("Clinic Location Selected ");
		  Thread.sleep(2000);
		  zip.sendKeys("90002");
		  city.sendKeys("Los Angeles");
		  state.sendKeys("California");
		  email.sendKeys("joephilip@gmail.com"); 
		  logger.info("User Email Entered ");  
		  Thread.sleep(2000);
		  iconPrimInsurance.click();
		  Thread.sleep(2000);
		  Select plan1  =new Select(plan);
		  plan1.selectByIndex(3);
		  logger.info("Plan1 Selected ");
		  Thread.sleep(2000);
		  Select address1 =new Select(address);
		  address1.selectByIndex(1);
		  logger.info("Address1 Selected ");
		  
		  Thread.sleep(2000);
		  iconSECInsurance.click();
		  Thread.sleep(2000);
		  Select plan2  =new Select(planSEC);
		  plan2.selectByIndex(1);
		  logger.info("Plan2 Selected ");
		  Thread.sleep(2000);
		  Select address2 =new Select(addressSEC);
		  address2.selectByIndex(1);
		  logger.info("Address2 Selected ");
		  dateSEC.clear();
		  dateSEC.sendKeys("12/15/2022");
		  
		  Actions action = new Actions(driver);
	      action.sendKeys(Keys.PAGE_UP).build().perform();
	      action.sendKeys(Keys.PAGE_UP).build().perform();
		  save.click();
		  /*Thread.sleep(2000);  
		  driver.switchTo().defaultContent();
		  driver.switchTo().frame(frame3);
		  Thread.sleep(2000);
		  saveAsNew.click();*/
	  
		  logger.info("Patient Added successfully");
    	  Thread.sleep(2000);
    	  driver.switchTo().defaultContent();
    	  driver.switchTo().frame(frame4);
    	  Assert.assertTrue(ProviderNotes.isDisplayed());
      }    
      public void CreateCase() throws InterruptedException {
    	  
    	  Thread.sleep(2000);
    	  ProviderNotes.click();
    	  logger.info("ProviderNotes Button Clicked ");
    	  Thread.sleep(1000);
    	  newCase.click();
    	  Thread.sleep(1000);
	      driver.switchTo().defaultContent();
		  driver.switchTo().frame(frame2);
		  Thread.sleep(1000);
		  caseName.sendKeys("Accident");
		  logger.info("Case Name Entered");
		  saveButton2.click();
		  logger.info("Case Name Added");
		  
    	  Thread.sleep(2000);
    	  driver.switchTo().defaultContent();
    	  driver.switchTo().frame(frame4);
    	  Assert.assertTrue(ProviderNotes2.isDisplayed());
      }
      public void CreateProviderNote() throws InterruptedException {
    	
    	  Thread.sleep(2000);
    	  ProviderNotes2.click();
    	  logger.info("ProviderNotes2 is Clicked ");
    	  Thread.sleep(1000);
	      driver.switchTo().defaultContent();
		  driver.switchTo().frame(frame2);
		  Thread.sleep(1000);
		  addProviderNotes.click();
		  logger.info("Add Button of ProviderNotes2 is Clicked ");
		  Thread.sleep(2000);
		  Date.sendKeys("12/15/2022");
		  logger.info("Date is Entered ");
		  Thread.sleep(2000);
		  Select provider1  =new Select(Provider);
		  provider1.selectByIndex(3);
		  logger.info("Provider1 Selected ");
		  Thread.sleep(2000);
		  Select noteTemplate1  =new Select(noteTemplate);
		  noteTemplate1.selectByIndex(4);
		  logger.info("NoteTemplate1 Selected");
		  Thread.sleep(2000);
		  Select visitReason1  =new Select(visitReason);
		  visitReason1.selectByIndex(2);
		  logger.info("VisitReason1 Selected ");
		  Select location  =new Select(location2);
		  location.selectByIndex(3);
		  logger.info("Location  Selected ");
		  Thread.sleep(1000);
		  createButton.click();
		  Thread.sleep(2000);
    	  driver.switchTo().defaultContent();
    	  driver.switchTo().frame(frame4);
    	  Assert.assertTrue(addDiagnosis.isDisplayed());
      }
      public void AddDiagnosis() throws InterruptedException{
    	
    	  Thread.sleep(2000);
    	  addDiagnosis.click();  	  
    	  Thread.sleep(2000);
    	  driver.switchTo().defaultContent();
    	  driver.switchTo().frame(frame5);
    	  Thread.sleep(2000);
    	  ICDsearchField.sendKeys("A00.0");
    	  logger.info("A00.0 Entered");
    	  Thread.sleep(1000);
    	  searchButtonICD.click();
    	  Thread.sleep(1000);
    	  rsultShown.click();
    	  logger.info("RsultShown Clicked");
    	  Thread.sleep(1000);
    	  saveDiagnosisButton.click();
    	  logger.info("Save Diagnosis Button Clicked");
    	  Thread.sleep(1000);
    	  acceptButton.click();
    	  logger.info("Accept Button Clicked");
    	  Thread.sleep(2000);
    	  driver.switchTo().defaultContent();
    	  driver.switchTo().frame(frame4);
    	  Assert.assertTrue(orders.isDisplayed());
      }
      public void AddProcedure() throws InterruptedException{
      
    	  Thread.sleep(2000);
    	  orders.click();
    	  logger.info("Orders Clicked");
    	  Thread.sleep(1000);
    	  addProcedure.click();
    	  logger.info("Add Procedure Clicked");
    	  Thread.sleep(2000);
    	  driver.switchTo().defaultContent();
    	  driver.switchTo().frame(frame5);
    	  Thread.sleep(2000);
    	  procedureCodeSearchField.sendKeys("99211");
    	  Thread.sleep(1000);
    	  logger.info("99211 Entered");
    	  CodeSearchButton.click();
    	  Thread.sleep(1000);
    	  firstOption.click();
    	  Thread.sleep(1000);
    	  saveAndAcceptButton.click();
    	  logger.info("Save And Accept Button Clicked");
      }
      public void CreateeSuperBill() throws InterruptedException{
    	  
    	  Thread.sleep(2000);
    	  driver.switchTo().defaultContent();
    	  driver.switchTo().frame(frame2);
    	  Thread.sleep(2000);
    	  eSuperBillButton.click();
    	  Thread.sleep(2000);
    	  driver.switchTo().defaultContent();
    	  driver.switchTo().frame(frame5);
    	  Thread.sleep(2000);
		  Select evaluation1 =new Select(EvaluationAndManagement);
		  evaluation1.selectByIndex(2);
		  Thread.sleep(2000);
		  checkBox.click();
		  checkBox.click();
		  DxPtr.click();
		  Thread.sleep(2000);
		  DxPtrCheckBox.click();
		  Thread.sleep(1000);
		  amount.sendKeys("10");
		  Thread.sleep(2000);
      }
}
