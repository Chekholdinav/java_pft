package ru.stqa.ntk.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.ntk.addressbook.model.AddressBookData;
import ru.stqa.ntk.task4.tests.TestsBase;

public class ContactCreationTests extends TestBase {

  @Test
  public void contactCreationTests() {
    app.getNavigationHelper().gotoContactPage();


    app.getContactHelper().nameUser(new AddressBookData("firstname", "middlename", "Test", "lastname", "Testov", "nickname", "Tester"));
    app.getContactHelper().contactAddressAndTelephone("Test", "TTK", "fsdfsf", "323-32-32", "8-456-456-43-34", "rew", "4334");
 //   app.getContactHelper().setField("setField", "test@gr.rt");
    app.getContactHelper().dopParams();
  }

}
