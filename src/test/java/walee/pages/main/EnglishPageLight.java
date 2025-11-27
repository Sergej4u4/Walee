package walee.pages.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EnglishPageLight {
    private WebDriver driver;

   private By engLangBtn = By.xpath("//a[@class='langBtn' and @data-lang='en']");





    public EnglishPageLight(WebDriver driver) {
        this.driver = driver;
    }


    public void clickEngLangBtn() {
    driver.findElement(engLangBtn).click();
    }

}
