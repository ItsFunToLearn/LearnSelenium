package others;

import org.openqa.selenium.support.ui.Select;

public class Notes {
	/*
	 * getText()
	 * getAttribute()
	 * isSelected()
	 * isEnabled()
	 * isDisplayed()
	 * 
	 * Working with dropdown
	 * Select sel = new Select(WebElement)
	 * Select sel = new Select(ele);
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
	 * 
	 * WINDOW HANDLING
	 * sWITCHING TO WINDOW
	 * Set<String> set = driver.getWindowHandles()
	 * Iterator<String> itr = set.iterator();
	 * String parentID = itr.next()	 * 
	 * driver.switchTo().window(windowID)
	 * 
	 * ALERTS
	 * Alert alt = driver.switchTo().alert();
	 * alt.getText();
	 * alt.accept()
	 * alt.dismiss()
	 * 
	 * INVISIBLE POP UP
	 * boolean flag = driver.findElement().isEnabled();
	 * if(flag){
	 * 	driver.findElement("close").click();
	 * }else{
	 * syso(pop up not displayed)
	 *}
	 *
	 * Actions:
	 * Actions act = new Actions(driver);
	 * act.moveTo(WebElement).build().perform();
	 * act.moveTo(WebElement).click().build().perform();
	 * act.sendKeys(Keys.ENTER).perform();
	 * act.sendKeys(Keys.TAB).perform();
	 * act.sendKeys(Keys.Chord(Keys.CONTROL, "a")).perform();
	 * act.sendKeys(Keys.Chord(Keys.CONTROL, "c")).perform();
	 * act.dragAndDrop(source, target).build().perform();
	 * act.contextClick().perform();
	 * act.contextClick(WebElement).perform();
	 * act.clickAndHold(fromElement).moveToElement(toElement).release().build().perform();
	 * act.dragAndDrop(WebElement ele, int xoffset, int yoffset).perform();
	 * (if offset values are negative then it will be dragged in opposite direction)
	 * 
	 * FRAME:
	 * driver.switchTo().frame(id/name);
	 * driver.switchTo().frame(index);
	 * driver.switchTo().frame(webelement);
	 * driver.switchTo().defaultContent();
	 * 
	 * AUTOSUGGEST:
	 * driver.findElement().sendKeys("", Keys.ENTER);
	 * 
	 * @Test(enabled=false) --> skip test case
	 * @Test(invocationCount=10) --> execute a tc multiple times
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}
