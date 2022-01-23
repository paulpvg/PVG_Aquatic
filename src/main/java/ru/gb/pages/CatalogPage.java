package ru.gb.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CatalogPage extends AbstractPage{

    //Снаряжение
    @FindBy(xpath = "//a[text()=\"Снаряжение\"]")
    private WebElement equipmentsLinkCatalogPage;
    @FindBy(xpath = "//ul[@class=\"children\"]/li/a[@href=\"https://aquatic.net.ru/product-category/equipments/vests/\"]")
    private WebElement vestsEquipmentsLinkCatalogPage;
    @FindBy(xpath = "//ul[@class=\"children\"]/li/a[@href=\"https://aquatic.net.ru/product-category/equipments/bucket-belts/\"]")
    private WebElement bucketsEquipmentsLinkCatalogPage;
    @FindBy(xpath = "//ul[@class=\"children\"]/li/a[@href=\"https://aquatic.net.ru/product-category/equipments/hermetic-backpacks/\"]")
    private WebElement hermeticBagsEquipmentsLinkCatalogPage;
    @FindBy(xpath = "//ul[@class=\"children\"]/li/a[@href=\"https://aquatic.net.ru/product-category/equipments/backpacks/\"]")
    private WebElement backpacksEquipmentsLinkCatalogPage;
    @FindBy(xpath = "//ul[@class=\"children\"]/li/a[@href=\"https://aquatic.net.ru/product-category/equipments/bags/\"]")
    private WebElement bagsEquipmentsLinkCatalogPage;
    @FindBy(xpath = "//ul[@class=\"children\"]/li/a[@href=\"https://aquatic.net.ru/product-category/equipments/rods-cases/\"]")
    private WebElement rodTubesEquipmentsLinkCatalogPage;
    @FindBy(xpath = "//ul[@class=\"children\"]/li/a[@href=\"https://aquatic.net.ru/product-category/equipments/cases-for-rods/\"]")
    private WebElement casesForRodsEquipmentsLinkCatalogPage;
    @FindBy(xpath = "//ul[@class=\"children\"]/li/a[@href=\"https://aquatic.net.ru/product-category/equipments/other-cases/\"]")
    private WebElement otherCasesEquipmentsLinkCatalogPage;
    @FindBy(xpath = "//ul[@class=\"children\"]/li/a[@href=\"https://aquatic.net.ru/product-category/equipments/carpfishing/\"]")
    private WebElement carpfishingEquipmentsLinkCatalogPage;
    @FindBy(xpath = "//ul[@class=\"children\"]/li/a[@href=\"https://aquatic.net.ru/product-category/equipments/boxes/\"]")
    private WebElement boxesEquipmentsLinkCatalogPage;
    @FindBy(xpath = "//ul[@class=\"children\"]/li/a[@href=\"https://aquatic.net.ru/product-category/equipments/head-light/\"]")
    private WebElement headLightEquipmentsLinkCatalogPage;
    @FindBy(xpath = "//ul[@class=\"children\"]/li/a[@href=\"https://aquatic.net.ru/product-category/equipments/accessories/\"]")
    private WebElement accessoriesEquipmentsLinkCatalogPage;
    @FindBy(xpath = "//ul[@class=\"children\"]/li/a[@href=\"https://aquatic.net.ru/product-category/equipments/other/\"]")
    private WebElement otherEquipmentsLinkCatalogPage;

    //Одежда
    @FindBy(xpath = "//a[text()=\"Одежда\"]")
    private WebElement wearLinkCatalogPage;
    @FindBy(xpath = "//ul[@class=\"children\"]/li/a[@href=\"https://aquatic.net.ru/product-category/wear/costumes/\"]")
    private WebElement costumesWearLinkCatalogPage;
    @FindBy(xpath = "//ul[@class=\"children\"]/li/a[@href=\"https://aquatic.net.ru/product-category/wear/jackets/\"]")
    private WebElement jacketsWearLinkCatalogPage;
    @FindBy(xpath = "//ul[@class=\"children\"]/li/a[@href=\"https://aquatic.net.ru/product-category/wear/pants/\"]")
    private WebElement pantsWearLinkCatalogPage;
    @FindBy(xpath = "//ul[@class=\"children\"]/li/a[@href=\"https://aquatic.net.ru/product-category/wear/vests-2/\"]")
    private WebElement vestsWearLinkCatalogPage;
    @FindBy(xpath = "//ul[@class=\"children\"]/li/a[@href=\"https://aquatic.net.ru/product-category/wear/sweaters-and-fleece/\"]")
    private WebElement sweatersWearLinkCatalogPage;
    @FindBy(xpath = "//ul[@class=\"children\"]/li/a[@href=\"https://aquatic.net.ru/product-category/wear/thermal-underwear/\"]")
    private WebElement thermalUnderwearWearLinkCatalogPage;
    @FindBy(xpath = "//ul[@class=\"children\"]/li/a[@href=\"https://aquatic.net.ru/product-category/wear/shirts/\"]")
    private WebElement shirtsWearLinkCatalogPage;
    @FindBy(xpath = "//ul[@class=\"children\"]/li/a[@href=\"https://aquatic.net.ru/product-category/wear/hats/\"]")
    private WebElement hatsWearLinkCatalogPage;
    @FindBy(xpath = "//ul[@class=\"children\"]/li/a[@href=\"https://aquatic.net.ru/product-category/wear/belts/\"]")
    private WebElement beltsWearLinkCatalogPage;
    @FindBy(xpath = "//ul[@class=\"children\"]/li/a[@href=\"https://aquatic.net.ru/product-category/wear/boots/\"]")
    private WebElement bootsWearLinkCatalogPage;

    //Travel
    @FindBy(xpath = "//a[text()=\"Travel\"]")
    private WebElement travelLinkCatalogPage;
    @FindBy(xpath = "//ul[@class=\"children\"]/li/a[@href=\"https://aquatic.net.ru/product-category/travel/city-series/\"]")
    private WebElement cityTravelLinkCatalogPage;
    @FindBy(xpath = "//ul[@class=\"children\"]/li/a[@href=\"https://aquatic.net.ru/product-category/travel/road-series/\"]")
    private WebElement roadTravelLinkCatalogPage;
    @FindBy(xpath = "//ul[@class=\"children\"]/li/a[@href=\"https://aquatic.net.ru/product-category/travel/tourism-and-sport/\"]")
    private WebElement tourismTravelLinkCatalogPage;
    @FindBy(xpath = "//ul[@class=\"children\"]/li/a[@href=\"https://aquatic.net.ru/product-category/travel/hermetic-backpacks-1/\"]")
    private WebElement hermeticBagsTravelLinkCatalogPage;

    //Охота
    @FindBy(xpath = "//a[text()=\"Охота\"]")
    private WebElement huntingLinkCatalogPage;
    @FindBy(xpath = "//ul[@class=\"children\"]/li/a[@href=\"https://aquatic.net.ru/product-category/hunting/vests-1/\"]")
    private WebElement vestsHuntingLinkCatalogPage;
    @FindBy(xpath = "//ul[@class=\"children\"]/li/a[@href=\"https://aquatic.net.ru/product-category/hunting/jackets-1/\"]")
    private WebElement jacketsHuntingLinkCatalogPage;
    @FindBy(xpath = "//ul[@class=\"children\"]/li/a[@href=\"https://aquatic.net.ru/product-category/hunting/backpacks-1/\"]")
    private WebElement backpacksHuntingLinkCatalogPage;
    @FindBy(xpath = "//ul[@class=\"children\"]/li/a[@href=\"https://aquatic.net.ru/product-category/hunting/bags-1/\"]")
    private WebElement bagsHuntingLinkCatalogPage;
    @FindBy(xpath = "//ul[@class=\"children\"]/li/a[@href=\"https://aquatic.net.ru/product-category/hunting/hunting-cases/\"]")
    private WebElement casesHuntingLinkCatalogPage;
    @FindBy(xpath = "//ul[@class=\"children\"]/li/a[@href=\"https://aquatic.net.ru/product-category/hunting/cartridge-belts/\"]")
    private WebElement cartridgeBeltsHuntingLinkCatalogPage;
    @FindBy(xpath = "//ul[@class=\"children\"]/li/a[@href=\"https://aquatic.net.ru/product-category/hunting/hunting-belts/\"]")
    private WebElement beltsHuntingLinkCatalogPage;

    //Нахлыст
    @FindBy(xpath = "//a[text()=\"Нахлыст\"]")
    private WebElement flyfishingLinkCatalogPage;
    @FindBy(xpath = "//ul[@class=\"children\"]/li/a[@href=\"https://aquatic.net.ru/product-category/fly-fishing/fly-fishing-wear/\"]")
    private WebElement wearFlyfishingLinkCatalogPage;
    @FindBy(xpath = "//ul[@class=\"children\"]/li/a[@href=\"https://aquatic.net.ru/product-category/fly-fishing/fly-fishing-rods/\"]")
    private WebElement rodsFlyfishingLinkCatalogPage;
    @FindBy(xpath = "//ul[@class=\"children\"]/li/a[@href=\"https://aquatic.net.ru/product-category/fly-fishing/fly-fishing-coils/\"]")
    private WebElement coilsFlyfishingLinkCatalogPage;
    @FindBy(xpath = "//ul[@class=\"children\"]/li/a[@href=\"https://aquatic.net.ru/product-category/fly-fishing/fly-fishing-kits/\"]")
    private WebElement kitsFlyfishingLinkCatalogPage;
    @FindBy(xpath = "//ul[@class=\"children\"]/li/a[@href=\"https://aquatic.net.ru/product-category/fly-fishing/fly-fishing-cords-backings/\"]")
    private WebElement cordsFlyfishingLinkCatalogPage;
    @FindBy(xpath = "//ul[@class=\"children\"]/li/a[@href=\"https://aquatic.net.ru/product-category/fly-fishing/boxes-1/\"]")
    private WebElement boxesFlyfishingLinkCatalogPage;

    //Спиннинги
    @FindBy(xpath = "//a[text()=\"Спиннинги\"]")
    private WebElement spinningsLinkCatalogPage;

    //Шнуры
    @FindBy(xpath = "//a[text()=\"Шнуры\"]")
    private WebElement braidLinkCatalogPage;

    //Приманки
    @FindBy(xpath = "//a[text()=\"Приманки\"]")
    private WebElement baitsLinkCatalogPage;

    //Аксессуары для Фидера и Карпфишинга
    @FindBy(xpath = "//a[text()=\"Аксессуары для Фидера и Карпфишинга\"]")
    private WebElement accessoriesFeederLinkCatalogPage;

    public CatalogPage(WebDriver driver) {
        super(driver);
    }
}
