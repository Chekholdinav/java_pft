package ru.stqa.ntk.task4.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.ntk.task4.appmanag.ApplicationManagers;

public class TestsBase {

  protected final ApplicationManagers appli = new ApplicationManagers();

  @BeforeMethod
  public void setUp() throws Exception {
    appli.init();
  }

  @AfterMethod
  public void tearDown() {
    appli.stop();
  }

 // public ApplicationManagers getAppli() {
  //  return appli;
  //}
}
