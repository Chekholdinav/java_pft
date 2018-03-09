package ru.stqa.ntk.task4.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ContactDeletionTests extends TestsBase {

    @Test
    public void contactDeletionTests() {
        appli.gotoHome();
        appli.selectContact(By.id("11")); //следующая id 12
        appli.selectAlertOk();
    }

}
