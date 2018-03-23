package ru.stqa.ntk.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.ntk.addressbook.model.AddressBookData;
import ru.stqa.ntk.addressbook.appmanager.HelperBase;

public class ContactHelper extends HelperBase{

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void dopParams() {
    if (!wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[4]")).isSelected()) {
      click(By.xpath("//div[@id='content']/form/select[1]//option[4]"));
    }
    if (!wd.findElement(By.xpath("//div[@id='content']/form/select[2]//option[5]")).isSelected()) {
      click(By.xpath("//div[@id='content']/form/select[2]//option[5]"));
    }
    type(By.name("byear"), "2018");
    type(By.name("address2"), "vfddfg 34");
    type(By.name("phone2"), "23");
    type(By.name("notes"), "grdg");
    click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void setField(String fieldName, String fieldValue) {
    type(By.name(fieldName), fieldValue);
  }

  public void contactAddressAndTelephone(String title, String company, String address, String home, String mobile, String work, String fax) {
    type(By.name("title"), title);
    type(By.name("company"), company);
    type(By.name("address"), address);
    type(By.name("home"), home);
    type(By.name("mobile"), mobile);
    type(By.name("work"), work);
    type(By.name("fax"), fax);
  }

  public void nameUser(AddressBookData addressBookData) {
    type(By.name(addressBookData.getFirstname()), "Test");
    type(By.name(addressBookData.getMiddlename()), addressBookData.getTest());
    type(By.name(addressBookData.getLastname()), addressBookData.getTestov());
    type(By.name(addressBookData.getNickname()), addressBookData.getTester());
  }

  public void deleteContact(By id) {
      if (!wd.findElement(id).isSelected()) {
          click(id);
          click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
      }
  }

  public void setUsername(String login, String password) {
    setField("pass", password);
    setField("user", login);
    click(By.xpath("//form[@id='LoginForm']/input[3]"));
    click(By.linkText("add new"));
  }

  public void selectAlertOk() {
      wd.switchTo().alert().accept();
  }

  public void buttonUpdate() {
      click(By.name("update"));
  }

  public void editElement() {

      clear(By.name("firstname"));
      wd.findElement(By.name("firstname")).sendKeys("oneX");
  }

  public void selectForEditContact() {
      wd.findElement(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img")).click();
  }
}
