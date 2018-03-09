package ru.stqa.ntk.task4.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ContactDeletionTests extends TestsBase {

    @Test
    public void contactDeletionTests() {
        appli.getNavigationHelper().gotoHome();
        appli.getContactHelper().deleteContact(By.id("13")); //следующая id 12
        appli.getContactHelper().selectAlertOk();
    }

}
