package edu.cnm.deepdive.springwebsocket.hello;

public class HelloMessage {

  private String name;

  public HelloMessage(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
