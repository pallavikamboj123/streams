package com.java;

public class IntegerList extends List<Integer> {
  public IntegerList() {
    super();
  }
  public IntegerList calculateSquare() {
    IntegerList squaredList = new IntegerList();
    Node current = this.getHead();
    while (current != null) {
      squaredList.insert((int) Math.pow(current.data, 2));
      current = current.next;
    }
    return squaredList;
  }


  public IntegerList calculateCubeValues() {
    IntegerList cubeList = new IntegerList();
    Node current = this.getHead();
    while (current != null) {
      cubeList.insert((int) Math.pow(current.data, 3));
      current = current.next;
    }
    return cubeList;
  }
}
