package ru.stqa.ntk.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.ntk.addressbook.model.AddressBookData;

public class ContactModificationTests extends TestBase {

  @Test
  public void contactModificationTests(){
    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().selectForEditContact();
    app.getContactHelper().editElement();
    app.getContactHelper().buttonUpdate();

 //   app.getContactHelper().selectContact();
  //  app.getContactHelper().selectAndClearElement();
  //  app.getContactHelper().editElement("Test2");
  //  app.getContactHelper().lastAction();
/*
    firstAction();
    selectContact();
    selectAndClearElement();
    editElement("Test2");
    lastAction();


    selectForEditContact();
        editElement("firstname");
        buttonUpdate();
*/
    // wd.findElement(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img")).click();

  }

}
