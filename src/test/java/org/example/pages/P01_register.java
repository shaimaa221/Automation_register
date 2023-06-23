package org.example.pages;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class P01_register {
 public WebElement first_name(){
   return   Hooks.driver.findElement(By.id("nf-field-17"));
 }
 public WebElement last_name(){
     return Hooks.driver.findElement(By.id("nf-field-18"));
 }
public WebElement phone(){

     return Hooks.driver.findElement(By.id("nf-field-20"));
}
public WebElement email(){
     return Hooks.driver.findElement(By.id("nf-field-19"));
}

public void select_cousre(int index) {
    WebElement droopDowen_COURSE = Hooks.driver.findElement(By.id("nf-field-22"));
    Select select = new Select(droopDowen_COURSE);
    select.selectByIndex(index);
}

public void select_month(int index2){
    WebElement droopDowen_date = Hooks.driver.findElement(By.id("nf-field-24"));
    Select select = new Select(droopDowen_date);
    select.selectByIndex(index2);
}

public WebElement about_us(){
     return Hooks.driver.findElement(By.id("nf-label-class-field-23-1"));
}
 public WebElement signup (){
     return Hooks.driver.findElement(By.id("nf-field-15"));
 }

 public WebElement sucess(){

     return Hooks.driver.findElement(By.xpath("//p[text()='Your registration is completed. We will contact with you soon. Thank you !']"));
 }
    public XSSFRow Excell_data(int i) throws IOException {
       // XSSFWorkbook workbook = new XSSFWorkbook("E:\\excell.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook("C:\\Users\\osama\\IdeaProjects\\my_project\\Excel\\reg_data.xlsx");
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        XSSFRow currentrow = sheet.getRow(i);
        return currentrow;
    }
}
