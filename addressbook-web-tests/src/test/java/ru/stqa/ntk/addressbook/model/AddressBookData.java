package ru.stqa.ntk.addressbook.model;

public class AddressBookData {
  public final String firstname;
  public final String middlename;
  public final String test;
  public final String lastname;
  public final String testov;
  public final String nickname;
  public final String tester;

  public AddressBookData(String firstname, String middlename, String test, String lastname, String testov, String nickname, String tester) {
    this.firstname = firstname;
    this.middlename = middlename;
    this.test = test;
    this.lastname = lastname;
    this.testov = testov;
    this.nickname = nickname;
    this.tester = tester;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getMiddlename() {
    return middlename;
  }

  public String getTest() {
    return test;
  }

  public String getLastname() {
    return lastname;
  }

  public String getTestov() {
    return testov;
  }

  public String getNickname() {
    return nickname;
  }

  public String getTester() {
    return tester;
  }
}
