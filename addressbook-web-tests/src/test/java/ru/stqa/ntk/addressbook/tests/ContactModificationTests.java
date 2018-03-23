package ru.stqa.ntk.addressbook.tests;

import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {

  @Test
  public void contactModificationTests() {
    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().selectForEditContact();
    app.getContactHelper().editElement();
    app.getContactHelper().buttonUpdate();
  }

}
