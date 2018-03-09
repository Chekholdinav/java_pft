package ru.stqa.ntk.task4;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestsBase {

  @Test
  public void contactCreationTests() {
    nameUser(new GroupData("firstname", "middlename", "Test", "lastname", "Testov", "nickname", "Tester"));
    contactAddressAndTelephone("Test", "TTK", "fsdfsf", "323-32-32", "8-456-456-43-34", "rew", "4334");
    email("email", "test@gr.rt");
    dopParams();
  }

}
