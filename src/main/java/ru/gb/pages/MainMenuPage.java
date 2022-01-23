package ru.gb.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainMenuPage extends AbstractPage {

    @FindBy(xpath = "//div[@class=\"content-logo\"]")
    private WebElement logoLinkMainMenu;

    @FindBy(xpath = "//span[text()=\"Главная\"]")
    private WebElement homeLinkMainMenu;
    @FindBy(xpath = "//span[text()=\"Новинки\"]")
    private WebElement newLinkMainMenu;
    @FindBy(xpath = "//span[text()=\"Каталог товаров\"]")
    private WebElement catalogLinkMainMenu;
    @FindBy(xpath = "//span[text()=\"Распродажа\"]")
    private WebElement saleLinkMainMenu;
    @FindBy(xpath = "//span[text()=\"Наши эксперты\"]")
    private WebElement expertsLinkMainMenu;
    @FindBy(xpath = "//span[text()=\"Вакансии\"]")
    private WebElement vacanciesLinkMainMenu;

    @FindBy(xpath = "//a[@class=\"link-cart\"]")
    private WebElement cartLinkMainMenu;
    @FindBy(xpath = "//div[@class=\"search-inner\"]")
    private WebElement searchButtonMainMenu;

    @FindBy(xpath = "//span[text()=\"Мой аккаунт\"]")
    private WebElement myAccountLinkMainMenu;
    @FindBy(xpath = "//a[@href=\"https://aquatic-europe.com\"]")
    private WebElement europeSiteLinkMainMenu;

    public MainMenuPage(WebDriver driver) {
        super(driver);
    }
}
