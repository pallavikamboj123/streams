package com.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IntegerListTest {
  @Test
  void shouldGetAnEmptyList() {
    IntegerList list = new IntegerList();

    boolean isListEmpty = list.isEmpty();

    assertTrue(isListEmpty);
  }

  @Test
  void shouldInsertDataToTheList() {
    IntegerList list = new IntegerList();

    list.insert(5);

    assertEquals(1, list.getLength());
  }

  @Test
  void shouldInsertDataToTheLast() {
    IntegerList list = new IntegerList();

    list.insert(5);
    list.insert(10);

    assertEquals(2, list.getLength());
    assertEquals(5, list.getData(0));
    assertEquals(10, list.getData(1));
  }

  @Test
  void shouldGetSquareValuesOfList() {
    IntegerList list = new IntegerList();
    IntegerList expected = new IntegerList();

    list.insert(5);
    list.insert(2);
    list.insert(4);

    expected.insert(25);
    expected.insert(4);
    expected.insert(16);


    List<Integer> actual = list.calculatePower(2);

    assertTrue(actual.isEquals(expected));
  }

  @Test
  void shouldGetCubeValuesOfList() {
    IntegerList list = new IntegerList();
    IntegerList expected = new IntegerList();

    list.insert(5);
    list.insert(2);
    list.insert(4);

    expected.insert(125);
    expected.insert(8);
    expected.insert(64);


    List<Integer> actual = list.calculatePower(3);

    assertTrue(actual.isEquals(expected));
  }

  @Test
  void shouldGetOnlyOddValuesOfList() {
    IntegerList list = new IntegerList();
    IntegerList expected = new IntegerList();

    list.insert(5);
    list.insert(2);
    list.insert(1);

    expected.insert(5);
    expected.insert(1);

    List<Integer> actual = list.getOddValues();

    assertTrue(actual.isEquals(expected));
  }

  @Test
  void shouldGetOnlyEvenValuesOfList() {
    IntegerList list = new IntegerList();
    IntegerList expected = new IntegerList();

    list.insert(5);
    list.insert(2);
    list.insert(1);

    expected.insert(2);

    List<Integer> actual = list.getEvenValues();

    assertTrue(actual.isEquals(expected));
  }

  @Test
  void shouldGetSumOfAllListValues() {
    IntegerList list = new IntegerList();

    list.insert(5);
    list.insert(2);
    list.insert(1);


    int actual = list.getSum();

    assertEquals(8, actual);
  }

  @Test
  void shouldGetMinimumValueFromTheList() {
    IntegerList list = new IntegerList();


    list.insert(5);
    list.insert(2);
    list.insert(1);


    int actual = list.getMinimumValue();

    assertEquals(1, actual);
  }

  @Test
  void shouldGetMaxValueFromTheList() {
    IntegerList list = new IntegerList();

    list.insert(5);
    list.insert(2);
    list.insert(1);


    int actual = list.getMaximumValue();

    assertEquals(5, actual);
  }
}
