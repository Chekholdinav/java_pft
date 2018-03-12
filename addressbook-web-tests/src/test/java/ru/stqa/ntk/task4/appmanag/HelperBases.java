package ru.stqa.ntk.task4.appmanag;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.ntk.task4.model.GroupData;

public class HelperBases {

  protected WebDriver wd;

  public HelperBases(WebDriver wd) {
    this.wd = wd;
  }

  protected void type(GroupData groupData, By locator, String text) {
    wd.findElement(locator).click();
    wd.findElement(locator).clear();
    wd.findElement(locator).sendKeys(text);
  }

  public boolean isAlertPresent() {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }
}
