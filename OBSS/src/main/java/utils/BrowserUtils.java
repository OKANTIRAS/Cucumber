package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

public class BrowserUtils {


    public static String getScreenshot(String name) {
        // Adding date and time to the screenshot name to make it unique
        name = new Date().toString().replace(" ", "_").replace(":", "-") + "_" + name;
        String path = System.getProperty("user.dir") + "\\test-output\\screenshots\\" + name + ".png";
        TakesScreenshot screenshot = (TakesScreenshot) DriverManager.getDriver();
        File source = screenshot.getScreenshotAs(OutputType.FILE);
        File destination = new File(path);
        try {
            FileUtils.copyFile(source, destination);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return path;
    }


    public static void moveToElement(WebElement element) {
        Actions actions = new Actions(DriverManager.getDriver());
        actions.moveToElement(element).build().perform();
    }


    public static void wait(int secs) {
        try {
            Thread.sleep(1000 * (long) secs);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void scrollDownWithPageDownButton(int times) {
        Actions actions = new Actions(DriverManager.getDriver());
        for (int i = 0; i < times; i++) {
            actions.keyDown(Keys.PAGE_DOWN).build().perform();
            BrowserUtils.wait(1);

        }
    }

    public static void scrollUpWithPageUpButton(int times) {
        Actions actions = new Actions(DriverManager.getDriver());
        for (int i = 0; i < times; i++) {
            actions.keyDown(Keys.PAGE_UP).build().perform();
            BrowserUtils.wait(1);
        }
    }

    public static void scrollUpWithPageUp() {
        Actions actions = new Actions(DriverManager.getDriver());
        actions.keyDown(Keys.PAGE_UP).build().perform();

    }

    public static void clickOnElement(WebElement element) {
        Actions actions = new Actions(DriverManager.getDriver());
        actions.moveToElement(element).click().perform();
    }

    public static void scrollDownWithPageDown() {
        Actions actions = new Actions(DriverManager.getDriver());
        actions.keyDown(Keys.PAGE_DOWN).build().perform();
    }

}
