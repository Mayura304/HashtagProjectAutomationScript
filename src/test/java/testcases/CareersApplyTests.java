package testcases;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.ReadDataFromPropFile;

public class CareersApplyTests extends BaseTests {

	@Test(priority = 1)
	public void nameLabelValidation() {
		String ActualNameLabel = cp.nameLabel();
		String ExpectedNameLabel = "NAME";
		Assert.assertEquals(ExpectedNameLabel, ActualNameLabel);
	}

	@Test(priority = 2)
	public void nameTextboxValidation() throws IOException {
		cp.nameTextbox(ReadDataFromPropFile.readConfigData("name"));
	}

	@Test(priority = 3)
	public void emailLabelValidation() {
		String ActualEmailLabel = cp.emailLabel();
		String ExpectedEmailLabel = "EMAIL";
		Assert.assertEquals(ExpectedEmailLabel, ActualEmailLabel);
	}

	@Test(priority = 4)
	public void emailTextboxValidation() throws IOException {
		cp.emailTextbox(ReadDataFromPropFile.readConfigData("email"));
	}

	@Test(priority = 6)
	public void phoneLabelValidation() {
		String ActualPhoneLabel = cp.phoneLabel();
		String ExpectedPhoneLabel = "PHONE";
		Assert.assertEquals(ExpectedPhoneLabel, ActualPhoneLabel);
	}

	@Test(priority = 7)
	public void phoneTextboxValidation() throws IOException {
		cp.phoneTextbox(ReadDataFromPropFile.readConfigData("phone"));
	}

	@Test(priority = 8)
	public void resumeLabelValidation() {
		String ActualResumeLabel = cp.resumeLabel();
		String ExpectedResumeLabel = "RESUME";
		Assert.assertEquals(ExpectedResumeLabel, ActualResumeLabel);
	}

	@Test(priority = 9)
	public void resumeTextboxValidation() {
		
		String project_path = System.getProperty("user.dir");
		cp.resumeTextbox(project_path);
	}

	@Test(priority = 10)
	public void descriptionLabelValidation() {
		String ActualDescLabel = cp.descriptionLabel();
		String ExpectedDescLabel = "DESCRIPTION";
		Assert.assertEquals(ExpectedDescLabel, ActualDescLabel);
	}
	
	@Test(priority = 11)
	public void descriptionTextboxValidation() throws InterruptedException, IOException {
		cp.descriptionTextbox(ReadDataFromPropFile.readConfigData("description"));
	}

	@Test(priority = 12)
	public void applyNowButtonLabelValidation() {
		String ActualApplyNowLabel = cp.applyNowButtonLabel();
		String ExpectedApplyNowLabel = "APPLY NOW";
		Assert.assertEquals(ActualApplyNowLabel, ExpectedApplyNowLabel);
	}
	
	@Test(priority = 13)
	public void applyNowButtonValidation() {
		cp.applyNowButton();
	}

}
