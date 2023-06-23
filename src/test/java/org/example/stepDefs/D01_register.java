package org.example.stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class D01_register {
     P01_register register=new P01_register();
    SoftAssert softAssert=new SoftAssert();
    @Given("user go to register page")
    public void goRegisterPage() throws InterruptedException, IOException {
        System.out.println("hello");
        //navigte to web site
        Hooks.OpenBrowser();
    } //insert first name
     @When("user insert first name")
     public void insert_name() throws IOException {

         String first_name = register.Excell_data(0).getCell(0).getStringCellValue();
         register.first_name().sendKeys(first_name);
     }
       //insert last name
    @And("user enter last name")
    public void insert_lastname() throws IOException {
        String last_name= register.Excell_data(0).getCell(1).getStringCellValue();
        register.last_name().sendKeys(last_name);
    }
    //insert email
    @And("user enter valid email")
    public void inser_email() throws IOException {
        String my_email= register.Excell_data(0).getCell(2).getStringCellValue();
        register.email().sendKeys(my_email);
    }
    //insert phone
    @And("user enter phone number")
    public void insert_phonenumber() throws IOException {
     /*   int phone_number= (int)register.Excell_data(0).getCell(3).getNumericCellValue();;
        String s=String.valueOf(phone_number);
        register.phone().sendKeys(s);*/
        String phone_number=register.Excell_data(0).getCell(3).getStringCellValue();
        register.phone().sendKeys(phone_number);
    }
    //select course
    @And("user select the course")
    public void select_course() throws IOException {
        int index= (int) register.Excell_data(0).getCell(4).getNumericCellValue();
        register.select_cousre(index);
    }
    //select month to join
    @And("user select the month")
    public void select_month() throws IOException {
        int value= (int) register.Excell_data(0).getCell(5).getNumericCellValue();
        register.select_month(value);
    }
    //How do you know about us
     @And("user select How he know about")
     public void know_about(){
         register.about_us().click();
     }
     @And("User click on register button")
     public void register_button(){
         register.signup().click();
     }
     @Then("success message is displayed")
    public void sucess_msg() throws InterruptedException {
        String text= register.sucess().getText();
         System.out.println(text);
         softAssert.assertEquals(text,"Your registration is completed. We will contact with you soon. Thank you !");
         Hooks.quitDriver();
     }

    }



