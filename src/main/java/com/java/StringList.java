package com.java;

public class StringList extends List<String> {

  public StringList convertToUpperCase() {
    StringList upperCase = new StringList();
    Node current = this.getHead();

    while(current != null) {
      upperCase.insert(current.data.toUpperCase());
      current = current.next;
    }
    return upperCase;
  }

  public StringList convertToLowerCase() {
    StringList lowerCase = new StringList();
    Node current = this.getHead();

    while(current != null) {
      lowerCase.insert(current.data.toLowerCase());
      current = current.next;
    }
    return lowerCase;
  }

  public StringList getThreeLengthValues() {
    StringList newList = new StringList();
    Node current = this.getHead();

    while(current != null) {
      if(current.data.length() == 3)
        newList.insert(current.data);
      current = current.next;
    }
    return newList;
  }

  public IntegerList getStringLength() {
    IntegerList newList = new IntegerList();
    Node current = this.getHead();

    while(current != null) {
      newList.insert(current.data.length());
      current = current.next;
    }
    return newList;
  }

  public int getStringLengthSum() {
    IntegerList newList = new IntegerList();
    Node current = this.getHead();

    while(current != null) {
      newList.insert(current.data.length());
      current = current.next;
    }

    return newList.getSum();
  }

  public String concatStringList() {
    StringBuilder result = new StringBuilder();
    Node current = this.getHead();

    while(current != null) {
      result.append(current.data);
      if(current.next != null)
        result.append(" ");
      current = current.next;
    }

    return result.toString();
  }

  public String concatFirstCharStringList() {
    StringBuilder result = new StringBuilder();
    Node current = this.getHead();

    while(current != null) {
      result.append(current.data.charAt(0));
      current = current.next;
    }
    return result.toString();
  }
}
