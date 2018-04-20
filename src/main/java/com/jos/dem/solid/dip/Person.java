package com.jos.dem.solid.dip;

public class Person {

  private String nickname;

  public Person(String nickname){
    this.nickname = nickname;
  }

  public String getNickname(){
    return this.nickname;
  }

}