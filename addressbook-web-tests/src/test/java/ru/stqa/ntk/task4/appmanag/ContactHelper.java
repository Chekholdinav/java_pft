package ru.stqa.ntk.task4.appmanag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.ntk.task4.model.GroupData;

public class ContactHelper extends HelperBases{

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void dopParams() {
    if (!wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[4]")).isSelected()) {
      wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[4]")).click();
    }
    if (!wd.findElement(By.xpath("//div[@id='content']/form/select[2]//option[5]")).isSelected()) {
      wd.findElement(By.xpath("//div[@id='content']/form/select[2]//option[5]")).click();
    }
    type(null, By.name("byear"), "2018");
    type(null, By.name("address2"), "vfddfg 34");
    type(null, By.name("phone2"), "23");
    type(null, By.name("notes"), "grdg");
    wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
  }

  public void email(String email, String s) {
    type(null, By.name(email), s);
  }

  public void contactAddressAndTelephone(String title, String company, String address, String home, String mobile, String work, String fax) {
    type(null, By.name("title"), title);
    type(null, By.name("company"), company);
    type(null, By.name("address"), address);
    type(null, By.name("home"), home);
    type(null, By.name("mobile"), mobile);
    type(null, By.name("work"), work);
    type(null, By.name("fax"), fax);
  }

  public void nameUser(GroupData groupData) {
    type(groupData, By.name(groupData.getFirstname()), "Test");
    type(null, By.name(groupData.getMiddlename()), groupData.getTest());
    type(null, By.name(groupData.getLastname()), groupData.getTestov());
    type(null, By.name(groupData.getNickname()), groupData.getTester());
  }

  public void deleteContact(By id) {
      if (!wd.findElement(id).isSelected()) {
          wd.findElement(id).click();
          wd.findElement(By.xpath("//div[@id='content']/form[2]/div[2]/input")).click();
      }
  }

  public void selectAlertOk() {
      wd.switchTo().alert().accept();
  }
}
