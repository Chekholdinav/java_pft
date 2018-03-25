package ru.stqa.ntk.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.ntk.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void contactCreationTests() {
    app.getNavigationHelper().gotoContactPage();
    app.getContactHelper().nameUser(new ContactData("Hoi", "Moll", "Test", "Post", "Testov", "Kedr", "Tester", "Test1"), true);
    app.getContactHelper().contactAddressAndTelephone("Test", "TTK", "fsdfsf", "323-32-32", "8-456-456-43-34", "rew", "4334");
 // app.getContactHelper().setField("setField", "test@gr.rt");
    app.getContactHelper().dopParams();
  }

}
