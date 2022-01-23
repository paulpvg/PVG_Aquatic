package ru.gb.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class CatalogMenuPage extends AbstractPage{

    //Снаряжение
    @FindBy(xpath = "//span[text()=\"Снаряжение\"]")
    private WebElement equipmentsLinkCatalogMenu;
    @FindBy(xpath = "//ul[@class=\"sub-menu\"]/li/a[@href=\"https://aquatic.net.ru/product-category/equipments/vests/\"]")
    private WebElement vestsEquipmentsLinkCatalogMenu;
    @FindBy(xpath = "//ul[@class=\"sub-menu\"]/li/a[@href=\"https://aquatic.net.ru/product-category/equipments/bucket-belts/\"]")
    private WebElement bucketsEquipmentsLinkCatalogMenu;
    @FindBy(xpath = "//ul[@class=\"sub-menu\"]/li/a[@href=\"https://aquatic.net.ru/product-category/equipments/hermetic-backpacks/\"]")
    private WebElement hermeticBagsEquipmentsLinkCatalogMenu;
    @FindBy(xpath = "//ul[@class=\"sub-menu\"]/li/a[@href=\"https://aquatic.net.ru/product-category/equipments/backpacks/\"]")
    private WebElement backpacksEquipmentsLinkCatalogMenu;
    @FindBy(xpath = "//ul[@class=\"sub-menu\"]/li/a[@href=\"https://aquatic.net.ru/product-category/equipments/bags/\"]")
    private WebElement bagsEquipmentsLinkCatalogMenu;
    @FindBy(xpath = "//ul[@class=\"sub-menu\"]/li/a[@href=\"https://aquatic.net.ru/product-category/equipments/rods-cases/\"]")
    private WebElement rodTubesEquipmentsLinkCatalogMenu;
    @FindBy(xpath = "//ul[@class=\"sub-menu\"]/li/a[@href=\"https://aquatic.net.ru/product-category/equipments/cases-for-rods/\"]")
    private WebElement casesForRodsEquipmentsLinkCatalogMenu;
    @FindBy(xpath = "//ul[@class=\"sub-menu\"]/li/a[@href=\"https://aquatic.net.ru/product-category/equipments/other-cases/\"]")
    private WebElement otherCasesEquipmentsLinkCatalogMenu;
    @FindBy(xpath = "//ul[@class=\"sub-menu\"]/li/a[@href=\"https://aquatic.net.ru/product-category/equipments/carpfishing/\"]")
    private WebElement carpfishingEquipmentsLinkCatalogMenu;
    @FindBy(xpath = "//ul[@class=\"sub-menu\"]/li/a[@href=\"https://aquatic.net.ru/product-category/equipments/boxes/\"]")
    private WebElement boxesEquipmentsLinkCatalogMenu;
    @FindBy(xpath = "//ul[@class=\"sub-menu\"]/li/a[@href=\"https://aquatic.net.ru/product-category/equipments/head-light/\"]")
    private WebElement headLightEquipmentsLinkCatalogMenu;
    @FindBy(xpath = "//ul[@class=\"sub-menu\"]/li/a[@href=\"https://aquatic.net.ru/product-category/equipments/accessories/\"]")
    private WebElement accessoriesEquipmentsLinkCatalogMenu;
    @FindBy(xpath = "//ul[@class=\"sub-menu\"]/li/a[@href=\"https://aquatic.net.ru/product-category/equipments/other/\"]")
    private WebElement otherEquipmentsLinkCatalogMenu;

    //Одежда
    @FindBy(xpath = "//span[text()=\"Одежда\"]")
    private WebElement wearLinkCatalogMenu;
    @FindBy(xpath = "//ul[@class=\"sub-menu\"]/li/a[@href=\"https://aquatic.net.ru/product-category/wear/costumes/\"]")
    private WebElement costumesWearLinkCatalogMenu;
    @FindBy(xpath = "//ul[@class=\"sub-menu\"]/li/a[@href=\"https://aquatic.net.ru/product-category/wear/jackets/\"]")
    private WebElement jacketsWearLinkCatalogMenu;
    @FindBy(xpath = "//ul[@class=\"sub-menu\"]/li/a[@href=\"https://aquatic.net.ru/product-category/wear/pants/\"]")
    private WebElement pantsWearLinkCatalogMenu;
    @FindBy(xpath = "//ul[@class=\"sub-menu\"]/li/a[@href=\"https://aquatic.net.ru/product-category/wear/vests-2/\"]")
    private WebElement vestsWearLinkCatalogMenu;
    @FindBy(xpath = "//ul[@class=\"sub-menu\"]/li/a[@href=\"https://aquatic.net.ru/product-category/wear/sweaters-and-fleece/\"]")
    private WebElement sweatersWearLinkCatalogMenu;
    @FindBy(xpath = "//ul[@class=\"sub-menu\"]/li/a[@href=\"https://aquatic.net.ru/product-category/wear/thermal-underwear/\"]")
    private WebElement thermalUnderwearWearLinkCatalogMenu;
    @FindBy(xpath = "//ul[@class=\"sub-menu\"]/li/a[@href=\"https://aquatic.net.ru/product-category/wear/shirts/\"]")
    private WebElement shirtsWearLinkCatalogMenu;
    @FindBy(xpath = "//ul[@class=\"sub-menu\"]/li/a[@href=\"https://aquatic.net.ru/product-category/wear/hats/\"]")
    private WebElement hatsWearLinkCatalogMenu;
    @FindBy(xpath = "//ul[@class=\"sub-menu\"]/li/a[@href=\"https://aquatic.net.ru/product-category/wear/belts/\"]")
    private WebElement beltsWearLinkCatalogMenu;
    @FindBy(xpath = "//ul[@class=\"sub-menu\"]/li/a[@href=\"https://aquatic.net.ru/product-category/wear/boots/\"]")
    private WebElement bootsWearLinkCatalogMenu;

    //Travel
    @FindBy(xpath = "//span[text()=\"Travel\"]")
    private WebElement travelLinkCatalogMenu;
    @FindBy(xpath = "//ul[@class=\"sub-menu\"]/li/a[@href=\"https://aquatic.net.ru/product-category/travel/city-series/\"]")
    private WebElement cityTravelLinkCatalogMenu;
    @FindBy(xpath = "//ul[@class=\"sub-menu\"]/li/a[@href=\"https://aquatic.net.ru/product-category/travel/road-series/\"]")
    private WebElement roadTravelLinkCatalogMenu;
    @FindBy(xpath = "//ul[@class=\"sub-menu\"]/li/a[@href=\"https://aquatic.net.ru/product-category/travel/tourism-and-sport/\"]")
    private WebElement tourismTravelLinkCatalogMenu;
    @FindBy(xpath = "//ul[@class=\"sub-menu\"]/li/a[@href=\"https://aquatic.net.ru/product-category/travel/hermetic-backpacks-1/\"]")
    private WebElement hermeticBagsTravelLinkCatalogMenu;

    //Охота
    @FindBy(xpath = "//span[text()=\"Охота\"]")
    private WebElement huntingLinkCatalogMenu;
    @FindBy(xpath = "//ul[@class=\"sub-menu\"]/li/a[@href=\"https://aquatic.net.ru/product-category/hunting/vests-1/\"]")
    private WebElement vestsHuntingLinkCatalogMenu;
    @FindBy(xpath = "//ul[@class=\"sub-menu\"]/li/a[@href=\"https://aquatic.net.ru/product-category/hunting/jackets-1/\"]")
    private WebElement jacketsHuntingLinkCatalogMenu;
    @FindBy(xpath = "//ul[@class=\"sub-menu\"]/li/a[@href=\"https://aquatic.net.ru/product-category/hunting/backpacks-1/\"]")
    private WebElement backpacksHuntingLinkCatalogMenu;
    @FindBy(xpath = "//ul[@class=\"sub-menu\"]/li/a[@href=\"https://aquatic.net.ru/product-category/hunting/bags-1/\"]")
    private WebElement bagsHuntingLinkCatalogMenu;
    @FindBy(xpath = "//ul[@class=\"sub-menu\"]/li/a[@href=\"https://aquatic.net.ru/product-category/hunting/hunting-cases/\"]")
    private WebElement casesHuntingLinkCatalogMenu;
    @FindBy(xpath = "//ul[@class=\"sub-menu\"]/li/a[@href=\"https://aquatic.net.ru/product-category/hunting/cartridge-belts/\"]")
    private WebElement cartridgeBeltsHuntingLinkCatalogMenu;
    @FindBy(xpath = "//ul[@class=\"sub-menu\"]/li/a[@href=\"https://aquatic.net.ru/product-category/hunting/hunting-belts/\"]")
    private WebElement beltsHuntingLinkCatalogMenu;

    //Нахлыст
    @FindBy(xpath = "//span[text()=\"Нахлыст\"]")
    private WebElement flyfishingLinkCatalogMenu;
    @FindBy(xpath = "//ul[@class=\"sub-menu\"]/li/a[@href=\"https://aquatic.net.ru/product-category/fly-fishing/fly-fishing-wear/\"]")
    private WebElement wearFlyfishingLinkCatalogMenu;
    @FindBy(xpath = "//ul[@class=\"sub-menu\"]/li/a[@href=\"https://aquatic.net.ru/product-category/fly-fishing/fly-fishing-rods/\"]")
    private WebElement rodsFlyfishingLinkCatalogMenu;
    @FindBy(xpath = "//ul[@class=\"sub-menu\"]/li/a[@href=\"https://aquatic.net.ru/product-category/fly-fishing/fly-fishing-coils/\"]")
    private WebElement coilsFlyfishingLinkCatalogMenu;
    @FindBy(xpath = "//ul[@class=\"sub-menu\"]/li/a[@href=\"https://aquatic.net.ru/product-category/fly-fishing/fly-fishing-kits/\"]")
    private WebElement kitsFlyfishingLinkCatalogMenu;
    @FindBy(xpath = "//ul[@class=\"sub-menu\"]/li/a[@href=\"https://aquatic.net.ru/product-category/fly-fishing/fly-fishing-cords-backings/\"]")
    private WebElement cordsFlyfishingLinkCatalogMenu;
    @FindBy(xpath = "//ul[@class=\"sub-menu\"]/li/a[@href=\"https://aquatic.net.ru/product-category/fly-fishing/boxes-1/\"]")
    private WebElement boxesFlyfishingLinkCatalogMenu;

    //Спиннинги
    @FindBy(xpath = "//span[text()=\"Спиннинги\"]")
    private WebElement spinningsLinkCatalogMenu;

    //Шнуры
    @FindBy(xpath = "//span[text()=\"Шнуры\"]")
    private WebElement braidLinkCatalogMenu;

    //Приманки
    @FindBy(xpath = "//span[text()=\"Приманки\"]")
    private WebElement baitsLinkCatalogMenu;

    //Аксессуары для Фидера и Карпфишинга
    @FindBy(xpath = "//span[text()=\"Аксессуары для Фидера и Карпфишинга\"]")
    private WebElement accessoriesFeederLinkCatalogMenu;

    public CatalogMenuPage(WebDriver driver) {
        super(driver);
    }
}
