package ru.stqa.ntk.task4.appmanag;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


import java.util.concurrent.TimeUnit;

public class ApplicationManagers {

  private NavigationHelper navigationHelper;
  private ContactHelper contactHelper;
  FirefoxDriver wd;
  public static boolean isAlertPresent(FirefoxDriver wd) {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  public void init() {
    wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true).setBinary("F://Program Files (x86)/Mozilla Firefox/firefox.exe"));
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    wd.get("http://localhost/addressbook/");
    contactHelper = new ContactHelper(wd);
    navigationHelper = new NavigationHelper(wd);
    login("admin", "secret");
  }

  public void login(String login, String password) {
    contactHelper.email("pass", password);
    contactHelper.email("user", login);
    wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
    wd.findElement(By.linkText("add new")).click();
  }

  public void stop() {
    wd.quit();
  }

  public ContactHelper getContactHelper() {
    return contactHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }
}
