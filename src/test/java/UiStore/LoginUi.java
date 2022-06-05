package UiStore;

import org.openqa.selenium.By;

public class LoginUi { 
 
	public static By click1=By.xpath("//div[@class='nb__19hcF'][normalize-space()='Log in']");
	//<div class="nb__19hcF">Log in</div>
	//public static By clickligin=By.linkText("Log In");
	public static By username=By.xpath("//input[@id='signUp-phoneNumber']");
			//descendant::input[@type='email']");
	//<input type="tel" maxlength="10" autocomplete="tel" class="form-control" name="" id="signUp-phoneNumber" placeholder="Enter Mobile Number" value="">
	//public static By password=By.xpath("//form[@name='login_form']/descendant::input[@type='password']");
	public static By login=By.xpath("//button[@id='signUpSubmit']");
	//<button class="btn btn-primary" id="signUpSubmit" type="submit">Continue</button>
}
