package ru.stqa.ntk.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.ntk.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {

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

  public void nameUser(ContactData contactData, boolean creation) {
    type(By.name("firstname"), contactData.getFirstname());
    type(By.name("middlename"), contactData.getMiddlename());
    type(By.name("lastname"), contactData.getLastname());
    type(By.name("nickname"), contactData.getNickname());
    if (creation){
      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
    } else{
      Assert.assertFalse(isElementPresent(By.name("new_group")));
    }
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
    click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img"));
  }
}
