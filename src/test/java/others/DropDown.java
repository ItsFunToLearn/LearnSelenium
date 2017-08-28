package others;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebElement ele = driver.findElement(By.id(""));
		Select sel = new Select(ele);
		sel.deselectAll();
		sel.deselectByIndex(index);
		sel.deselectByValue(value);
		sel.deselectByVisibleText(text);
		sel.getAllSelectedOptions()
		sel.getFirstSelectedOption()
		sel.getOptions()
		sel.isMultiple()
		sel.selectByIndex(index);
		sel.selectByValue(value);
		sel.selectByVisibleText(text);
		
	}
}
