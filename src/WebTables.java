import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get("https://demoqa.com/webtables");

        WebElement delRow3 = wd.findElement(By.cssSelector("#delete-record-3"));
        delRow3.click();

        WebElement delRow2 = wd.findElement(By.cssSelector("#delete-record-2"));
        delRow2.click();

        WebElement editRow1 = wd.findElement(By.id("edit-record-1"));
        editRow1.click();

        WebElement editRow1FName = wd.findElement(By.id("firstName"));
        editRow1FName.clear();
        editRow1FName.sendKeys("Jane");

        WebElement editRow1LName = wd.findElement(By.id("lastName"));
        editRow1LName.clear();
        editRow1LName.sendKeys("Smith");

        WebElement editRow1Email = wd.findElement(By.id("userEmail"));
        editRow1Email.clear();
        editRow1Email.sendKeys("jane@smith.net");

        WebElement editRow1Age = wd.findElement(By.id("age"));
        editRow1Age.clear();
        editRow1Age.sendKeys("42");

        WebElement editRow1Salary = wd.findElement(By.id("salary"));
        editRow1Salary.clear();
        editRow1Salary.sendKeys("9500");

        WebElement editRow1Department = wd.findElement(By.id("department"));
        editRow1Department.clear();
        editRow1Department.sendKeys("Finance");

        WebElement editRow1Submit = wd.findElement(By.id("submit"));
        editRow1Submit.click();

        WebElement add = wd.findElement(By.cssSelector("#addNewRecordButton"));
        add.click();

        WebElement newFName = wd.findElement(By.id("firstName"));
        newFName.sendKeys("John");

        WebElement newLName = wd.findElement(By.id("lastName"));
        newLName.sendKeys("Smith");

        WebElement newEmail = wd.findElement(By.id("userEmail"));
        newEmail.sendKeys("john@smith.net");

        WebElement newAge = wd.findElement(By.id("age"));
        newAge.sendKeys("45");

        WebElement newSalary = wd.findElement(By.id("salary"));
        newSalary.sendKeys("9000");

        WebElement newDepartment = wd.findElement(By.id("department"));
        newDepartment.sendKeys("Store");

        WebElement submit = wd.findElement(By.id("submit"));
        submit.click();

    }
}
