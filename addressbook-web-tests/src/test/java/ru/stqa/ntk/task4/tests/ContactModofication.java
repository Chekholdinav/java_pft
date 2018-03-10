package ru.stqa.ntk.task4.tests;

import org.testng.annotations.Test;

public class ContactModoficationTests extends TestsBase{

  @Test
  public void contactModificationTests(){
    appli.getNavigationHelper().gotoHome();
    wd.findElement(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img")).click();



  }

}
