package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.PuppyFind.Pages.ContactSellerPage;
import com.PuppyFind.Pages.FindAPuppyPage;
import com.PuppyFind.Pages.HomePage;
import com.PuppyFind.Pages.LoginPage;

import base.TextContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.PageObjectManager;
import managers.WebDriverManager;

public class ContactSellerStepDef {
	
	
	 // WebDriver driver; 
	  FindAPuppyPage findAPuppyPage;
	  
	  HomePage homePage; 
	  LoginPage loginPage; 
	 // PageObjectManager pageObjectManager;
	 // WebDriverManager webDriverManager;
	 
	
	TextContext testContext;
	ContactSellerPage contactSellerPage;
	 
	 public ContactSellerStepDef(TextContext context) {
	 testContext = context;
	 contactSellerPage = testContext.getPageObjectManager().getContactSellerPage();
	 findAPuppyPage = testContext.getPageObjectManager().getFindAPuppyPage();
	 loginPage = testContext.getPageObjectManager().getLoginPage();
	 homePage = testContext.getPageObjectManager().getHomePage();
	 }
	
	@When("^user searchs for puppy$")
	public void user_searchs_for_puppy() throws InterruptedException {
		
        findAPuppyPage = testContext.pageObjectManager.getFindAPuppyPage();
        findAPuppyPage.byLifeStyle("m", "e", "pet");
             
	}

	@When("^user clicks puppy for sale and select a puppy$")
	public void user_clicks_puppy_for_sale_and_select_a_puppy() throws InterruptedException{
		//contactSellerPage = pageObjectManager.getContactSellerPage();
		contactSellerPage.selectPuppy();
	    
	}


	@And("^user clicks on add favorites$")
	public void user_clicks_on_add_favorites() throws InterruptedException {
		contactSellerPage.addFavorites();
	    
	}

	@Then("^click on contact via email$")
	public void click_on_contact_via_email() {
		contactSellerPage.contactSellerforPuppy();
		testContext.webDriverManager.closeDriver();
	    
	}
	
	@Then("^user checks the number of puppies in favorites$")
	public void user_verifies_the_number_of_puppies_in_favorites() {
		//contactSellerPage=pageObjectManager.getContactSellerPage();
		contactSellerPage.countMyFavorites();
	}

	
	  @Then("^user add a puppy to favorites$") public void
	  user_add_a_puppy_to_favorites() throws InterruptedException {
	
	  //findAPuppyPage = pageObjectManager.getFindAPuppyPage();
	  findAPuppyPage.byLifeStyle("m", "e", "pet"); contactSellerPage.selectPuppy();
	  contactSellerPage.addFavorites(); 
	  }
	 
	  

	@Then("^user verifies the number of puppies in favorites after adding another puppy$")
	public void user_verifies_the_number_of_puppies_in_favorites_after_adding_another_puppy() {
		contactSellerPage.countMyFavorites();
		testContext.webDriverManager.closeDriver();

}
}