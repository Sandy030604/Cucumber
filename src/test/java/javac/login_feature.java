package javac;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_feature {
    WebDriver driver;

    @Given("launch the browser")
    public void launch_the_browser() {
        // Write code here that turns the phrase above into concrete actions
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }

    @Given("Navigate to the URL")
    public void navigate_to_the_url() {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://demo.opencart.com/en-gb?route=account/login");

    }

    @When("Enter the valid username and password")
    public void enter_the_valid_username_and_password() {
        driver.findElement(By.id("input-email")).sendKeys("santhoshs8483@gmail.com");
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("input-password")).sendKeys("aaradhana28");

    }

    @When("Click on login button")
    public void click_on_login_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(4000);

    }

    @Then("login should be successful")
    public void login_should_be_successful() {
        // Write code here that turns the phrase above into concrete actions
        if(driver.findElement(By.linkText("Logout")).isDisplayed())
        {
            System.out.println("Login successful");
        }
        else
        {
            if(driver.findElement(By.linkText("Logout")).isDisplayed())
            {
                System.out.println("Login unsuccessful");
            }
        }
    }

    @When("Enter the invalid username and password")
    public void enter_the_invalid_username_and_password() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("input-email")).sendKeys("santhoshs84843@gmail.com");
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("input-password")).sendKeys("aaradhana28");
    }

    @Then("login should be unsuccessful")
    public void login_should_be_unsuccessful() {
        if(driver.findElement(By.linkText("Logout")).isDisplayed())
        {
            System.out.println("Login successfull");
        }
        else
        {
            System.out.println("Login unsuccessful");
        }
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
