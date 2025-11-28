package walee.pages.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import walee.pages.base.BasePage;

public class EnglishPageLight extends BasePage {
    private WebDriver driver;

   private By engLangBtn = By.xpath("//a[@class='langBtn' and @data-lang='en']");

    public EnglishPageLight(WebDriver driver) {
        super(driver); // передаём драйвер в BasePage
    }

    public void clickEngLangBtn() {
        click(engLangBtn); // используем метод BasePage

    }
}
