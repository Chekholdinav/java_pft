package ru.stqa.ntk.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SessionHelper extends HelperBase {

  public SessionHelper(WebDriver wd) {
    super(wd);
  }

  public void login(String username, String password) {
    type(By.name("user"), (username));
    // wd.findElement(By.id("LoginForm")).click();
    type(By.name("pass"), (password));
    click(By.xpath("//form[@id='LoginForm']/input[3]"));
  }
}
