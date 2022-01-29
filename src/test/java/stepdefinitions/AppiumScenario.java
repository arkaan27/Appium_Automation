/**
 * Step Definitions of the Features file Allocations
 *
 * Author: Arkaan Quanunga
 *
 * Date: 28/01/2022
 *
 */

package stepdefinitions;

import Utilities.Hook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AppiumScenario {
    private WebDriver driver;
    private ArrayList<String> actual_data;
    private ArrayList<String> expected_data;
    public AppiumScenario(){
        this.driver = Hook.getDriver();
    }


    @Given("the user is on allocation tab")
    public void theUserIsOnAllocationTab() {

        // Making sure all 3 options are available for the user

        Assert.assertTrue(driver.findElement(By.xpath("//Button[@id='allocationtypeCaution']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//Button[@id='allocationtypeBalanced']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//Button[@id='allocationtypeAdventurous']")).isDisplayed());

    }

    @When("user clicks on Cautious button")
    public void userClicksOnCautionButton() {

        // Clicking on the Cautious Button

        driver.findElement(By.xpath("//[@id='allocationtypeCaution']")).click();

       // Extract actual data

        // Getting the actual percentage
        String actual1= driver.findElement(By.xpath("//[@id='allocationpercentage4']")).getText();
        String actual2= driver.findElement(By.xpath("//[@id='allocationpercentage5']")).getText();
        String actual3= driver.findElement(By.xpath("//[@id='allocationpercentage6']")).getText();

        // Creating a Caution Actual Array
        ArrayList<String> Caution_Actual= new ArrayList<>();

        // Adding values to Caution Actual Array

        Caution_Actual.add(actual1);
        Caution_Actual.add(actual2);
        Caution_Actual.add(actual3);

        // Setting Global Variable Actual data to Caution Actual Array
        setActual_data(Caution_Actual);
    }


    @Then("user can see Allocations of {int}%, {int}%, {int}%")
    public void userCanSeeAllocationsOf(int arg0, int arg1, int arg2) {

        // Adding to expected data
        ArrayList<String> Expected_data = new ArrayList<>();
        Expected_data.add(String.format("%d",arg0));
        Expected_data.add(String.format("%d",arg1));
        Expected_data.add(String.format("%d",arg2));


        // Adding Percentage to each data
        for (String data: Expected_data){
            data +=  '%';
        }

        setExpected_data(Expected_data);
        ArrayList<String> Actual_data= getActual_data();
        Assert.assertEquals("Testing for Allocations: ", getExpected_data(),getActual_data());

    }

    @When("user clicks on balanced button")
    public void userClicksOnBalancedButton() {

        // Clicking on the Cautious Button
        driver.findElement(By.xpath("//[@id='allocationtypeBalanced']")).click();

        // Getting the actual percentage
        String actual1= driver.findElement(By.xpath("//[@id='allocationpercentage1']")).getText();
        String actual2= driver.findElement(By.xpath("//[@id='allocationpercentage2']")).getText();
        String actual3= driver.findElement(By.xpath("//[@id='allocationpercentage3']")).getText();

        // Creating a Balanced Actual Array
        ArrayList<String> Balanced_Actual= new ArrayList<>();

        // Adding values to Balanced Actual Array

        Balanced_Actual.add(actual1);
        Balanced_Actual.add(actual2);
        Balanced_Actual.add(actual3);

        // Setting Global Variable Actual data to Balanced Actual Array
        setActual_data(Balanced_Actual);
    }


    @When("user clicks on Adventurous button")
    public void userClicksOnAdventurousButton() {

        // Clicking on the Cautious Button
        driver.findElement(By.xpath("//[@id='allocationtypeAdventurous']")).click();

        // Getting the actual percentage
        String actual1= driver.findElement(By.xpath("//[@id='allocationpercentage6']")).getText();
        String actual2= driver.findElement(By.xpath("//[@id='allocationpercentage7']")).getText();
        String actual3= driver.findElement(By.xpath("//[@id='allocationpercentage8']")).getText();

        // Adding it to the actual data array

        // Creating a Adventurous Actual Array
        ArrayList<String> Adventurous_Actual= new ArrayList<>();

        // Adding values to Adventurous Actual Array

        Adventurous_Actual.add(actual1);
        Adventurous_Actual.add(actual2);
        Adventurous_Actual.add(actual3);

        // Setting Global Variable Actual data to Adventurous Actual Array
        setActual_data(Adventurous_Actual);
    }

    public ArrayList<String> getActual_data() {
        return actual_data;
    }

    public ArrayList<String> getExpected_data() {
        return expected_data;
    }

    public void setActual_data(ArrayList<String> actual_data) {
        this.actual_data = actual_data;
    }

    public void setExpected_data(ArrayList<String> expected_data) {
        this.expected_data = expected_data;
    }
}
