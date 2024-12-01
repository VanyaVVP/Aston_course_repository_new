package Aston_Selenium;

import static org.junit.jupiter.api.Assertions.*;
import java.time.Duration;
import java.util.List;
import org.junit.After;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

class MTS_Test {

	private WebDriver driver;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.mts.by"); 
    }
    
    @After
    public void tearDown() {
        driver.quit();
    }
    
    @DisplayName("Тестирование заголовка")         // Нахождение заголовка 
    @Test
    public void testBlockTitle() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // ожидание 10 секунд
        String expectedTitle = "Онлайн пополнение без комиссии";
        WebElement blockTitle = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[normalize-space()='Онлайн пополнение без комиссии']")));
        assertEquals(expectedTitle, blockTitle.getText().trim().replaceAll("\\s+", " ")); 
    }
    
    @DisplayName("Тестирование логотипа платёжных систем")         // находим 5 img платёжных систем
    @Test
    public void testPaymentLogos() {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));      
    	WebElement partnersElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".pay__partners")));
    	List<WebElement> logos = partnersElement.findElements(By.tagName("img")); 
        assertEquals(5, logos.size());
    }
    
    @DisplayName("Проверка ссылки") 
    @Test
    public void testLink() {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {WebElement cookieButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("cookie-agree")));  // обработка cookie-модуля
        cookieButton.click();}
        catch  (WebDriverException e){
                System.err.println("Ошибка при клике на кнопку cookies: " + e.getMessage());
        }
    	WebElement link = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Подробнее о сервисе")));
    	link.click();
    }
    
    @ParameterizedTest
    @CsvSource({
    	"297777777,560,Ivan02@mail.ru"})
    public void testFields(String phoneNumber, String sum, String email) {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {WebElement cookieButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("cookie-agree")));  // обработка cookie-модуля
        cookieButton.click();}
        catch  (WebDriverException e){
                System.err.println("Ошибка при клике на кнопку cookies: " + e.getMessage());
        }
        WebElement inputField = driver.findElement(By.id("connection-phone"));
        inputField.sendKeys(phoneNumber);
        inputField = driver.findElement(By.id("connection-sum"));
        inputField.sendKeys(sum);
        inputField = driver.findElement(By.id("connection-email"));
        inputField.sendKeys(email);
        WebElement next = driver.findElement(By.xpath("//*[text() = 'Продолжить']"));
        next.click();
    }
}
    
    
   

