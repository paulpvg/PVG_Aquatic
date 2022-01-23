package ru.gb.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FooterPage extends AbstractPage{

    //Ссылки
    @FindBy(xpath = "//a[text()=\"О нас\"]")
    private WebElement aboutUsLinkFooter;
    @FindBy(xpath = "//a[text()=\"Миссия компании\"]")
    private WebElement missionLinkFooter;
    @FindBy(xpath = "//a[text()=\"Наши новости\"]")
    private WebElement blogLinkFooter;
    @FindBy(xpath = "//a[text()=\"Доставка и оплата\"]")
    private WebElement deliveryLinkFooter;
    @FindBy(xpath = "//a[text()=\"Политика конфиденциальности\"]")
    private WebElement termOfUseLinkFooter;
    @FindBy(xpath = "//a[text()=\"Связь с нами\"]")
    private WebElement contactsLinkFooter;
    @FindBy(xpath = "//a[text()=\"Наши эксперты\"]")
    private WebElement expertsLinkFooter;
    @FindBy(xpath = "//a[text()=\"Фотогалерея наших трофеев\"]")
    private WebElement galleriesLinkFooter;
    @FindBy(xpath = "//a[text()=\"Стационарные точки продаж\"]")
    private WebElement shopsLinkFooter;
    @FindBy(xpath = "//a[text()=\"Вакансии\"]")
    private WebElement vacanciesLinkFooter;

    //Каталог
    @FindBy(xpath = "//a[text()=\"Рыболовное снаряжение\"]")
    private WebElement catalogLinkFooter;

    //Рассылка
    @FindBy(xpath = "//input[@name=\"EMAIL\"]")
    private WebElement emailInputFooter;
    @FindBy(xpath = "//button[@class=\"newsletter-submit pa\"]")
    private WebElement submitButtonFooter;

    //Медиа
    @FindBy(xpath = "//a[text()=\"VK\"]")
    private WebElement vkLinkFooter;
    @FindBy(xpath = "//a[text()=\" OK\"]")
    private WebElement okLinkFooter;
    @FindBy(xpath = "//a[text()=\"Facebook\"]")
    private WebElement facebookLinkFooter;
    @FindBy(xpath = "//a[text()=\"Instagram\"]")
    private WebElement instagramLinkFooter;
    @FindBy(xpath = "//a[text()=\"Youtube\"]")
    private WebElement youtubeLinkFooter;

    public FooterPage(WebDriver driver) {
        super(driver);
    }
}
