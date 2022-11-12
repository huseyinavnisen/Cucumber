package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class GridStepDefs {
    WebDriver driver;

    @Given("user is on the application_url {string}")
    public void user_is_on_the_application_url(String url) throws MalformedURLException {
        new RemoteWebDriver(new URL("http://192.168.1.156:4444"),new ChromeOptions());




    }
    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String string) {




    }
    @Then("close the remote driver")
    public void close_the_remote_driver() {




    }


}