package ru.stqa.ntk.task4.appmanag;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import ru.stqa.ntk.task4.model.GroupData;

import java.util.concurrent.TimeUnit;

public class ApplicationManagers {
  FirefoxDriver wd;

  public static boolean isAlertPresent(FirefoxDriver wd) {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  protected void init() {
    wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true).setBinary("F://Program Files (x86)/Mozilla Firefox/firefox.exe"));
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    wd.get("http://localhost/addressbook/");
    login("admin", "secret");
  }

  public void login(String login, String password) {
    wd.findElement(By.name("pass")).click();
    wd.findElement(By.name("pass")).clear();
    wd.findElement(By.name("pass")).sendKeys(password);
    wd.findElement(By.name("user")).click();
    wd.findElement(By.name("user")).clear();
    wd.findElement(By.name("user")).sendKeys(login);
    wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
    wd.findElement(By.linkText("add new")).click();
  }

  public void dopParams() {
    if (!wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[4]")).isSelected()) {
      wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[4]")).click();
    }
    if (!wd.findElement(By.xpath("//div[@id='content']/form/select[2]//option[5]")).isSelected()) {
      wd.findElement(By.xpath("//div[@id='content']/form/select[2]//option[5]")).click();
    }
    wd.findElement(By.name("byear")).click();
    wd.findElement(By.name("byear")).clear();
    wd.findElement(By.name("byear")).sendKeys("2018");
    wd.findElement(By.name("address2")).click();
    wd.findElement(By.name("address2")).clear();
    wd.findElement(By.name("address2")).sendKeys("vfddfg 34");
    wd.findElement(By.name("phone2")).click();
    wd.findElement(By.name("phone2")).clear();
    wd.findElement(By.name("phone2")).sendKeys("23");
    wd.findElement(By.name("notes")).click();
    wd.findElement(By.name("notes")).clear();
    wd.findElement(By.name("notes")).sendKeys("grdg");
    wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
  }

  public void email(String email, String s) {
    wd.findElement(By.name(email)).click();
    wd.findElement(By.name(email)).clear();
    wd.findElement(By.name(email)).sendKeys(s);
  }

  public void contactAddressAndTelephone(String title, String company, String address, String home, String mobile, String work, String fax) {
    wd.findElement(By.name("title")).click();
    wd.findElement(By.name("title")).clear();
    wd.findElement(By.name("title")).sendKeys(title);
    wd.findElement(By.name("company")).click();
    wd.findElement(By.name("company")).clear();
    wd.findElement(By.name("company")).sendKeys(company);
    wd.findElement(By.name("address")).click();
    wd.findElement(By.name("address")).clear();
    wd.findElement(By.name("address")).sendKeys(address);
    wd.findElement(By.name("home")).click();
    wd.findElement(By.name("home")).clear();
    wd.findElement(By.name("home")).sendKeys(home);
    wd.findElement(By.name("mobile")).click();
    wd.findElement(By.name("mobile")).clear();
    wd.findElement(By.name("mobile")).sendKeys(mobile);
    wd.findElement(By.name("work")).click();
    wd.findElement(By.name("work")).clear();
    wd.findElement(By.name("work")).sendKeys(work);
    wd.findElement(By.name("fax")).click();
    wd.findElement(By.name("fax")).clear();
    wd.findElement(By.name("fax")).sendKeys(fax);
  }

  public void nameUser(GroupData groupData) {
    wd.findElement(By.name(groupData.getFirstname())).click();
    wd.findElement(By.name(groupData.getFirstname())).clear();
    wd.findElement(By.name(groupData.getFirstname())).sendKeys("Test");
    wd.findElement(By.name(groupData.getMiddlename())).click();
    wd.findElement(By.name(groupData.getMiddlename())).clear();
    wd.findElement(By.name(groupData.getMiddlename())).sendKeys(groupData.getTest());
    wd.findElement(By.name(groupData.getLastname())).click();
    wd.findElement(By.name(groupData.getLastname())).clear();
    wd.findElement(By.name(groupData.getLastname())).sendKeys(groupData.getTestov());
    wd.findElement(By.name(groupData.getNickname())).click();
    wd.findElement(By.name(groupData.getNickname())).clear();
    wd.findElement(By.name(groupData.getNickname())).sendKeys(groupData.getTester());
  }

  public void stop() {
    wd.quit();
  }

  public void gotoHome() {
      wd.findElement(By.linkText("home")).click();
  }

  public void selectContact(By id) {
      if (!wd.findElement(id).isSelected()) {
          wd.findElement(id).click();
          wd.findElement(By.xpath("//div[@id='content']/form[2]/div[2]/input")).click();
      }
  }

  public void selectAlertOk() {
      wd.switchTo().alert().accept();
  }
}
