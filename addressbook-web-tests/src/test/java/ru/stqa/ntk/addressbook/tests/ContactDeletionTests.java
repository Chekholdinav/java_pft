package ru.stqa.ntk.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {

    @Test
    public void contactDeletionTests() {
        app.getNavigationHelper().gotoHomePage();
        app.getContactHelper().deleteContact(By.id("9")); //следующая id 14
        app.getContactHelper().selectAlertOk();
    }

}