package ru.stqa.ntk.task4.tests;

import org.testng.annotations.Test;
import ru.stqa.ntk.task4.model.GroupData;

public class ContactCreationTests extends TestsBase {

  @Test
  public void contactCreationTests() {
    appli.getContactHelper().nameUser(new GroupData("firstname", "middlename", "Test", "lastname", "Testov", "nickname", "Tester"));
    appli.getContactHelper().contactAddressAndTelephone("Test", "TTK", "fsdfsf", "323-32-32", "8-456-456-43-34", "rew", "4334");
    appli.getContactHelper().email("email", "test@gr.rt");
    appli.getContactHelper().dopParams();
  }

}
