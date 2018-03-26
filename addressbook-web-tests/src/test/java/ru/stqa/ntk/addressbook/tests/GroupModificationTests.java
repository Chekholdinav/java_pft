package ru.stqa.ntk.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.ntk.addressbook.model.GroupData;

public class GroupModificationTests extends TestBase {
  @Test
  public void groupModificationTests() {
    app.getNavigationHelper().gotoGroupPage();
    if (!app.getGroupHelper().isThereAGroup()) {
      app.getGroupHelper().createGroup(new GroupData("test1", null, "test3"));
    }
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", "test4"));
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returnToGroupPage();
  }
}
