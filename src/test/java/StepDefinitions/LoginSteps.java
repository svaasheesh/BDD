package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {


	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("Login success!");
		
	}

	@When("user enters the username and password")
	public void user_enters_the_username_and_password() {
		System.out.println("Login success!");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("Login success!");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("Login success!");
	}

	@When("user enters the user1 and pass1")
	public void user_enters_the_user1_and_pass1() {
		System.out.println("Login success!");
	}

	@When("user enters the user2 and pass2")
	public void user_enters_the_user2_and_pass2() {
		System.out.println("Login success!");
	}


}
