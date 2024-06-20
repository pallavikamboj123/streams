package com.java;

import org.junit.jupiter.api.Test;
import org.w3c.dom.Node;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ListTest {
  @Test
  void shouldGetAnEmptyList() {
    SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();

    boolean isListEmpty = list.isEmpty();

    assertTrue(isListEmpty);
  }

  @Test
  void shouldInsertDataToTheList() {
    SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();

    int sizeAfterInsertion = list.insert(5);

    assertEquals(1, sizeAfterInsertion);
  }
}
