import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainTest {

    @Test
     void TestName() {
      System.setProperty("webdriver.chrome.driver", "C://Users//vklem//IdeaProjects//homework//src//main/resources//chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://mts.by");

        try {
            WebElement sectionElement = driver.findElement(By.xpath("//*[contains(text(), 'Онлайн пополнение без комиссии')] "));
          String sectionName = sectionElement.getText();
          System.out.println("Название раздела: " + sectionName);

        } finally {
            driver.quit();
        }}


        @Test
        void TestElementLogo() {
            System.setProperty("webdriver.chrome.driver", "C://Users//vklem//IdeaProjects//homework//src//main/resources//chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://mts.by");

            try {
                WebElement sectionElement = driver.findElement(By.xpath( "//img[@alt='https://www.mts.by/upload/medialibrary/1d2/trzwiapx8qa1xz2oqedyp7opzuj55mi9/money_card.webp']"));
                String sectionName = sectionElement.getText();
                System.out.println("Логотип " + sectionName);

            } finally {
                driver.quit();
            }}

    @Test
    void TestAboutService() {
        System.setProperty("webdriver.chrome.driver", "C://Users//vklem//IdeaProjects//homework//src//main/resources//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mts.by");

        try {
            WebElement sectionElement = driver.findElement(By.xpath("//*[contains(text(), 'Подробнее о сервисе')] "));
            String sectionName = sectionElement.getText();
            System.out.println("Название раздела: " + sectionName);

        } finally {
            driver.quit();
        }}

    @Test
    void TestLogin() {
        System.setProperty("webdriver.chrome.driver", "C://Users//vklem//IdeaProjects//homework//src//main/resources//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mts.by");

        try {
            WebElement sectionElement = driver.findElement(By.xpath("//*[contains(text(), 'Услуги связи')] "));
            String sectionName = sectionElement.getText();
            System.out.println("Название раздела: " + sectionName);

        } finally {
            driver.quit();
        }}



    }
