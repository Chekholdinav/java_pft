package ru.stqa.ntk.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.ntk.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

  @Test
  public void contactModificationTests() {
    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().selectForEditContact();
    app.getContactHelper().nameUser(new ContactData("Hoi","Lou","","Fox","","Sidr","",""), false);
    app.getContactHelper().buttonUpdate();
  }

}
