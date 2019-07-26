package StepDefinitions;

import org.openqa.selenium.WebDriver;

import com.PuppyFind.Pages.FindAPuppyPage;
import com.PuppyFind.Pages.HomePage;
import com.PuppyFind.Pages.LoginPage;
import com.PuppyFind.Pages.SearchOptionsPage;

import base.TextContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import managers.PageObjectManager;
import managers.WebDriverManager;

public class SearchOptionsStepDef {
	
	//WebDriver driver;

	
	//PageObjectManager pageObjectManager;
	//WebDriverManager webDriverManager;
	
	TextContext testContext;
	LoginPage loginPage;
	FindAPuppyPage findAPuppyPage;
	SearchOptionsPage searchOptionsPage;
	
	 public SearchOptionsStepDef(TextContext context) {
	 testContext = context;
	 loginPage = testContext.getPageObjectManager().getLoginPage();
	 findAPuppyPage = testContext.getPageObjectManager().getFindAPuppyPage();
	 searchOptionsPage = testContext.getPageObjectManager().getSearchOptionsPage();
	 }
	
	
	@Given("^user is on find a puppy$")
	public void user_is_on_find_a_puppy(){
		//webDriverManager = new WebDriverManager();
		//driver = webDriverManager.getDriver();
		//pageObjectManager = new PageObjectManager(driver);
		//findAPuppyPage = pageObjectManager.getFindAPuppyPage();
		findAPuppyPage.PuppyFind.click();
	    
	}


	
	@When("^user enters the breed name$")
	public void user_enters_the_breed_name() {
		//pageObjectManager = new PageObjectManager(driver);
		//searchOptionsPage = pageObjectManager.getSearchOptionsPage();
		searchOptionsPage.searchOptions("Golden");
		
	   
	}

	@Then("^user verifies search results appeared in dropdown and selects puppy$")
	public void user_verifies_search_results_appeared_in_dropdown_and_selects_puppy() {
	   searchOptionsPage.searchOptionsdropdown();
	    
	}


	@Then("^user verifies the selectes item is displayed on the page$")
	public void user_verifies_the_selectes_item_is_displayed_on_the_page()  {
	    String url = testContext.webDriverManager.driver.getCurrentUrl();
	    Assert.assertEquals("https://www.puppyfind.com/search/?submit=1&str=Golden+Retriever", url);
	    testContext.webDriverManager.closeDriver();
	    
	}

}
