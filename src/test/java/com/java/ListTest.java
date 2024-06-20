package com.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ListTest {
  @Test
  void shouldGetAnEmptyList() {
    SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();

    boolean isListEmpty = list.isEmpty();

    assertTrue(isListEmpty);
  }
}
