package ru.stqa.ntk.task4.appmanag;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper {
 private FirefoxDriver wd;

  public NavigationHelper(FirefoxDriver wd) {
    this.wd = wd;
  }

  public void gotoHome() {
      wd.findElement(By.linkText("home")).click();
  }
}
