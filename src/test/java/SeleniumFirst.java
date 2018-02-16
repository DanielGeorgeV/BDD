import cucumber.api.Format;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;

import org.junit.Assert;

public class SeleniumFirst {

    @Given("Hello World")
    public void hello_world(){
        System.out.println("Given clause");
    }

    @When("2nd Hello World")
    public void nd_hello_world(){
        System.out.println("When clause");
    }

    @Then("3rd Hello World")
    public void rd_hello_world(){
        System.out.println("Then clause");
        //throw new ClassCastException();
        //Assert.assertTrue(true==false);
    }

    @And("4th Hello World")
    public void th_hello_world(){
        System.out.println("And clause");
    }

    @But("5th Hello World")
    public void th5_hello_world(){
        System.out.println("But clause");
    }

    @And("This is cool")
    public void cucumbertest(){
        System.out.println("This is cool");
    }
}
