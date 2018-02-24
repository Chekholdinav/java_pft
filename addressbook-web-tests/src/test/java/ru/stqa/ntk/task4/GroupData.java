package ru.stqa.ntk.task4;

public class GroupData {
  private final String firstname;
  private final String middlename;
  private final String test;
  private final String lastname;
  private final String testov;
  private final String nickname;
  private final String tester;

  public GroupData(String firstname, String middlename, String test, String lastname, String testov, String nickname, String tester) {
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
