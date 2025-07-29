package walee.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EnglishPage {
    private WebDriver driver;

   private By engLangBtn = By.xpath("//a[@class='langBtn' and @data-lang='en']");





    public EnglishPage (WebDriver driver) {
        this.driver = driver;
    }


    public void clickEngLangBtn() {
    driver.findElement(engLangBtn).click();
    }

}
