package ru.stqa.ntk.task4.appmanag;

import com.sun.org.apache.xpath.internal.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import sun.plugin2.util.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManagers {

  private NavigationHelper navigationHelper;
  private ContactHelper contactHelper;

  WebDriver wd;

  public void init() {
    java.lang.String browser = org.openqa.selenium.remote.BrowserType.FIREFOX;
    if (browser == org.openqa.selenium.remote.BrowserType.CHROME){
      wd = new ChromeDriver();
    } else if(browser == org.openqa.selenium.remote.BrowserType.IE){
      wd = new InternetExplorerDriver();
    } else if (browser == org.openqa.selenium.remote.BrowserType.EDGE){
      wd = new EdgeDriver();
    }



    wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true).setBinary("F://Program Files (x86)/Mozilla Firefox/firefox.exe"));
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    wd.get("http://localhost/addressbook/");
    contactHelper = new ContactHelper(wd);
    navigationHelper = new NavigationHelper(wd);
  //  login("admin", "secret");
  }

  public void login(String login, String password) {
  //  contactHelper.email("pass", password);
  //  contactHelper.email("user", login);
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
