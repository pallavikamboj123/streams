package com.java;

import static java.util.Collections.min;

public class IntegerList extends List<Integer> {
  public IntegerList() {
    super();
  }

  public IntegerList calculateSquare() {
    IntegerList squaredValues = new IntegerList();
    Node current = this.getHead();
    while (current != null) {
      squaredValues.insert((int) Math.pow(current.data, 2));
      current = current.next;
    }
    return squaredValues;
  }


  public IntegerList calculateCubeValues() {
    IntegerList cubeValues = new IntegerList();
    Node current = this.getHead();
    while (current != null) {
      cubeValues.insert((int) Math.pow(current.data, 3));
      current = current.next;
    }
    return cubeValues;
  }

  public IntegerList getOddValues() {
    IntegerList oddValues = new IntegerList();
    Node current = this.getHead();
    while (current != null) {
      if (current.data % 2 != 0) {
        oddValues.insert(current.data);
      }
      current = current.next;
    }
    return oddValues;
  }

  public IntegerList getEvenValues() {
    IntegerList evenValues = new IntegerList();
    Node current = this.getHead();
    while (current != null) {
      if (current.data % 2 == 0) {
        evenValues.insert(current.data);
      }
      current = current.next;
    }
    return evenValues;
  }

  public int getSum() {
    int sum = 0;
    Node current = this.getHead();
    while (current != null) {
      sum = sum + current.data;
      current = current.next;
    }
    return sum;
  }

  public int getMinimumValue() {
    int minValue = Integer.MAX_VALUE;
    Node current = this.getHead();
    while (current != null) {
      if(current.data < minValue) minValue = current.data;
      current = current.next;
    }
    return minValue;
  }

  public int getMaximumValue() {
    int maxValue = Integer.MIN_VALUE;
    Node current = this.getHead();
    while (current != null) {
      if(current.data > maxValue) maxValue = current.data;
      current = current.next;
    }
    return maxValue;
  }
}
