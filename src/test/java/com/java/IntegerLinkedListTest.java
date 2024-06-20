package com.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IntegerLinkedListTest {
  @Test
  void shouldGetAnEmptyList() {
    IntegerLinkedList list = new IntegerLinkedList();

    boolean isListEmpty = list.isEmpty();

    assertTrue(isListEmpty);
  }

  @Test
  void shouldInsertDataToTheList() {
    IntegerLinkedList list = new IntegerLinkedList();

    int sizeAfterInsertion = list.insert(5);

    assertEquals(1, sizeAfterInsertion);
  }

  @Test
  void shouldInsertDataToTheLast() {
    IntegerLinkedList list = new IntegerLinkedList();

    list.insert(5);
    int sizeAfterInsertion = list.insert(10);

    assertEquals(2, sizeAfterInsertion);
  }
}
