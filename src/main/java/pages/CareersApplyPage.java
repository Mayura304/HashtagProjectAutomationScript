package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CareersApplyPage {

	WebDriver driver;

	@FindBy(xpath="//*[@name='name']") WebElement NameText;
	@FindBy(xpath="//*[text()='Name']") WebElement NameLabel;
	@FindBy(xpath="//*[@name='email']") WebElement EmailText;
	@FindBy(xpath="//*[text()='Email']") WebElement EmailLabel;
	@FindBy(xpath="//*[@name='phone']") WebElement PhoneText;
	@FindBy(xpath="//*[text()='Phone']") WebElement PhoneLabel;
	@FindBy(xpath="//*[@id='inputFile']") WebElement ResumeFile;
	@FindBy(xpath="//*[text()='Resume']") WebElement ResumeLabel;
	@FindBy(xpath="(//*[@name='description'])[2]") WebElement DescriptionText;
	@FindBy(xpath="//*[text()='Description']") WebElement DescriptionLabel;
	@FindBy(xpath="//*[text()='APPLY NOW']") WebElement Apply_NowButton;

	public CareersApplyPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void scrollPage() {

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)");
	}

	public String nameLabel() {
		String ShowNameLabel = NameLabel.getText();
		return ShowNameLabel;
	}

	public void nameTextbox(String name) {
		NameText.sendKeys(name);
	}

	public String emailLabel() {
		String ShowEmailLabel = EmailLabel.getText();
		return ShowEmailLabel;
	}

	public void emailTextbox(String email) {
		EmailText.sendKeys(email);
	}

	public String phoneLabel() {

		String ShowPhoneLabel = PhoneLabel.getText();
		return ShowPhoneLabel ;

	}

	public void phoneTextbox(String phone) {
		PhoneText.sendKeys(phone);
	}



	public String resumeLabel() {
		String ShowResumeLabel = ResumeLabel.getText();
		return ShowResumeLabel;
	}

	public void resumeTextbox(String project_path) {

		ResumeFile.sendKeys(project_path+"\\testsdata\\resume.pdf");
	}

	public String descriptionLabel() {
		String ShowDescriptionLabel = DescriptionLabel.getText();
		return ShowDescriptionLabel;
	}
	public void descriptionTextbox(String description) throws InterruptedException {
		DescriptionText.sendKeys(description);
		Thread.sleep(3000);
	}

	public String applyNowButtonLabel() {
		String ShowApplyNowButtonLabel = Apply_NowButton.getText();
		return ShowApplyNowButtonLabel;
	}
	public void applyNowButton() {
		Apply_NowButton.submit();
	}



}
